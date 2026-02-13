package com.test.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

	
}
