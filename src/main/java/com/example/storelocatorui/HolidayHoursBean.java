package com.example.storelocatorui;

import com.google.gson.annotations.SerializedName;

public class HolidayHoursBean {

	@SerializedName(value="holiday_hours_code")
	private String holidayHoursCode;
	@SerializedName(value="store_hours_category")
	private String storeHoursCategory;
	@SerializedName(value="store_loc_type")
     private String storeLocType;
     @SerializedName(value="holiday_hours_desc")
     private String hoildayHoursDesc;
     @SerializedName(value="holiday_open_time")
     private String holidayOpenTime;
     @SerializedName(value= "holiday_close_time")
     private String holidayClsTime;
     
     @SerializedName(value= "holiday_start_date")
     private String holidayStDt;
     @SerializedName(value="holiday_end_date")
     private String holidayEndDt;
     @SerializedName(value="holiday_hrs_ind")
     private String holidayHrsInd;
     @SerializedName(value="holiday_creat_dttm")
     private String createdDtTm;
     
     @SerializedName(value="holiday_update_dttm")
     private String updateDtTm;

	public String getHolidayHoursCode() {
		return holidayHoursCode;
	}

	public void setHolidayHoursCode(String holidayHoursCode) {
		this.holidayHoursCode = holidayHoursCode;
	}

	public String getStoreHoursCategory() {
		return storeHoursCategory;
	}

	public void setStoreHoursCategory(String storeHoursCategory) {
		this.storeHoursCategory = storeHoursCategory;
	}

	public String getStoreLocType() {
		return storeLocType;
	}

	public void setStoreLocType(String storeLocType) {
		this.storeLocType = storeLocType;
	}

	public String getHoildayHoursDesc() {
		return hoildayHoursDesc;
	}

	public void setHoildayHoursDesc(String hoildayHoursDesc) {
		this.hoildayHoursDesc = hoildayHoursDesc;
	}

	public String getHolidayOpenTime() {
		return holidayOpenTime;
	}

	public void setHolidayOpenTime(String holidayOpenTime) {
		this.holidayOpenTime = holidayOpenTime;
	}

	public String getHolidayClsTime() {
		return holidayClsTime;
	}

	public void setHolidayClsTime(String holidayClsTime) {
		this.holidayClsTime = holidayClsTime;
	}

	public String getHolidayStDt() {
		return holidayStDt;
	}

	public void setHolidayStDt(String holidayStDt) {
		this.holidayStDt = holidayStDt;
	}

	public String getHolidayEndDt() {
		return holidayEndDt;
	}

	public void setHolidayEndDt(String holidayEndDt) {
		this.holidayEndDt = holidayEndDt;
	}

	public String getHolidayHrsInd() {
		return holidayHrsInd;
	}

	public void setHolidayHrsInd(String holidayHrsInd) {
		this.holidayHrsInd = holidayHrsInd;
	}

	public String getCreatedDtTm() {
		return createdDtTm;
	}

	public void setCreatedDtTm(String createdDtTm) {
		this.createdDtTm = createdDtTm;
	}

	public String getUpdateDtTm() {
		return updateDtTm;
	}

	public void setUpdateDtTm(String updateDtTm) {
		this.updateDtTm = updateDtTm;
	}
}
