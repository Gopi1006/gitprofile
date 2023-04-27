package com.EmployeeManagement.dto;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;



public class ProfileDetailsDto 
{


	
	private long profId ;
	
	private String email;
	
	private int age ;
	
	private String gender;
	 
    private long mobNumber;
	
	private String image;
	

	private EmployeeDto employeeDto;


	public long getProfId() {
		return profId;
	}


	public void setProfId(long profId) {
		this.profId = profId;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public long getMobNumber() {
		return mobNumber;
	}


	public void setMobNumber(long mobNumber) {
		this.mobNumber = mobNumber;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public EmployeeDto getEmployeeDto() {
		return employeeDto;
	}


	public void setEmployeeDto(EmployeeDto employeeDto) {
		this.employeeDto = employeeDto;
	}

}


