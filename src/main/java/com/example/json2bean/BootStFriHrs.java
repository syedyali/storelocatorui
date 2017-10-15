package com.example.json2bean;

import com.fasterxml.jackson.annotation.*;

/* Time: 2017-09-29 13:3:34 @author freecodeformat.com @website http://www.freecodeformat.com/json2javabean.php */
public class BootStFriHrs {

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