package com.org.Department_MS.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.Department_MS.entity.Department;
import com.org.Department_MS.entity.request.DepartmentRequest;
import com.org.Department_MS.repository.DepartmentRepository;
import com.org.Department_MS.response.DepartmentResponse;
import com.org.Department_MS.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService
{

	@Autowired
	private DepartmentRepository departmentRepo;
	
	@Override
	public DepartmentResponse saveDepartment(DepartmentRequest departmentRequest)
	{
		Department department = new Department();
		department.setDeptName(departmentRequest.getDeptName());
		department.setDeptCode(departmentRequest.getDeptCode());
		department.setDeptAddress(departmentRequest.getDeptAddress());
		Department saveddepartment = departmentRepo.save(department);
		DepartmentResponse departmentResponse = constructDepartmentResponse(saveddepartment);
		return departmentResponse;
	}

	private DepartmentResponse constructDepartmentResponse(Department department)
	{
		DepartmentResponse departmentResponse = new DepartmentResponse();
		departmentResponse.setDeptId(department.getDeptId());	
		departmentResponse.setDeptName(department.getDeptName());
		departmentResponse.setDeptCode(department.getDeptCode());
		departmentResponse.setDeptAddress(department.getDeptAddress());
		return departmentResponse;
	}

	@Override
	public DepartmentResponse getDepartmentById(Long deptId)
	{
		Department department = departmentRepo.findById(deptId).get();
		DepartmentResponse departmentResponse = constructDepartmentResponse(department);
		return departmentResponse;
	}
}