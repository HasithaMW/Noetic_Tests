package com.noetictest.cruddemoapp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.noetictest.cruddemoapp.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, String>{
	
	@Override
	List<Employee> findAll();
	Employee findByEmpId(String id);
	
}
