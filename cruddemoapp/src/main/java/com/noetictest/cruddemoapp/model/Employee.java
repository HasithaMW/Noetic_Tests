package com.noetictest.cruddemoapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	
	@Id
	private String empId;
	private String firstName;
	private String lastName;
	@ManyToOne
	@JoinColumn(name="department_id")
	private Department department;
	
	public Employee() {
		
	}
	
	public Employee(String empId, String firstName, String lastName, Department department) {
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
	}

	public String getEmpId() {
		return empId;
	}
	
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}

}
