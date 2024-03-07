package com.org.Student_MS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.Student_MS.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>
{

}
