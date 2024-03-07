package com.org.Department_MS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.Department_MS.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department,Long>
{

}
