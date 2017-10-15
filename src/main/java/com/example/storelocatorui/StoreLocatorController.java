package com.example.storelocatorui;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpHost;
import org.apache.http.util.EntityUtils;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.RestClient;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.json2bean.StoreBean;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@ConfigurationProperties
public class StoreLocatorController {

	private String elasticsearchServiceHost;
	private int elasticsearchServicePort;

	@RequestMapping("/store/{id}")
	public String getStore(@PathVariable("id") String id, Model model) {

		try {
			RestClient restClient = RestClient.builder(new HttpHost(getElasticsearchServiceHost(), getElasticsearchServicePort(), "http"),
					new HttpHost(getElasticsearchServiceHost(), 9201, "http")).build();

			Response response = restClient.performRequest("GET", "/", Collections.singletonMap("pretty", "true"));
			System.out.println(EntityUtils.toString(response.getEntity()));

			response = restClient.performRequest("GET", "/store_locator/store/" + id + "/_source",
					Collections.singletonMap("pretty", "true"));
			restClient.close();

			String responseBody = EntityUtils.toString(response.getEntity());
			System.out.println(responseBody);

			// create ObjectMapper instance
			ObjectMapper objectMapper = new ObjectMapper();

			// convert json string to object
			StoreBean store = objectMapper.readValue(responseBody, StoreBean.class);

			model.addAttribute(store);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "store";
	}

	@RequestMapping("/store/search")
	public ResponseEntity<?> searchStore(@RequestParam("zipcode") String zipcode, Model model) {

		String responseBody = null;
		
		try {

			RestClient restClient = RestClient.builder(new HttpHost(getElasticsearchServiceHost(), getElasticsearchServicePort(), "http"),
					new HttpHost(getElasticsearchServiceHost(), 9201, "http")).build();

			Map<String, String> paramMap = new HashMap<String, String>();
			paramMap.put("q", "st_zip:" + zipcode);
			paramMap.put("pretty", "true");

			Response response = restClient.performRequest("GET", "/store_locator/store/_search", paramMap);
			//System.out.println(EntityUtils.toString(response.getEntity()));
			//System.out.println("Host -" + response.getHost());
			System.out.println("RequestLine -" + response.getRequestLine());

			restClient.close();

			responseBody = EntityUtils.toString(response.getEntity());
			//System.out.println(responseBody);

			
//			// create ObjectMapper instance
//			ObjectMapper objectMapper = new ObjectMapper();
//
//			// convert json string to object
//			StoreBean store = objectMapper.readValue(responseBody, StoreBean.class);
//
//			model.addAttribute(store);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//return "store";
		
		return new ResponseEntity<String>(responseBody, HttpStatus.OK);
		
	}

	@RequestMapping("/healthz")
	public String healthCheck() {
		return "healthz";
	}

	public String getElasticsearchServiceHost() {
		return elasticsearchServiceHost;
	}

	public void setElasticsearchServiceHost(String elasticsearchServiceHost) {
		this.elasticsearchServiceHost = elasticsearchServiceHost;
	}

	public int getElasticsearchServicePort() {
		return elasticsearchServicePort;
	}

	public void setElasticsearchServicePort(int elasticsearchServicePort) {
		this.elasticsearchServicePort = elasticsearchServicePort;
	}
}