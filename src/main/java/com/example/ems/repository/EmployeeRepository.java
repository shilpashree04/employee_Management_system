package com.example.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ems.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	

}
