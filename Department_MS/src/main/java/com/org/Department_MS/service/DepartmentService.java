package com.org.Department_MS.service;

import com.org.Department_MS.entity.request.DepartmentRequest;
import com.org.Department_MS.response.DepartmentResponse;

public interface DepartmentService 
{
	public DepartmentResponse saveDepartment(DepartmentRequest departmentRequest);
	
	public DepartmentResponse getDepartmentById(Long deptId);
}
