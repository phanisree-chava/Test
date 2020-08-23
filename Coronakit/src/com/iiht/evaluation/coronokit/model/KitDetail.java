package com.iiht.evaluation.coronokit.model;

public class KitDetail {

	private Integer id;
	private Integer productId;
	private Double amount;
	private Integer coronaKitId;
	private Integer quantity;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Integer getCoronaKitId() {
		return coronaKitId;
	}
	public void setCoronaKitId(Integer coronaKitId) {
		this.coronaKitId = coronaKitId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public KitDetail(Integer id, Integer productId, Double amount, Integer coronaKitId, Integer quantity) {
		super();
		this.id = id;
		this.productId = productId;
		this.amount = amount;
		this.coronaKitId = coronaKitId;
		this.quantity = quantity;
	}
	public KitDetail() {
		// TODO Auto-generated constructor stub
	}
	
	public void Totalamt(Integer quantity,Double amount) {
	Double Total = this.getQuantity() *this.getAmount();
	}
	@Override
	public String toString() {
		return "KitDetail [id=" + id + ", productId=" + productId + ", amount=" + amount + ", coronaKitId="
				+ coronaKitId + ", quantity=" + quantity + "]";
	}
	
	
}