package com.fokeswagon.fsd.dao;

public class Enquiry {
	
	private Integer enquiryid;
	private String Customername;
	private Double mobile;
	private String vehicletype;
	private String budgetForm;
	private String Status;
	private String tobudget;
	private String frombudget;
	public Integer getEnquiryid() {
		return enquiryid;
	}
	public void setEnquiryid(Integer enquiryid) {
		this.enquiryid = enquiryid;
	}
	public String getCustomername() {
		return Customername;
	}
	public void setCustomername(String customername) {
		Customername = customername;
	}
	public Double getMobile() {
		return mobile;
	}
	public void setMobile(Double mobile) {
		this.mobile = mobile;
	}
	public String getVehicletype() {
		return vehicletype;
	}
	public void setVehicletype(String vehicletype) {
		this.vehicletype = vehicletype;
	}
	public String getBudgetForm() {
		return budgetForm;
	}
	public void setBudgetForm(String budgetForm) {
		this.budgetForm = budgetForm;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getTobudget() {
		return tobudget;
	}
	public void setTobudget(String tobudget) {
		this.tobudget = tobudget;
	}
	public String getFrombudget() {
		return frombudget;
	}
	public void setFrombudget(String frombudget) {
		this.frombudget = frombudget;
	}
	@Override
	public String toString() {
		return "Enquiry [enquiryid=" + enquiryid + ", Customername=" + Customername + ", mobile=" + mobile
				+ ", vehicletype=" + vehicletype + ", budgetForm=" + budgetForm + ", Status=" + Status + ", tobudget="
				+ tobudget + ", frombudget=" + frombudget + "]";
	}
	
	
	

}
