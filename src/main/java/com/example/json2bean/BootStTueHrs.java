package com.example.json2bean;

import com.fasterxml.jackson.annotation.*;
public class BootStTueHrs {

    @JsonProperty("open_hrs")
    private String openHrs;
    @JsonProperty("close_hrs")
    private String closeHrs;
    public void setOpenHrs(String openHrs) {
         this.openHrs = openHrs;
     }
     public String getOpenHrs() {
         return openHrs;
     }

    public void setCloseHrs(String closeHrs) {
         this.closeHrs = closeHrs;
     }
     public String getCloseHrs() {
         return closeHrs;
     }

}