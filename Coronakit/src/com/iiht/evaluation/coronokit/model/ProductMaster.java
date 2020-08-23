package com.iiht.evaluation.coronokit.model;





public class ProductMaster {
	private Integer id;
	private String ProductDescription;
	private String ProductName;
	private Double Cost;
	
	
	public ProductMaster() {
		// TODO Auto-generated constructor stub
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getProductDescription() {
		return ProductDescription;
	}


	public void setProductDescription(String productDescription) {
		ProductDescription = productDescription;
	}


	public String getProductName() {
		return ProductName;
	}


	public void setProductName(String productName) {
		ProductName = productName;
	}


	public Double getCost() {
		return Cost;
	}


	public void setCost(Double cost) {
		Cost = cost;
	}


	@Override
	public String toString() {
		return "ProductMaster [id=" + id + ", ProductDescription=" + ProductDescription + ", ProductName=" + ProductName
				+ ", Cost=" + Cost + "]";
	}


	
		}

	


