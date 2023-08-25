package com.sneha.springdemo.model;

import java.time.LocalDate;

public class Student {

	private String firstname;
	private String lastname;
	private int age;
	private String email;
	private LocalDate dob;
	
	
	
	
	public Student(){
	}
	
	public Student(String firstname, String lastname, int age, String email, LocalDate dob) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.email = email;
		this.dob = dob;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	
	
	
}
