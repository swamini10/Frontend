package com.skilio.StudentWeb.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilio.StudentWeb.model.Student;
@RestController
public class StudentController {
	
	//simple try
	@GetMapping("/hello")
	public String Students () {
		return "pune";
	}
	//try simple object
	@GetMapping("/Student")
	public Student Student () {
		return new Student(2,"don","pune");
	}
	
}
