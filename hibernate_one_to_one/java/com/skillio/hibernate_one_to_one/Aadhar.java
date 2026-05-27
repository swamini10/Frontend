package com.skillio.hibernate_one_to_one;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Aadhar {
	@Id
	private int id;
	private int aadharNumber;

	@OneToOne
	private User usr;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(int aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public User getUsr() {
		return usr;
	}

	public void setUsr(User usr) {
		this.usr = usr;
	}
    
	public Aadhar() {}
	public Aadhar(int id, int aadharNumber, User usr) {
		this.id = id;
		this.aadharNumber = aadharNumber;
		this.usr = usr;
	}
	
	
}
