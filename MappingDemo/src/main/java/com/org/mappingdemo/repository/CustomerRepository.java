package com.org.mappingdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.mappingdemo.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>
{

}
