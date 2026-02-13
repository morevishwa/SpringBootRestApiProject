package com.test.service;

import com.test.entity.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);
	
	public Employee updateEmployee(Employee employee);
	
	public Employee getEmployee(Integer id);
	
	public void deleteEmployee(Integer id);
	
}
