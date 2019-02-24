package com.noetictest.cruddemoapp.controller;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.noetictest.cruddemoapp.model.Department;
import com.noetictest.cruddemoapp.model.Employee;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeControllerTest {
	
	@Autowired
	EmployeeController employeeController;
	
	@Test
	public void findEmployeeById() {
		Employee employee = new Employee("emp-5", "Pasan", "Soyza", new Department(1,"IT"));
		employeeController.saveEmployee(employee);
		assertTrue(employeeController.searchByEmpId("emp-5").getFirstName() == "Pasan");
	}

}
