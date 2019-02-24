package com.noetictest.cruddemoapp.service;

import java.util.List;

import com.noetictest.cruddemoapp.model.Employee;

public interface EmployeeService {

	void saveEmployee(Employee employee);
	List<Employee> findAll();
	Employee findByEmpId(String employeeId);
	Employee updateEmployee(Employee employee);
	void deleteEmployee(String employeeId);
	
}
