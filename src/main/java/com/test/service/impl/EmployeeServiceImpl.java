package com.test.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.Employee;
import com.test.repository.EmployeeRepository;
import com.test.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeerepository;
	@Override
	public Employee saveEmployee(Employee employee) {
		Employee emp = employeerepository.save(employee);
		return emp;
	}
	@Override
	public Employee updateEmployee(Employee employee) {
		Employee empupdate =employeerepository.save(employee);
		return empupdate;
	}
	@Override
	public Employee getEmployee(Integer id) {
		Optional<Employee> getemp = employeerepository.findById(id);
		Employee emps=null;
		if(getemp.isPresent())
		{
			emps=getemp.get();
		}
		return emps;
	}
	@Override
	public void deleteEmployee(Integer id) {
		employeerepository.deleteById(id);
	}

}
