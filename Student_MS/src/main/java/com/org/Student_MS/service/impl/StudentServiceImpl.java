package com.org.Student_MS.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.Student_MS.entity.Student;
import com.org.Student_MS.repository.StudentRepository;
import com.org.Student_MS.request.StudentRequest;
import com.org.Student_MS.response.DepartmentResponse;
import com.org.Student_MS.response.StudentResponse;
import com.org.Student_MS.service.APIClient;
import com.org.Student_MS.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	private StudentRepository studentRepo;
	
	@Autowired
	private APIClient apiClient;
	
	@Override
	public StudentResponse saveStudent(StudentRequest stdRequest) 
	{
		Student student = new Student();
		student.setDeptId(stdRequest.getDeptId());
		student.setFirstName(stdRequest.getFirstName());
		student.setLastName(stdRequest.getLastName());
		student.setEmail(stdRequest.getEmail());
		Student savedStudent = studentRepo.save(student);
		
		DepartmentResponse departmentResponse = apiClient.getDepartment(student.getDeptId()).getBody();
		
		StudentResponse studentResponse = new StudentResponse();
		studentResponse.setStdId(savedStudent.getStdId());
		studentResponse.setFirstName(savedStudent.getFirstName());
		studentResponse.setLastName(savedStudent.getLastName());
		studentResponse.setEmail(savedStudent.getEmail());
		studentResponse.setDeptResponse(departmentResponse);
		
		return studentResponse;
	}

	@Override
	public StudentResponse getStudent(Long stdId)
	{
		Student student = studentRepo.findById(stdId).get();
		System.out.println("input for this method ---> "+stdId);
		System.out.println("student --> "+student);
		
		DepartmentResponse departmentResponse = apiClient.getDepartment(student.getDeptId()).getBody();
		System.out.println("departmentResponse -->"+departmentResponse.getDeptName());
		
		StudentResponse studentResponse = new StudentResponse();
		studentResponse.setStdId(student.getStdId());
		studentResponse.setFirstName(student.getFirstName());
		studentResponse.setLastName(student.getLastName());
		studentResponse.setEmail(student.getEmail());
		studentResponse.setDeptResponse(departmentResponse);
		System.out.println("studentResponse --> "+studentResponse);
		return studentResponse;
	}
}
