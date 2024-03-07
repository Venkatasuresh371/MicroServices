package com.org.mappingdemo.response;

public class OrderResponse
{
	private int orderId;
	private String oDetails;
	private int price;
	
	public OrderResponse() {
		super();
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getoDetails() {
		return oDetails;
	}

	public void setoDetails(String oDetails) {
		this.oDetails = oDetails;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "OrderResponse [orderId=" + orderId + ", oDetails=" + oDetails + ", price=" + price + "]";
	}
}
