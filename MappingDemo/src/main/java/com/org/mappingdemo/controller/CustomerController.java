package com.org.mappingdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.mappingdemo.request.CustomerRequest;
import com.org.mappingdemo.response.CustomerResponse;
import com.org.mappingdemo.service.CustomerService;

@RestController
@RequestMapping("/mapping")
public class CustomerController 
{
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/save")
	public ResponseEntity<CustomerResponse> addCustomer(@RequestBody CustomerRequest customerReq)
	{
		CustomerResponse customerResponse = customerService.saveCustomer(customerReq);
		return new ResponseEntity<CustomerResponse>(customerResponse,HttpStatus.CREATED);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<CustomerResponse> getCustomer(@PathVariable int cid)
	{
		CustomerResponse customerResponse = customerService.getCustomer(cid);
		return new ResponseEntity<CustomerResponse>(customerResponse,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable int cid)
	{
		String string = customerService.deleteCustomer(cid);
		return new ResponseEntity<String>(string,HttpStatus.OK);
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<CustomerResponse>> getAllCustomers()
	{
		List<CustomerResponse> customerResponseList = customerService.getAllCstomers();
		return new ResponseEntity<List<CustomerResponse>>(customerResponseList,HttpStatus.OK);
	}
}
