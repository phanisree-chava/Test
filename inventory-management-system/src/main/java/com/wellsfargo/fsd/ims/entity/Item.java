package com.wellsfargo.fsd.ims.entity;

import java.sql.Date;
import java.time.LocalDate;

public class Item {
	
	//use only wrapper classes as they are nullable
	/*
	 * icode int primary key, title varchar(20) not null, 
	 * packageDate date not null,
	 * fragile boolean default false, unit varchar(10) not null, costprice decimal
	 * not null, sellingPrice decimal not null
	 */
	
	
	private Integer icode;
	private String title;
	private LocalDate packageDate;
	private Boolean fargile;
	private String unit;
	private Double costprice;
	private Double sellingPrice;
	
	public Item()
	{
		
	}
	
	public Item(Integer icode, String title, LocalDate packageDate, Boolean fargile, String unit, Double costprice,
			Double sellingPrice) {
		super();
		this.icode = icode;
		this.title = title;
		this.packageDate = packageDate;
		this.fargile = fargile;
		this.unit = unit;
		this.costprice = costprice;
		this.sellingPrice = sellingPrice;
	}
	public Integer getIcode() {
		return icode;
	}
	public void setIcode(Integer icode) {
		this.icode = icode;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDate getpackageDate() {
		return packageDate;
	}
	public void setpackageDate(LocalDate localDate) {
		this.packageDate = localDate;
	}
	public Boolean getFargile() {
		return fargile;
	}
	public void setFargile(Boolean fargile) {
		this.fargile = fargile;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public Double getCostprice() {
		return costprice;
	}
	public void setCostprice(Double costprice) {
		this.costprice = costprice;
	}
	public Double getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(Double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	@Override
	public String toString() {
		return "Item [icode=" + icode + ", title=" + title + ", date=" + packageDate + ", fargile=" + fargile + ", unit="
				+ unit + ", costprice=" + costprice + ", sellingPrice=" + sellingPrice + "]";
	}

	
	

	
		
	}
	
	
	
	

