package com.org.mappingdemo.service;

import java.util.List;

import com.org.mappingdemo.request.CustomerRequest;
import com.org.mappingdemo.response.CustomerResponse;

public interface CustomerService
{
	public CustomerResponse saveCustomer(CustomerRequest customerRequest);
	
	public List<CustomerResponse> getAllCstomers();
	
	public CustomerResponse getCustomer(int cid);
	
	public String deleteCustomer(int cid);

}
