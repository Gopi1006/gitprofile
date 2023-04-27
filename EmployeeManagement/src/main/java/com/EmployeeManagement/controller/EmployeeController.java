package com.EmployeeManagement.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.EmployeeManagement.dto.AddressDto;
import com.EmployeeManagement.dto.CommonDto;
import com.EmployeeManagement.dto.EmployeeDto;
import com.EmployeeManagement.dto.ProfileDetailsDto;
import com.EmployeeManagement.service.inerface.EmployeeService;


@Controller
public class EmployeeController

{
	@Autowired
	private EmployeeService employeeservice;


//	@PostMapping("/SaveEmployee") 
//	public ResponseEntity<?> saveEmployee(@RequestBody EmployeeDto empData ) 
//	{
//
//		CommonDto response=  employeeservice.saveEmployee(empData);
//		return new ResponseEntity<CommonDto>(response,HttpStatus.OK);
//	}
//
//
//
//	@PostMapping("/SaveProfileDetails") 
//	public ResponseEntity<?> saveProfileDetails(@RequestBody ProfileDetailsDto profData ) 
//	{
//
//		CommonDto response=  employeeservice.saveProfileDetails(profData);
//		return new ResponseEntity<CommonDto>(response,HttpStatus.OK);
//	}
//
//	@PostMapping("/SaveAddress") 
//	public ResponseEntity<?> saveAddress(@RequestBody AddressDto addressData ) 
//	{
//
//		CommonDto response=  employeeservice.saveAddress(addressData);
//		return new ResponseEntity<CommonDto>(response,HttpStatus.OK);
//	}
//
//	@PostMapping("/SaveDetails") 
//	public String employeeDetails (@RequestBody EmployeeDto employeeDto)
//	{
//		employeeservice.employeeDetails(employeeDto);
//		return "Success";
//	}
//	
	

	@RequestMapping(value={"/common"},method = RequestMethod.POST) 
	public ResponseEntity<?>save(@RequestBody EmployeeDto employeeDto)
	{
		CommonDto commonDto= employeeservice.employeeDetails(employeeDto);
		return new ResponseEntity<CommonDto>(commonDto,HttpStatus.OK);
	}
	
	

	
	
	
	
}	
