package com.noetictest.cruddemoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.noetictest.cruddemoapp.model.Employee;
import com.noetictest.cruddemoapp.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value = "employee", method = RequestMethod.POST)
	public void saveEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
	}
	
	@RequestMapping(value = "employees", method = RequestMethod.GET)
	public List<Employee> searchAll() {
		return employeeService.findAll();
	}
	
	@RequestMapping(value = "employee/{empId}", method = RequestMethod.GET)
	public Employee searchByEmpId(@PathVariable("empID") String empId) {
		return employeeService.findByEmpId(empId);
	}
	
	@RequestMapping(value = "employee", method = RequestMethod.PUT)
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	
	@RequestMapping(value = "employee/{empId}", method = RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable("empId") String empId) {
		employeeService.deleteEmployee(empId);
	}

}
