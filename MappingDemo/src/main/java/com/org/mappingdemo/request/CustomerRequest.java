package com.org.mappingdemo.request;

import java.util.List;

public class CustomerRequest 
{
	private String customerName;
	private String contactNo;
	private List<OrderRequest> orders;
	
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
	public List<OrderRequest> getOrders() {
		return orders;
	}
	public void setOrders(List<OrderRequest> orders) {
		this.orders = orders;
	}	
}