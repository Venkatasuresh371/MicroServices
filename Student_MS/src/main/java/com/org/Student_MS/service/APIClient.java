package com.org.Student_MS.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.org.Student_MS.response.DepartmentResponse;

@FeignClient(value = "DEPARTMENT-SERVICE",url = "http://localhost:8081/department")
public interface APIClient
{
	@GetMapping("/get/{deptId}")
	public ResponseEntity<DepartmentResponse> getDepartment(@PathVariable Long deptId);
}
