package com.noetictest.cruddemoapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.noetictest.cruddemoapp.model.Department;

public interface DepartmentRepository extends CrudRepository<Department, Integer>{

}
