/*
* (c) Walgreen Co.  All rights reserved
*/
package com.example.storelocatorui;


import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.gson.annotations.SerializedName;

/**
 *
 *
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties({"@version", "@timestamp", "host", "path", "storeTimeOffset", "street", "dayltTimeOffset", "dppi", "ssDeptCd", "intersection", "phrmPhoneNum", "storeName", "storeAreaCd", "dt", "state", "rx24hr", "districtNum", "labTestingInd", "zip", "managerTitle", "dpii", "emergencyMsg", "nonWagStoreCd", "storePhoneNum", "liqDeptCd", "storeType", "phrmFaxNum", "rxManagerFName", "storeHoursCategory", "photoInd", "rxManagerLName", "emergencyCd", "lunchHrsGrpCode", "isDevInd", "inkjeti", "phrmFaxAreaCd", "healthClinicInd", "lunchHrsSvcInd", "locationName", "phrmAreaCd", "managerFName", "storeNum", "holidayHoursBean", "managerLName", "city", "rxDeptCd", "prescriptionKioskInd", "timezone", "storeDayLtTimeOffset", "rxManagerTitle", "twentyFourHr", "rxManagerMiddleInit", "county", "managerMiddleInit", "storePhotoStatusCd", "formattedIntersection"})
public class StoreInfoBean {

    @SerializedName(value="st_num")
    private String storeNum;
    private String storeAreaCd;
    @SerializedName(value="st_store_phone_num")
    private String storePhoneNum;
    @SerializedName(value="t_phrm_area_cd")
    private String phrmAreaCd;
    @SerializedName(value="st_phrm_phone_num")
    private String phrmPhoneNum;
    @SerializedName(value="st_phrm_fax_area_cd")
    private String phrmFaxAreaCd;
    @SerializedName(value="st_phrm_fax_num")
    private String phrmFaxNum;
    @SerializedName(value="st_addr")
    private String street;
    @SerializedName(value="st_city")
    private String city;
    @SerializedName(value="st_state")
    private String state;
    @SerializedName(value="st_zip")
    private String zip;
    private String dt;
    @SerializedName(value="t4hr")
    private String twentyFourHr;
    @SerializedName(value="t4hr_rx")
    private String rx24hr;
    private String dppi;
    private String dpii;
    private String inkjeti;
    private String intersection;
    @SerializedName(value="timezone")
    private String timezone;
    @SerializedName(value="emergency_cd")
    private String emergencyCd;
    @SerializedName(value="store_hours_category")
	private String storeHoursCategory;
    @SerializedName(value="st_daylt_time_offset")
	private String storeDayLtTimeOffset;
    @SerializedName(value="holiday_hrs")
	private List<HolidayHoursBean> holidayHoursBean;
    @SerializedName(value="st_std_time_offset")
	private String storeTimeOffset;
    @SerializedName(value="emergency_msg")
    private String emergencyMsg;
    @SerializedName(value="non_wag_store_cd")
    private String nonWagStoreCd;
    private String districtNum;
    @SerializedName(value="rx_manager_title")
    private String rxManagerTitle;
    @SerializedName(value="rx_manager_fname")
    private String rxManagerFName;
    @SerializedName(value="rx_manager_lname")
    private String rxManagerLName;
    @SerializedName(value="rx_manager_middle_init")
    private String rxManagerMiddleInit;
    @SerializedName(value="manager_title")
    private String managerTitle;
    @SerializedName(value="manager_fname")
    private String managerFName;
    @SerializedName(value="manager_lname")
    private String managerLName;
    @SerializedName(value="manager_middle_init")
    private String managerMiddleInit;
    @SerializedName(value="cbw")
    private String liqDeptCd;
    @SerializedName(value="ss_dept_cd")
    private String ssDeptCd;
    @SerializedName(value="rx_dept_cd")
    private String rxDeptCd;
    private String storePhotoStatusCd;
    @SerializedName(value="is_dev_ind")
    private String isDevInd;
    @SerializedName(value="country")
    private String county;
	@SerializedName(value="store_name")
    private String storeName;
    
    @SerializedName(value="prescription_kiosk_ind")
    private String prescriptionKioskInd;
    
    @SerializedName(value="lunch_hours_svc_ind")
    private String lunchHrsSvcInd;
    
    @SerializedName(value="lunch_hours_grp_code")
    private String lunchHrsGrpCode;
    
    private String formattedIntersection = "";

    public StoreInfoBean() {
    	formattedIntersection = getIntersection();
    	String result = null;
    	if (formattedIntersection != null) {
    		result = replaceWord(formattedIntersection, StoreSearchConstants.SEC, StoreSearchConstants.SOUTHEAST_CORNER);
    		if (formattedIntersection.equalsIgnoreCase(result)) {
    			result = replaceWord(formattedIntersection, StoreSearchConstants.SWC, StoreSearchConstants.SOUTHWEST_CORNER);
    			if (formattedIntersection.equalsIgnoreCase(result)) {
    				result = replaceWord(formattedIntersection, StoreSearchConstants.NEC,StoreSearchConstants.NORTHEAST_CORNER);
    				if (formattedIntersection.equalsIgnoreCase(result)) {
    					result = replaceWord(formattedIntersection, StoreSearchConstants.NWC,StoreSearchConstants.NORTHWEST_CORNER);
    				}
    			}
    		}
    	}
    	formattedIntersection = result;
    }
    

	 public String getCounty() {
			return county;
		}
		public void setCounty(String county) {
			this.county = county;
		}
		public String getStoreName() {
			return storeName;
		}
		public void setStoreName(String storeName) {
			this.storeName = storeName;
		}

    public String getIsDevInd() {
        return isDevInd;
    }
    public void setIsDevInd(String isDevInd) {
        this.isDevInd = isDevInd;
    }
      private String dayltTimeOffset; // daylt time offset in hours
    @SerializedName(value="tc")
    private String healthClinicInd;
      @SerializedName(value="store_type")
      private String storeType;
	public String getPhotoInd() {
		return photoInd;
	}
	public void setPhotoInd(String photoInd) {
		this.photoInd = photoInd;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	@SerializedName(value="phi")
	private String photoInd;
    @SerializedName(value="location")
    private String locationName;
    // theranos Indicator for generic store locator
    @SerializedName(value = "lbt")
    private String labTestingInd;
    public String getLabTestingInd() {
		return labTestingInd;
	}
	public void setLabTestingInd(String labTestingInd) {
		this.labTestingInd = labTestingInd;
	}
	//end:BAS-24086 Modify the Store Search service to include the theranos Indicator for generic store locator

    public String getCity() {
	return city;
    }
    public void setCity(String city) {
	//EHF-545 Revise subheaders of Store Details page
	if(city != null && !StringUtils.isEmpty(city)){
	    String[] text = city.split(StoreSearchConstants.EMPTY_STRING);
	    StringBuilder cityTemp = new StringBuilder();
	    for(String temp : text){
		//EO-23339/PR-2611 Check for extra space in "City" name
		if(!temp.isEmpty()){
		city = temp.substring(0, 1).toUpperCase()
			.concat(temp.substring(1, temp.length()).toLowerCase());
		cityTemp.append(StoreSearchConstants.EMPTY_STRING).append(city);
		}
	    }
	    this.city = cityTemp.toString();
		}else{
		    this.city = city;
		}
    }

    public String getDayltTimeOffset() {
	return dayltTimeOffset;
    }
    public void setDayltTimeOffset(String dayltTimeOffset) {
	this.dayltTimeOffset = dayltTimeOffset;
    }

    public String getDistrictNum() {
	return districtNum;
    }
    public void setDistrictNum(String districtNum) {
	this.districtNum = districtNum;
    }

    public String getDpii() {
	return dpii;
    }
    public void setDpii(String dpii) {
	this.dpii = dpii;
    }

    public String getDppi() {
	return dppi;
    }
    public void setDppi(String dppi) {
	this.dppi = dppi;
    }

    public String getDt() {
	return dt;
    }
    public void setDt(String dt) {
	this.dt = dt;
    }

    public String getEmergencyCd() {
	return emergencyCd;
    }
    public void setEmergencyCd(String emergencyCd) {
	this.emergencyCd = emergencyCd;
    }

    public String getEmergencyMsg() {
	return emergencyMsg;
    }
    public void setEmergencyMsg(String emergencyMsg) {
	this.emergencyMsg = emergencyMsg;
    }

    public String getInkjeti() {
	return inkjeti;
    }
    public void setInkjeti(String inkjeti) {
	this.inkjeti = inkjeti;
    }

    public String getIntersection() {
	return intersection;
    }
    public void setIntersection(String intersection) {
	this.intersection = intersection;
    }

    public String getLiqDeptCd() {
	return liqDeptCd;
    }
    public void setLiqDeptCd(String liqDeptCd) {
	this.liqDeptCd = liqDeptCd;
    }


    public String getManagerFName() {
	return managerFName;
    }
    public void setManagerFName(String managerFName) {
	this.managerFName = managerFName;
    }

    public String getManagerLName() {
	return managerLName;
    }
    public void setManagerLName(String managerLName) {
	this.managerLName = managerLName;
    }

    public String getManagerMiddleInit() {
	return managerMiddleInit;
    }
    public void setManagerMiddleInit(String managerMiddleInit) {
	this.managerMiddleInit = managerMiddleInit;
    }

    public String getManagerTitle() {
	return managerTitle;
    }
    public void setManagerTitle(String managerTitle) {
	this.managerTitle = managerTitle;
    }

    public String getNonWagStoreCd() {
	return nonWagStoreCd;
    }
    public void setNonWagStoreCd(String nonWagStoreCd) {
	this.nonWagStoreCd = nonWagStoreCd;
    }

    public String getPhrmAreaCd() {
	return phrmAreaCd;
    }
    public void setPhrmAreaCd(String phrmAreaCd) {
	this.phrmAreaCd = phrmAreaCd;
    }

    public String getPhrmPhoneNum() {
	return phrmPhoneNum;
    }
    public void setPhrmPhoneNum(String phrmPhoneNum) {
	this.phrmPhoneNum = phrmPhoneNum;
    }

    public String getRx24hr() {
	return rx24hr;
    }
    public void setRx24hr(String rx24hr) {
	this.rx24hr = rx24hr;
    }

    public String getRxDeptCd() {
	return rxDeptCd;
    }
    public void setRxDeptCd(String rxDeptCd) {
	this.rxDeptCd = rxDeptCd;
    }

    public String getRxManagerFName() {
	return rxManagerFName;
    }
    public void setRxManagerFName(String rxManagerFName) {
	this.rxManagerFName = rxManagerFName;
    }

    public String getRxManagerLName() {
	return rxManagerLName;
    }
    public void setRxManagerLName(String rxManagerLName) {
	this.rxManagerLName = rxManagerLName;
    }

    public String getRxManagerMiddleInit() {
	return rxManagerMiddleInit;
    }
    public void setRxManagerMiddleInit(String rxManagerMiddleInit) {
	this.rxManagerMiddleInit = rxManagerMiddleInit;
    }

    public String getRxManagerTitle() {
	return rxManagerTitle;
    }
    public void setRxManagerTitle(String rxManagerTitle) {
	this.rxManagerTitle = rxManagerTitle;
    }

    public String getSsDeptCd() {
	return ssDeptCd;
    }
    public void setSsDeptCd(String ssDeptCd) {
	this.ssDeptCd = ssDeptCd;
    }





    public String getState() {
	return state;
    }
    public void setState(String state) {
	this.state = state;
    }

    public String getStoreAreaCd() {
	return storeAreaCd;
    }
    public void setStoreAreaCd(String storeAreaCd) {
	this.storeAreaCd = storeAreaCd;
    }


    public String getStoreNum() {
	return storeNum;
    }
    public void setStoreNum(String storeNum) {
	this.storeNum = storeNum;
    }

    public String getStorePhoneNum() {
	return storePhoneNum;
    }
    public void setStorePhoneNum(String storePhoneNum) {
	this.storePhoneNum = storePhoneNum;
    }

    public String getStorePhotoStatusCd() {
	return storePhotoStatusCd;
    }
    public void setStorePhotoStatusCd(String storePhotoStatusCd) {
	this.storePhotoStatusCd = storePhotoStatusCd;
    }

    public String getStreet() {
	return street;
    }
    public void setStreet(String street) {
	this.street = street;
    }

    public String getTimezone() {
	return timezone;
    }

    public String getTwentyFourHr() {
	return twentyFourHr;
    }
    public void setTwentyFourHr(String twentyFourHr) {
	this.twentyFourHr = twentyFourHr;
    }


    public String getZip() {
	return zip;
    }
    public void setZip(String zip) {
	this.zip = zip;
    }

    public String getHealthClinicInd() {
	return healthClinicInd;
    }
    public void setHealthClinicInd(String healthClinicInd) {
	this.healthClinicInd = healthClinicInd;
    }

    public String getPhrmFaxAreaCd() {
	return phrmFaxAreaCd;
    }
    public void setPhrmFaxAreaCd(String phrmFaxAreaCd) {
	this.phrmFaxAreaCd = phrmFaxAreaCd;
    }

    public String getPhrmFaxNum() {
	return phrmFaxNum;
    }
    public void setPhrmFaxNum(String phrmFaxNum) {
	this.phrmFaxNum = phrmFaxNum;
    }

    /** E03791- Translate and dis
     *
     * @return
     */
    public String getFormattedIntersection() {
    	return formattedIntersection;
    }
    
    public void setFormattedIntersection(String formattedIntersection) {
		this.formattedIntersection = formattedIntersection;
	}
	/**
     *
     * @param original
     * @param find
     * @param replacement
     * @return
     */
    static String replaceWord(String original, String find, String replacement) {
	int i = original.indexOf(find);
	if (i < 0) {
	    return original; // return original if 'find' is not in it.
	}
	String partBefore = original.substring(0, i);
	String partAfter = original.substring(i + find.length());
	return partBefore + replacement + partAfter;
    }



    /**
     * @return the storeType
     */
    public String getStoreType() {
	return storeType;
    }
    /**
     * @param storeType the storeType to set
     */
    public void setStoreType(String storeType) {
	this.storeType = storeType;
    }
	public String getPrescriptionKioskInd() {
		return prescriptionKioskInd;
	}
	public void setPrescriptionKioskInd(String prescriptionKioskInd) {
		this.prescriptionKioskInd = prescriptionKioskInd;
	}

	
	
	public String getStoreHoursCategory() {
		return storeHoursCategory;
	}
	public void setStoreHoursCategory(String storeHoursCategory) {
		this.storeHoursCategory = storeHoursCategory;
	}
	public String getStoreDayLtTimeOffset() {
		return storeDayLtTimeOffset;
	}
	public void setStoreDayLtTimeOffset(String storeDayLtTimeOffset) {
		this.storeDayLtTimeOffset = storeDayLtTimeOffset;
	}
	public List<HolidayHoursBean> getHolidayHoursBean() {
		return holidayHoursBean;
	}
	public void setHolidayHoursBean(List<HolidayHoursBean> holidayHoursBean) {
		this.holidayHoursBean = holidayHoursBean;
	}
	public String getStoreTimeOffset() {
		return storeTimeOffset;
	}
	public void setStoreTimeOffset(String storeTimeOffset) {
		this.storeTimeOffset = storeTimeOffset;
	}
	
	public String getLunchHrsSvcInd() {
		return lunchHrsSvcInd;
	}
	public void setLunchHrsSvcInd(String lunchHrsSvcInd) {
		this.lunchHrsSvcInd = lunchHrsSvcInd;
	}
	public String getLunchHrsGrpCode() {
		return lunchHrsGrpCode;
	}
	public void setLunchHrsGrpCode(String lunchHrsGrpCode) {
		this.lunchHrsGrpCode = lunchHrsGrpCode;
	}
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
}