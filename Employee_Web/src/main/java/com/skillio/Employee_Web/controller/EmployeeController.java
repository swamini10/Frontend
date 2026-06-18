package com.skillio.Employee_Web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.skillio.Employee_Web.model.Employee;
import com.skillio.Employee_Web.service.EmployeeService;

@RestController
public class EmployeeController {
	
	
	@Autowired
	   private EmployeeService es;
	
	@GetMapping("/Employees/{dept}")
	public Employee getEmployeeByDept(@PathVariable("dept") String dept) {
		return es.getEmployees(dept);
	}
	
}
