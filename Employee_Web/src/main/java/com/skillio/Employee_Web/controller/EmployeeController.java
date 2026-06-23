package com.skillio.Employee_Web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.skillio.Employee_Web.model.DeptEmpsDTO;
import com.skillio.Employee_Web.model.Employee;
import com.skillio.Employee_Web.service.EmployeeService;
import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {
	
	
	@Autowired
	   private EmployeeService es;
	
	
	@GetMapping("/Employee/{email}")
	public Employee getEmployeeByEmail(@PathVariable("email") String email) {
		return es.getEmployee(email);
	}

	@GetMapping("/Employees/{dept}")
	public Map<String, List<String>> getEmployeeByDepts(@PathVariable("dept") String dept) {
		return es.getEmployeesByDepts(dept);
	}

	
	@GetMapping("/Employees-by-dept/{dept}")
	public DeptEmpsDTO getEmployeeByDept(@PathVariable("dept") String dept) {
		return es.getEmployeesByDept(dept);
	}
	  
	
}
