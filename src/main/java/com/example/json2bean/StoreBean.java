/* Copyright 2017 freecodeformat.com */
package com.example.json2bean;
import java.util.Date;
import java.util.List;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties({"@version", "@timestamp"})
public class StoreBean {

    private String path;
    private String host;
    @JsonProperty("st_num")
    private String stNum;
    @JsonProperty("is_dev_ind")
    private String isDevInd;
    private String storenumberpadding;
    @JsonProperty("st_addr")
    private String stAddr;
    @JsonProperty("st_addr2")
    private String stAddr2;
    @JsonProperty("st_city")
    private String stCity;
    @JsonProperty("st_state")
    private String stState;
    @JsonProperty("st_zip")
    private String stZip;
    private String country;
    private String location;
    @JsonProperty("st_store_area_cd")
    private String stStoreAreaCd;
    @JsonProperty("st_store_phone_num")
    private String stStorePhoneNum;
    @JsonProperty("t_phrm_area_cd")
    private String tPhrmAreaCd;
    @JsonProperty("st_phrm_phone_num")
    private String stPhrmPhoneNum;
    private String rxstoretimeflag;
    @JsonProperty("rx_dept_cd")
    private String rxDeptCd;
    private String t4hr;
    @JsonProperty("t4hr_rx")
    private String t4hrRx;
    @JsonProperty("st_digital_photo_pickup_ind")
    private String stDigitalPhotoPickupInd;
    private String wp;
    private String dt;
    private String phi;
    private String tc;
    @JsonProperty("st_digital_photo_internet_ind")
    private String stDigitalPhotoInternetInd;
    private String cdr;
    private String cpge;
    private String rb;
    private String hht;
    @JsonProperty("rx_service_cd")
    private String rxServiceCd;
    private String rxservicecode;
    @JsonProperty("compounding_ind")
    private String compoundingInd;
    @JsonProperty("photoinkjetrefill_indicator")
    private String photoinkjetrefillIndicator;
    private String fs;
    private String ipn;
    private String iwc;
    private String itd;
    private String imn;
    private String icp;
    private String ihb;
    private String iha;
    private String ihc;
    private String sv;
    private String ihpv;
    private String immr;
    private String ije;
    private String ipol;
    private String irb;
    private String ity;
    private String iyf;
    private String evc;
    private String diabetesind;
    @JsonProperty("thsv_ind")
    private String thsvInd;
    private String b340;
    @JsonProperty("sdd_temp")
    private String sddTemp;
    @JsonProperty("rx_sdd_temp")
    private String rxSddTemp;
    private String sts;
    private String lbt;
    @JsonProperty("actual_available_liquor_date")
    private String actualAvailableLiquorDate;
    @JsonProperty("store_type")
    private String storeType;
    @JsonProperty("imm_cd")
    private String immCd;
    @JsonProperty("dhl_cd")
    private String dhlCd;
    @JsonProperty("beverage_fixture_cd")
    private String beverageFixtureCd;
    @JsonProperty("manager_middle_init")
    private String managerMiddleInit;
    @JsonProperty("manager_lname")
    private String managerLname;
    @JsonProperty("manager_fname")
    private String managerFname;
    @JsonProperty("manager_title")
    private String managerTitle;
    @JsonProperty("rx_manager_middle_init")
    private String rxManagerMiddleInit;
    @JsonProperty("rx_manager_lname")
    private String rxManagerLname;
    @JsonProperty("rx_manager_fname")
    private String rxManagerFname;
    @JsonProperty("rx_manager_title")
    private String rxManagerTitle;
    @JsonProperty("emergency_msg")
    private String emergencyMsg;
    @JsonProperty("emergency_cd")
    private String emergencyCd;
    @JsonProperty("non_wag_store_cd")
    private String nonWagStoreCd;
    private String photoprinterpapercompany;
    @JsonProperty("update_dttm")
    private String updateDttm;
    private String timezone;
    private String intersection;
    @JsonProperty("ss_dept_cd")
    private String ssDeptCd;
    @JsonProperty("st_bandwidth")
    private String stBandwidth;
    @JsonProperty("st_daylt_time_offset")
    private String stDayltTimeOffset;
    @JsonProperty("st_std_time_offset")
    private String stStdTimeOffset;
    @JsonProperty("st_dst")
    private String stDst;
    @JsonProperty("st_phrm_fax_area_cd")
    private String stPhrmFaxAreaCd;
    @JsonProperty("st_phrm_fax_num")
    private String stPhrmFaxNum;
    @JsonProperty("st_promotion_text")
    private String stPromotionText;
    @JsonProperty("st_di_id")
    private String stDiId;
    @JsonProperty("st_district_num")
    private String stDistrictNum;
    @JsonProperty("FedEx")
    private String fedex;
    private String bootsindicator;
    @JsonProperty("seo_url")
    private String seoUrl;
    @JsonProperty("st_location_name")
    private String stLocationName;
    @JsonProperty("st_brand_name")
    private String stBrandName;
    @JsonProperty("dp_poster_ind")
    private String dpPosterInd;
    @JsonProperty("dp_creative_ind")
    private String dpCreativeInd;
    @JsonProperty("clinic_trademark_code")
    private String clinicTrademarkCode;
    @JsonProperty("partner_display_name")
    private String partnerDisplayName;
    private String atm;
    @JsonProperty("prescription_kiosk_ind")
    private String prescriptionKioskInd;
    @JsonProperty("monday_hrs")
    private String mondayHrs;
    @JsonProperty("tuesday_hrs")
    private String tuesdayHrs;
    @JsonProperty("wednesday_hrs")
    private String wednesdayHrs;
    @JsonProperty("thursday_hrs")
    private String thursdayHrs;
    @JsonProperty("friday_hrs")
    private String fridayHrs;
    @JsonProperty("saturday_hrs")
    private String saturdayHrs;
    @JsonProperty("sunday_hrs")
    private String sundayHrs;
    @JsonProperty("wkday_same_ind")
    private String wkdaySameInd;
    @JsonProperty("boot_st_wkday_same_ind")
    private String bootStWkdaySameInd;
    @JsonProperty("boot_st_mon_hrs")
    private List<BootStMonHrs> bootStMonHrs;
    @JsonProperty("boot_st_tue_hrs")
    private List<BootStTueHrs> bootStTueHrs;
    @JsonProperty("boot_st_wed_hrs")
    private List<BootStWedHrs> bootStWedHrs;
    @JsonProperty("boot_st_thu_hrs")
    private List<BootStThuHrs> bootStThuHrs;
    @JsonProperty("boot_st_fri_hrs")
    private List<BootStFriHrs> bootStFriHrs;
    @JsonProperty("boot_st_sat_hrs")
    private List<BootStSatHrs> bootStSatHrs;
    @JsonProperty("boot_st_sun_hrs")
    private List<BootStSunHrs> bootStSunHrs;
    @JsonProperty("holiday_hrs")
    private String holidayHrs;
    @JsonProperty("partner_id")
    private String partnerId;
    @JsonProperty("partner_logo_small")
    private String partnerLogoSmall;
    @JsonProperty("partner_logo_large")
    private String partnerLogoLarge;
    @JsonProperty("partner_logo_mobile")
    private String partnerLogoMobile;
    @JsonProperty("branded_name_code")
    private String brandedNameCode;
    private String wu;
    private String mms;
    private String hhs;
    private String hiv;
    private String his;
    private String mc;
    private String hts;
    private String chhc;
    private String cb;
    private String cbw;
    private String cw;
    private String cl;
    private String tpk;
    @JsonProperty("RxDisposal")
    private String rxdisposal;
    @JsonProperty("beacon_ind")
    private String beaconInd;
    private String hos;
    @JsonProperty("optical_svc_cd")
    private String opticalSvcCd;
    @JsonProperty("lunch_hours_svc_ind")
    private String lunchHoursSvcInd;
    @JsonProperty("lunch_hours_grp_code")
    private String lunchHoursGrpCode;
    @JsonProperty("store_name")
    private String storeName;
    @JsonProperty("daylight_savings")
    private String daylightSavings;
    @JsonProperty("clinic_type_code")
    private String clinicTypeCode;
    private String beauty;
    
    public void setPath(String path) {
         this.path = path;
     }
     public String getPath() {
         return path;
     }

    public void setHost(String host) {
         this.host = host;
     }
     public String getHost() {
         return host;
     }

    public void setStNum(String stNum) {
         this.stNum = stNum;
     }
     public String getStNum() {
         return stNum;
     }

    public void setIsDevInd(String isDevInd) {
         this.isDevInd = isDevInd;
     }
     public String getIsDevInd() {
         return isDevInd;
     }

    public void setStorenumberpadding(String storenumberpadding) {
         this.storenumberpadding = storenumberpadding;
     }
     public String getStorenumberpadding() {
         return storenumberpadding;
     }

    public void setStAddr(String stAddr) {
         this.stAddr = stAddr;
     }
     public String getStAddr() {
         return stAddr;
     }

    public void setStAddr2(String stAddr2) {
         this.stAddr2 = stAddr2;
     }
     public String getStAddr2() {
         return stAddr2;
     }

    public void setStCity(String stCity) {
         this.stCity = stCity;
     }
     public String getStCity() {
         return stCity;
     }

    public void setStState(String stState) {
         this.stState = stState;
     }
     public String getStState() {
         return stState;
     }

    public void setStZip(String stZip) {
         this.stZip = stZip;
     }
     public String getStZip() {
         return stZip;
     }

    public void setCountry(String country) {
         this.country = country;
     }
     public String getCountry() {
         return country;
     }

    public void setLocation(String location) {
         this.location = location;
     }
     public String getLocation() {
         return location;
     }

    public void setStStoreAreaCd(String stStoreAreaCd) {
         this.stStoreAreaCd = stStoreAreaCd;
     }
     public String getStStoreAreaCd() {
         return stStoreAreaCd;
     }

    public void setStStorePhoneNum(String stStorePhoneNum) {
         this.stStorePhoneNum = stStorePhoneNum;
     }
     public String getStStorePhoneNum() {
         return stStorePhoneNum;
     }

    public void setTPhrmAreaCd(String tPhrmAreaCd) {
         this.tPhrmAreaCd = tPhrmAreaCd;
     }
     public String getTPhrmAreaCd() {
         return tPhrmAreaCd;
     }

    public void setStPhrmPhoneNum(String stPhrmPhoneNum) {
         this.stPhrmPhoneNum = stPhrmPhoneNum;
     }
     public String getStPhrmPhoneNum() {
         return stPhrmPhoneNum;
     }

    public void setRxstoretimeflag(String rxstoretimeflag) {
         this.rxstoretimeflag = rxstoretimeflag;
     }
     public String getRxstoretimeflag() {
         return rxstoretimeflag;
     }

    public void setRxDeptCd(String rxDeptCd) {
         this.rxDeptCd = rxDeptCd;
     }
     public String getRxDeptCd() {
         return rxDeptCd;
     }

    public void setT4hr(String t4hr) {
         this.t4hr = t4hr;
     }
     public String getT4hr() {
         return t4hr;
     }

    public void setT4hrRx(String t4hrRx) {
         this.t4hrRx = t4hrRx;
     }
     public String getT4hrRx() {
         return t4hrRx;
     }

    public void setStDigitalPhotoPickupInd(String stDigitalPhotoPickupInd) {
         this.stDigitalPhotoPickupInd = stDigitalPhotoPickupInd;
     }
     public String getStDigitalPhotoPickupInd() {
         return stDigitalPhotoPickupInd;
     }

    public void setWp(String wp) {
         this.wp = wp;
     }
     public String getWp() {
         return wp;
     }

    public void setDt(String dt) {
         this.dt = dt;
     }
     public String getDt() {
         return dt;
     }

    public void setPhi(String phi) {
         this.phi = phi;
     }
     public String getPhi() {
         return phi;
     }

    public void setTc(String tc) {
         this.tc = tc;
     }
     public String getTc() {
         return tc;
     }

    public void setStDigitalPhotoInternetInd(String stDigitalPhotoInternetInd) {
         this.stDigitalPhotoInternetInd = stDigitalPhotoInternetInd;
     }
     public String getStDigitalPhotoInternetInd() {
         return stDigitalPhotoInternetInd;
     }

    public void setCdr(String cdr) {
         this.cdr = cdr;
     }
     public String getCdr() {
         return cdr;
     }

    public void setCpge(String cpge) {
         this.cpge = cpge;
     }
     public String getCpge() {
         return cpge;
     }

    public void setRb(String rb) {
         this.rb = rb;
     }
     public String getRb() {
         return rb;
     }

    public void setHht(String hht) {
         this.hht = hht;
     }
     public String getHht() {
         return hht;
     }

    public void setRxServiceCd(String rxServiceCd) {
         this.rxServiceCd = rxServiceCd;
     }
     public String getRxServiceCd() {
         return rxServiceCd;
     }

    public void setRxservicecode(String rxservicecode) {
         this.rxservicecode = rxservicecode;
     }
     public String getRxservicecode() {
         return rxservicecode;
     }

    public void setCompoundingInd(String compoundingInd) {
         this.compoundingInd = compoundingInd;
     }
     public String getCompoundingInd() {
         return compoundingInd;
     }

    public void setPhotoinkjetrefillIndicator(String photoinkjetrefillIndicator) {
         this.photoinkjetrefillIndicator = photoinkjetrefillIndicator;
     }
     public String getPhotoinkjetrefillIndicator() {
         return photoinkjetrefillIndicator;
     }

    public void setFs(String fs) {
         this.fs = fs;
     }
     public String getFs() {
         return fs;
     }

    public void setIpn(String ipn) {
         this.ipn = ipn;
     }
     public String getIpn() {
         return ipn;
     }

    public void setIwc(String iwc) {
         this.iwc = iwc;
     }
     public String getIwc() {
         return iwc;
     }

    public void setItd(String itd) {
         this.itd = itd;
     }
     public String getItd() {
         return itd;
     }

    public void setImn(String imn) {
         this.imn = imn;
     }
     public String getImn() {
         return imn;
     }

    public void setIcp(String icp) {
         this.icp = icp;
     }
     public String getIcp() {
         return icp;
     }

    public void setIhb(String ihb) {
         this.ihb = ihb;
     }
     public String getIhb() {
         return ihb;
     }

    public void setIha(String iha) {
         this.iha = iha;
     }
     public String getIha() {
         return iha;
     }

    public void setIhc(String ihc) {
         this.ihc = ihc;
     }
     public String getIhc() {
         return ihc;
     }

    public void setSv(String sv) {
         this.sv = sv;
     }
     public String getSv() {
         return sv;
     }

    public void setIhpv(String ihpv) {
         this.ihpv = ihpv;
     }
     public String getIhpv() {
         return ihpv;
     }

    public void setImmr(String immr) {
         this.immr = immr;
     }
     public String getImmr() {
         return immr;
     }

    public void setIje(String ije) {
         this.ije = ije;
     }
     public String getIje() {
         return ije;
     }

    public void setIpol(String ipol) {
         this.ipol = ipol;
     }
     public String getIpol() {
         return ipol;
     }

    public void setIrb(String irb) {
         this.irb = irb;
     }
     public String getIrb() {
         return irb;
     }

    public void setIty(String ity) {
         this.ity = ity;
     }
     public String getIty() {
         return ity;
     }

    public void setIyf(String iyf) {
         this.iyf = iyf;
     }
     public String getIyf() {
         return iyf;
     }

    public void setEvc(String evc) {
         this.evc = evc;
     }
     public String getEvc() {
         return evc;
     }

    public void setDiabetesind(String diabetesind) {
         this.diabetesind = diabetesind;
     }
     public String getDiabetesind() {
         return diabetesind;
     }

    public void setThsvInd(String thsvInd) {
         this.thsvInd = thsvInd;
     }
     public String getThsvInd() {
         return thsvInd;
     }

    public void setB340(String b340) {
         this.b340 = b340;
     }
     public String getB340() {
         return b340;
     }

    public void setSddTemp(String sddTemp) {
         this.sddTemp = sddTemp;
     }
     public String getSddTemp() {
         return sddTemp;
     }

    public void setRxSddTemp(String rxSddTemp) {
         this.rxSddTemp = rxSddTemp;
     }
     public String getRxSddTemp() {
         return rxSddTemp;
     }

    public void setSts(String sts) {
         this.sts = sts;
     }
     public String getSts() {
         return sts;
     }

    public void setLbt(String lbt) {
         this.lbt = lbt;
     }
     public String getLbt() {
         return lbt;
     }

    public void setActualAvailableLiquorDate(String actualAvailableLiquorDate) {
         this.actualAvailableLiquorDate = actualAvailableLiquorDate;
     }
     public String getActualAvailableLiquorDate() {
         return actualAvailableLiquorDate;
     }

    public void setStoreType(String storeType) {
         this.storeType = storeType;
     }
     public String getStoreType() {
         return storeType;
     }

    public void setImmCd(String immCd) {
         this.immCd = immCd;
     }
     public String getImmCd() {
         return immCd;
     }

    public void setDhlCd(String dhlCd) {
         this.dhlCd = dhlCd;
     }
     public String getDhlCd() {
         return dhlCd;
     }

    public void setBeverageFixtureCd(String beverageFixtureCd) {
         this.beverageFixtureCd = beverageFixtureCd;
     }
     public String getBeverageFixtureCd() {
         return beverageFixtureCd;
     }

    public void setManagerMiddleInit(String managerMiddleInit) {
         this.managerMiddleInit = managerMiddleInit;
     }
     public String getManagerMiddleInit() {
         return managerMiddleInit;
     }

    public void setManagerLname(String managerLname) {
         this.managerLname = managerLname;
     }
     public String getManagerLname() {
         return managerLname;
     }

    public void setManagerFname(String managerFname) {
         this.managerFname = managerFname;
     }
     public String getManagerFname() {
         return managerFname;
     }

    public void setManagerTitle(String managerTitle) {
         this.managerTitle = managerTitle;
     }
     public String getManagerTitle() {
         return managerTitle;
     }

    public void setRxManagerMiddleInit(String rxManagerMiddleInit) {
         this.rxManagerMiddleInit = rxManagerMiddleInit;
     }
     public String getRxManagerMiddleInit() {
         return rxManagerMiddleInit;
     }

    public void setRxManagerLname(String rxManagerLname) {
         this.rxManagerLname = rxManagerLname;
     }
     public String getRxManagerLname() {
         return rxManagerLname;
     }

    public void setRxManagerFname(String rxManagerFname) {
         this.rxManagerFname = rxManagerFname;
     }
     public String getRxManagerFname() {
         return rxManagerFname;
     }

    public void setRxManagerTitle(String rxManagerTitle) {
         this.rxManagerTitle = rxManagerTitle;
     }
     public String getRxManagerTitle() {
         return rxManagerTitle;
     }

    public void setEmergencyMsg(String emergencyMsg) {
         this.emergencyMsg = emergencyMsg;
     }
     public String getEmergencyMsg() {
         return emergencyMsg;
     }

    public void setEmergencyCd(String emergencyCd) {
         this.emergencyCd = emergencyCd;
     }
     public String getEmergencyCd() {
         return emergencyCd;
     }

    public void setNonWagStoreCd(String nonWagStoreCd) {
         this.nonWagStoreCd = nonWagStoreCd;
     }
     public String getNonWagStoreCd() {
         return nonWagStoreCd;
     }

    public void setPhotoprinterpapercompany(String photoprinterpapercompany) {
         this.photoprinterpapercompany = photoprinterpapercompany;
     }
     public String getPhotoprinterpapercompany() {
         return photoprinterpapercompany;
     }

    public void setUpdateDttm(String updateDttm) {
         this.updateDttm = updateDttm;
     }
     public String getUpdateDttm() {
         return updateDttm;
     }

    public void setTimezone(String timezone) {
         this.timezone = timezone;
     }
     public String getTimezone() {
         return timezone;
     }

    public void setIntersection(String intersection) {
         this.intersection = intersection;
     }
     public String getIntersection() {
         return intersection;
     }

    public void setSsDeptCd(String ssDeptCd) {
         this.ssDeptCd = ssDeptCd;
     }
     public String getSsDeptCd() {
         return ssDeptCd;
     }

    public void setStBandwidth(String stBandwidth) {
         this.stBandwidth = stBandwidth;
     }
     public String getStBandwidth() {
         return stBandwidth;
     }

    public void setStDayltTimeOffset(String stDayltTimeOffset) {
         this.stDayltTimeOffset = stDayltTimeOffset;
     }
     public String getStDayltTimeOffset() {
         return stDayltTimeOffset;
     }

    public void setStStdTimeOffset(String stStdTimeOffset) {
         this.stStdTimeOffset = stStdTimeOffset;
     }
     public String getStStdTimeOffset() {
         return stStdTimeOffset;
     }

    public void setStDst(String stDst) {
         this.stDst = stDst;
     }
     public String getStDst() {
         return stDst;
     }

    public void setStPhrmFaxAreaCd(String stPhrmFaxAreaCd) {
         this.stPhrmFaxAreaCd = stPhrmFaxAreaCd;
     }
     public String getStPhrmFaxAreaCd() {
         return stPhrmFaxAreaCd;
     }

    public void setStPhrmFaxNum(String stPhrmFaxNum) {
         this.stPhrmFaxNum = stPhrmFaxNum;
     }
     public String getStPhrmFaxNum() {
         return stPhrmFaxNum;
     }

    public void setStPromotionText(String stPromotionText) {
         this.stPromotionText = stPromotionText;
     }
     public String getStPromotionText() {
         return stPromotionText;
     }

    public void setStDiId(String stDiId) {
         this.stDiId = stDiId;
     }
     public String getStDiId() {
         return stDiId;
     }

    public void setStDistrictNum(String stDistrictNum) {
         this.stDistrictNum = stDistrictNum;
     }
     public String getStDistrictNum() {
         return stDistrictNum;
     }

    public void setFedex(String fedex) {
         this.fedex = fedex;
     }
     public String getFedex() {
         return fedex;
     }

    public void setBootsindicator(String bootsindicator) {
         this.bootsindicator = bootsindicator;
     }
     public String getBootsindicator() {
         return bootsindicator;
     }

    public void setSeoUrl(String seoUrl) {
         this.seoUrl = seoUrl;
     }
     public String getSeoUrl() {
         return seoUrl;
     }

    public void setStLocationName(String stLocationName) {
         this.stLocationName = stLocationName;
     }
     public String getStLocationName() {
         return stLocationName;
     }

    public void setStBrandName(String stBrandName) {
         this.stBrandName = stBrandName;
     }
     public String getStBrandName() {
         return stBrandName;
     }

    public void setDpPosterInd(String dpPosterInd) {
         this.dpPosterInd = dpPosterInd;
     }
     public String getDpPosterInd() {
         return dpPosterInd;
     }

    public void setDpCreativeInd(String dpCreativeInd) {
         this.dpCreativeInd = dpCreativeInd;
     }
     public String getDpCreativeInd() {
         return dpCreativeInd;
     }

    public void setClinicTrademarkCode(String clinicTrademarkCode) {
         this.clinicTrademarkCode = clinicTrademarkCode;
     }
     public String getClinicTrademarkCode() {
         return clinicTrademarkCode;
     }

    public void setPartnerDisplayName(String partnerDisplayName) {
         this.partnerDisplayName = partnerDisplayName;
     }
     public String getPartnerDisplayName() {
         return partnerDisplayName;
     }

    public void setAtm(String atm) {
         this.atm = atm;
     }
     public String getAtm() {
         return atm;
     }

    public void setPrescriptionKioskInd(String prescriptionKioskInd) {
         this.prescriptionKioskInd = prescriptionKioskInd;
     }
     public String getPrescriptionKioskInd() {
         return prescriptionKioskInd;
     }

    public void setMondayHrs(String mondayHrs) {
         this.mondayHrs = mondayHrs;
     }
     public String getMondayHrs() {
         return mondayHrs;
     }

    public void setTuesdayHrs(String tuesdayHrs) {
         this.tuesdayHrs = tuesdayHrs;
     }
     public String getTuesdayHrs() {
         return tuesdayHrs;
     }

    public void setWednesdayHrs(String wednesdayHrs) {
         this.wednesdayHrs = wednesdayHrs;
     }
     public String getWednesdayHrs() {
         return wednesdayHrs;
     }

    public void setThursdayHrs(String thursdayHrs) {
         this.thursdayHrs = thursdayHrs;
     }
     public String getThursdayHrs() {
         return thursdayHrs;
     }

    public void setFridayHrs(String fridayHrs) {
         this.fridayHrs = fridayHrs;
     }
     public String getFridayHrs() {
         return fridayHrs;
     }

    public void setSaturdayHrs(String saturdayHrs) {
         this.saturdayHrs = saturdayHrs;
     }
     public String getSaturdayHrs() {
         return saturdayHrs;
     }

    public void setSundayHrs(String sundayHrs) {
         this.sundayHrs = sundayHrs;
     }
     public String getSundayHrs() {
         return sundayHrs;
     }

    public void setWkdaySameInd(String wkdaySameInd) {
         this.wkdaySameInd = wkdaySameInd;
     }
     public String getWkdaySameInd() {
         return wkdaySameInd;
     }

    public void setBootStWkdaySameInd(String bootStWkdaySameInd) {
         this.bootStWkdaySameInd = bootStWkdaySameInd;
     }
     public String getBootStWkdaySameInd() {
         return bootStWkdaySameInd;
     }

    public void setBootStMonHrs(List<BootStMonHrs> bootStMonHrs) {
         this.bootStMonHrs = bootStMonHrs;
     }
     public List<BootStMonHrs> getBootStMonHrs() {
         return bootStMonHrs;
     }

    public void setBootStTueHrs(List<BootStTueHrs> bootStTueHrs) {
         this.bootStTueHrs = bootStTueHrs;
     }
     public List<BootStTueHrs> getBootStTueHrs() {
         return bootStTueHrs;
     }

    public void setBootStWedHrs(List<BootStWedHrs> bootStWedHrs) {
         this.bootStWedHrs = bootStWedHrs;
     }
     public List<BootStWedHrs> getBootStWedHrs() {
         return bootStWedHrs;
     }

    public void setBootStThuHrs(List<BootStThuHrs> bootStThuHrs) {
         this.bootStThuHrs = bootStThuHrs;
     }
     public List<BootStThuHrs> getBootStThuHrs() {
         return bootStThuHrs;
     }

    public void setBootStFriHrs(List<BootStFriHrs> bootStFriHrs) {
         this.bootStFriHrs = bootStFriHrs;
     }
     public List<BootStFriHrs> getBootStFriHrs() {
         return bootStFriHrs;
     }

    public void setBootStSatHrs(List<BootStSatHrs> bootStSatHrs) {
         this.bootStSatHrs = bootStSatHrs;
     }
     public List<BootStSatHrs> getBootStSatHrs() {
         return bootStSatHrs;
     }

    public void setBootStSunHrs(List<BootStSunHrs> bootStSunHrs) {
         this.bootStSunHrs = bootStSunHrs;
     }
     public List<BootStSunHrs> getBootStSunHrs() {
         return bootStSunHrs;
     }

    public void setHolidayHrs(String holidayHrs) {
         this.holidayHrs = holidayHrs;
     }
     public String getHolidayHrs() {
         return holidayHrs;
     }

    public void setPartnerId(String partnerId) {
         this.partnerId = partnerId;
     }
     public String getPartnerId() {
         return partnerId;
     }

    public void setPartnerLogoSmall(String partnerLogoSmall) {
         this.partnerLogoSmall = partnerLogoSmall;
     }
     public String getPartnerLogoSmall() {
         return partnerLogoSmall;
     }

    public void setPartnerLogoLarge(String partnerLogoLarge) {
         this.partnerLogoLarge = partnerLogoLarge;
     }
     public String getPartnerLogoLarge() {
         return partnerLogoLarge;
     }

    public void setPartnerLogoMobile(String partnerLogoMobile) {
         this.partnerLogoMobile = partnerLogoMobile;
     }
     public String getPartnerLogoMobile() {
         return partnerLogoMobile;
     }

    public void setBrandedNameCode(String brandedNameCode) {
         this.brandedNameCode = brandedNameCode;
     }
     public String getBrandedNameCode() {
         return brandedNameCode;
     }

    public void setWu(String wu) {
         this.wu = wu;
     }
     public String getWu() {
         return wu;
     }

    public void setMms(String mms) {
         this.mms = mms;
     }
     public String getMms() {
         return mms;
     }

    public void setHhs(String hhs) {
         this.hhs = hhs;
     }
     public String getHhs() {
         return hhs;
     }

    public void setHiv(String hiv) {
         this.hiv = hiv;
     }
     public String getHiv() {
         return hiv;
     }

    public void setHis(String his) {
         this.his = his;
     }
     public String getHis() {
         return his;
     }

    public void setMc(String mc) {
         this.mc = mc;
     }
     public String getMc() {
         return mc;
     }

    public void setHts(String hts) {
         this.hts = hts;
     }
     public String getHts() {
         return hts;
     }

    public void setChhc(String chhc) {
         this.chhc = chhc;
     }
     public String getChhc() {
         return chhc;
     }

    public void setCb(String cb) {
         this.cb = cb;
     }
     public String getCb() {
         return cb;
     }

    public void setCbw(String cbw) {
         this.cbw = cbw;
     }
     public String getCbw() {
         return cbw;
     }

    public void setCw(String cw) {
         this.cw = cw;
     }
     public String getCw() {
         return cw;
     }

    public void setCl(String cl) {
         this.cl = cl;
     }
     public String getCl() {
         return cl;
     }

    public void setTpk(String tpk) {
         this.tpk = tpk;
     }
     public String getTpk() {
         return tpk;
     }

    public void setRxdisposal(String rxdisposal) {
         this.rxdisposal = rxdisposal;
     }
     public String getRxdisposal() {
         return rxdisposal;
     }

    public void setBeaconInd(String beaconInd) {
         this.beaconInd = beaconInd;
     }
     public String getBeaconInd() {
         return beaconInd;
     }

    public void setHos(String hos) {
         this.hos = hos;
     }
     public String getHos() {
         return hos;
     }

    public void setOpticalSvcCd(String opticalSvcCd) {
         this.opticalSvcCd = opticalSvcCd;
     }
     public String getOpticalSvcCd() {
         return opticalSvcCd;
     }

    public void setLunchHoursSvcInd(String lunchHoursSvcInd) {
         this.lunchHoursSvcInd = lunchHoursSvcInd;
     }
     public String getLunchHoursSvcInd() {
         return lunchHoursSvcInd;
     }

    public void setLunchHoursGrpCode(String lunchHoursGrpCode) {
         this.lunchHoursGrpCode = lunchHoursGrpCode;
     }
     public String getLunchHoursGrpCode() {
         return lunchHoursGrpCode;
     }

    public void setStoreName(String storeName) {
         this.storeName = storeName;
     }
     public String getStoreName() {
         return storeName;
     }

    public void setDaylightSavings(String daylightSavings) {
         this.daylightSavings = daylightSavings;
     }
     public String getDaylightSavings() {
         return daylightSavings;
     }

    public void setClinicTypeCode(String clinicTypeCode) {
         this.clinicTypeCode = clinicTypeCode;
     }
     public String getClinicTypeCode() {
         return clinicTypeCode;
     }

    public void setBeauty(String beauty) {
         this.beauty = beauty;
     }
     public String getBeauty() {
         return beauty;
     }

}