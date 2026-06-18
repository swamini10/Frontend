package com.skillio.Employee_Web.model;

public class Employee {
	private int id;
	private String name;
	private String email;
	private int mobile;
	private String dept;
	private int salary;
	private String address;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getMobile() {
		return mobile;
	}


	public void setMobile(int mobile) {
		this.mobile = mobile;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Employee(int id, String name, String email, int mobile, String dept, int salary, String address) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.dept = dept;
		this.salary = salary;
		this.address = address;
	}
	
	
	
	
}
