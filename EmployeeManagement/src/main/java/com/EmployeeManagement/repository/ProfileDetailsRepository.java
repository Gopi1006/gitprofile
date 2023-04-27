package com.EmployeeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmployeeManagement.entity.ProfileDetails;



public interface ProfileDetailsRepository extends JpaRepository<ProfileDetails, Long>  {

	

}
