package com.skillio.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstname;
	private String lastname;
	private String address;
	@Column(unique = true, nullable = false)
	private String email;
	@Column(unique = true, nullable = false)
	private int mobile;
	@Column(unique = true, nullable = false)
	private int aadhar;
	@Column(unique = true, nullable = false)
	private String pan;
	private int age;

	private int accNo;
	private int balance;

}
