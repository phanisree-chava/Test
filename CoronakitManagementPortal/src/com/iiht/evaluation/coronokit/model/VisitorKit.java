package com.iiht.evaluation.coronokit.model;

import java.time.LocalDate;

public class VisitorKit {
	
	private Integer id;
	private String personName;
	private String email;
	private String contactNumber;
	private Double totalAmount;
	private String deliveryAddress;
	private LocalDate orderDate;
	private Boolean orderFinalized;
	
	public VisitorKit() {
		// TODO Auto-generated constructor stub
	}
	
	public VisitorKit(int id, String personName, String email, String contactNumber, Double totalAmount,
			String deliveryAddress, LocalDate orderDate, boolean orderFinalized) {
		super();
		
		this.id = id;
		this.personName = personName;
		this.email = email;
		this.contactNumber = contactNumber;
		this.totalAmount = totalAmount;
		this.deliveryAddress = deliveryAddress;
		this.orderDate = orderDate;
		this.orderFinalized = orderFinalized;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public Boolean getOrderFinalized() {
		return orderFinalized;
	}

	public void setOrderFinalized(Boolean orderFinalized) {
		this.orderFinalized = orderFinalized;
	}

	@Override
	public String toString() {
		return "VisitorKit [id=" + id + ", personName=" + personName + ", email=" + email + ", contactNumber="
				+ contactNumber + ", totalAmount=" + totalAmount + ", deliveryAddress=" + deliveryAddress
				+ ", orderDate=" + orderDate + ", orderFinalized=" + orderFinalized + "]";
	}
	
	

}
