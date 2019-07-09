package com.banka.thymeleaf.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banka.thymeleaf.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
}
