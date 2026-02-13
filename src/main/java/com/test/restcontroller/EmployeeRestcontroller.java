package com.test.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Employee;
import com.test.service.EmployeeService;

@RestController
public class EmployeeRestcontroller {

	@Autowired
	private EmployeeService employeeservice;

	//for post mapping
	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee employee)
	{
		Employee emp1 = employeeservice.saveEmployee(employee);
		return emp1;
	}
	
	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		Employee emp2=employeeservice.updateEmployee(employee);
		return emp2;
	}
	
	@GetMapping("/getEmployee/{id}")
	public Employee getEmployee(@PathVariable ("id") Integer id)
	{
		Employee emp=employeeservice.getEmployee(id);
		return emp;
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable ("id") Integer id)
	{
		employeeservice.deleteEmployee(id);
		return "Record is deleted";
	}
}
