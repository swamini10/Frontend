package com.skillio;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Teacher {

	@Id
	private int id;
	private String name;
	private String dept;
	private String subject;
	
	
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public Teacher() {}
	
	public Teacher(int id, String name, String dept, String subject) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.subject = subject;
	}
	
	
	
}
