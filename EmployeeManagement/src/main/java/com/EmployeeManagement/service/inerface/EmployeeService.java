package com.EmployeeManagement.service.inerface;




import com.EmployeeManagement.dto.AddressDto;
import com.EmployeeManagement.dto.CommonDto;
import com.EmployeeManagement.dto.EmployeeDto;
import com.EmployeeManagement.dto.ProfileDetailsDto;

public interface EmployeeService 
{
//	CommonDto saveEmployee(EmployeeDto empData);
//
//	CommonDto saveProfileDetails(ProfileDetailsDto profData);
//
//	CommonDto saveAddress(AddressDto addressData);

	CommonDto  employeeDetails(EmployeeDto employeeDto);

	
}
