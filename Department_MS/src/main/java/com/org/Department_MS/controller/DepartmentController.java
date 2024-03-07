package com.org.Department_MS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.Department_MS.entity.request.DepartmentRequest;
import com.org.Department_MS.response.DepartmentResponse;
import com.org.Department_MS.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController 
{
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/save")
	public ResponseEntity<DepartmentResponse> addDepartment(@RequestBody DepartmentRequest departmentRequest)
	{
		DepartmentResponse departmentResponse = departmentService.saveDepartment(departmentRequest);
		return new ResponseEntity<DepartmentResponse>(departmentResponse,HttpStatus.CREATED);
	}
	
	@GetMapping("/get/{deptId}")
	public ResponseEntity<DepartmentResponse> getDepartment(@PathVariable Long deptId)
	{
		DepartmentResponse departmentResponse = departmentService.getDepartmentById(deptId);
		return new ResponseEntity<DepartmentResponse>(departmentResponse,HttpStatus.CREATED);
	}
}
