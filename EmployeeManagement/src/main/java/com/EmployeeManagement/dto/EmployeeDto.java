package com.EmployeeManagement.dto;

import java.util.List;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;

public class EmployeeDto 
{

	private long empId;

	private String name;
	
	
	private ProfileDetailsDto profileDetailsDto;
	
	
	private List<AddressDto>addressDto;
	
	
	public List<AddressDto> getAddressDto() {
		return addressDto;
	}

	public void setAddressDto(List<AddressDto> addressDto) {
		this.addressDto = addressDto;
	}

	public ProfileDetailsDto getProfileDetailsDto() {
		return profileDetailsDto;
	}

	public void setProfileDetailsDto(ProfileDetailsDto profileDetailsDto) {
		this.profileDetailsDto = profileDetailsDto;
	}

	public long getEmpId() {
		return empId;
	}

 
	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	

	
	
	
}

