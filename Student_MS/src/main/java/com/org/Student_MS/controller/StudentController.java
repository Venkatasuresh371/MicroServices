package com.org.Student_MS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.Student_MS.request.StudentRequest;
import com.org.Student_MS.response.StudentResponse;
import com.org.Student_MS.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController 
{
	@Autowired(required = true)
	StudentService stdService;
	
	@PostMapping("/save")
	public ResponseEntity<StudentResponse> saveStudent(@RequestBody StudentRequest stdRequest)
	{
		StudentResponse studentResponse = stdService.saveStudent(stdRequest);
		return new ResponseEntity<StudentResponse>(studentResponse,HttpStatus.CREATED);
	}

	@GetMapping("/get/{stdId}")
	public ResponseEntity<StudentResponse> getStudentById(@PathVariable Long stdId)
	{
		StudentResponse studentResponse = stdService.getStudent(stdId);
		return new ResponseEntity<StudentResponse>(studentResponse,HttpStatus.OK);
	}
}