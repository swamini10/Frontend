package com.skillio.Employee_Web.model;

import java.util.List;

public class DeptEmpsDTO {
	private String deptName;
	private List<String> empName;
	
	
	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	public List<String> getEmpName() {
		return empName;
	}


	public void setEmpName(List<String> empName) {
		this.empName = empName;
	}


	public DeptEmpsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public DeptEmpsDTO(String deptName, List<String> empName) {
		this.deptName = deptName;
		this.empName = empName;
	}

	
	
}
