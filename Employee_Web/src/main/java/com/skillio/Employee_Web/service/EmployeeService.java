package com.skillio.Employee_Web.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.skillio.Employee_Web.model.DeptEmpsDTO;
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
	


public Employee getEmployee(String email) {
	for(Employee emp : allEmployees()) {
		 if(emp.getEmail().equals(email)) {
			 return emp;
		 }
	 }
	 return new Employee();
}
/*
public List <Employee> getEmployeesByDept(String dept){
	Map<String> emps = new ArrayList<>();
	for(Employee emp : allEmployees()) {
		 if(emp.getDept().equals(dept)) {
			emps.add(emp); 
		 }
	 }
	return emps;
}
*/
//map list arraylist linkedlist this is very usefull 
// map use kele so yekch department  bhetel
public Map<String , List <String>> getEmployeesByDepts(String dept){
	Map<String, List <String>> empData =new HashMap<>();
	List<String> emps = new ArrayList<>();
	for(Employee emp : allEmployees()) {
		 if(emp.getDept().equals(dept)) {
			emps.add(emp.getName()); 
		 }
	 }
	empData.put(dept, emps);
	return empData;
	
	// this well return in key value 
	 
}

public DeptEmpsDTO getEmployeesByDept(String dept){
	DeptEmpsDTO dedt = new DeptEmpsDTO();
	dedt.setDeptName(dept);
List<String> emps = new ArrayList<>();
for(Employee emp : allEmployees()) {
	 if(emp.getDept().equals(dept)) {
		 emps.add(emp.getEmail());
		//emps.add(emp.getName()); //this gives name 
		//as per need u and add any one 
	 }
 }
dedt.setEmpName(emps);
return dedt;
}
/*
 but we want
{
	"dept":"hr",
	"emp":[.......]
}

so for that we need to creat and pojo file of dept and emp
we creat pojo in model file 
 DTO{requide things only}
*/




}



























