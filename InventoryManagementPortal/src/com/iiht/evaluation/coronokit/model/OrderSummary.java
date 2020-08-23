package com.iiht.evaluation.coronokit.model;

import java.util.List;

public class OrderSummary {
	private VisitorKit coronaKit;
	private List<KitDetail> kitDetails;
	
	public OrderSummary() {
		// TODO Auto-generated constructor stub
	}
	
	public OrderSummary(VisitorKit coronaKit, List<KitDetail> kitDetails) {
		
		this.coronaKit = coronaKit;
		this.kitDetails = kitDetails;
	}
	public VisitorKit getCoronaKit() {
		return coronaKit;
	}
	public void setCoronaKit(VisitorKit coronaKit) {
		this.coronaKit = coronaKit;
	}
	public List<KitDetail> getKitDetails() {
		return kitDetails;
	}
	public void setKitDetails(List<KitDetail> kitDetails) {
		this.kitDetails = kitDetails;
	}
	
	
}
