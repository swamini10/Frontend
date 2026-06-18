package com.skillio.Employee_Web.service;

import java.util.Arrays;
import java.util.List;
import com.skillio.Employee_Web.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	public List <Employee> allEmployees(){
		Employee s1 = new Employee(1, "ervinod", "vinod@gmail.com", 456, "IT", 90000, "Pune");
		Employee s2 = new Employee(2, "erdon", "don@gmail.com", 342, "HR", 8900, "Ppur");
		Employee s3 = new Employee(3, "ershree", "shree@gmail.com", 123, "IT", 7800, "Latur");
		Employee s4 = new Employee(4, "erAmit", "amit@gmail.com", 567, "Finance", 8500, "Mumbai");
		Employee s5 = new Employee(5, "erPriya", "priya@gmail.com", 678, "IT", 9200, "Nagpur");
	
		return Arrays.asList(s1, s2, s3, s4, s5);
	}
	


public Employee getEmployees(String dept) {
	for(Employee emp : allEmployees()) {
		 if(emp.getDept().equals(dept)) {
			 return emp;
		 }
	 }
	 return new Employee();
}

}