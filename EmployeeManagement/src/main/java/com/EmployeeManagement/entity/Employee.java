package com.EmployeeManagement.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee 
{

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long empId;

	private String name;
	
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private ProfileDetails profileDetails;
	@JoinColumn(name="pk_prof_id")

	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	
	private List<Address> address;
	@JoinColumn(name="pk_emp_id")
	public long getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ProfileDetails getProfileDetails() {
		return profileDetails;
	}
	public void setProfileDetails(ProfileDetails profileDetails) {
		this.profileDetails = profileDetails;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}

	
	
}
