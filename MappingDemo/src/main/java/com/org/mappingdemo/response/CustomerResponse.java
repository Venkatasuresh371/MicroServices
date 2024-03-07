package com.org.mappingdemo.response;

import java.util.List;

public class CustomerResponse 
{
	private int customerid;
	private String customerName;
	private String contactNo;
	private List<OrderResponse> orders;
	
	public CustomerResponse() {
		super();
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public List<OrderResponse> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderResponse> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "CustomerResponse [customerid=" + customerid + ", customerName=" + customerName + ", contactNo="
				+ contactNo + ", orders=" + orders + "]";
	}
}
