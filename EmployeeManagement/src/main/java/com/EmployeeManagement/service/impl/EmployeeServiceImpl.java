package com.EmployeeManagement.service.impl;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeManagement.dto.AddressDto;
import com.EmployeeManagement.dto.CommonDto;
import com.EmployeeManagement.dto.EmployeeDto;
import com.EmployeeManagement.dto.ProfileDetailsDto;
import com.EmployeeManagement.entity.Address;
import com.EmployeeManagement.entity.Employee;
import com.EmployeeManagement.entity.ProfileDetails;
import com.EmployeeManagement.repository.AddressRepository;
import com.EmployeeManagement.repository.EmployeeRepository;
import com.EmployeeManagement.repository.ProfileDetailsRepository;
import com.EmployeeManagement.service.inerface.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService 
{


	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private  AddressRepository addressRepository;

	@Autowired
	private ProfileDetailsRepository  profileDetailsRepository;

//
//
//	@Override
//	public CommonDto saveEmployee(EmployeeDto employeeDto)
//	{
//		//String response=null;
//		CommonDto response=new CommonDto();
//		boolean savedata=true;
//		try
//		{
//			if(employeeDto!=null)
//			{
//				if(savedata)
//				{
//
//					Employee employeeEntity=new Employee();
//
//					employeeEntity.setEmpId(employeeDto.getEmpId());
//					employeeEntity.setName(employeeDto.getName());
//
//				
//					
//					employeeRepository.save(employeeEntity);
//					response.setStatus("success");
//					response.setResponseData(employeeEntity);
//
//				}
//
//				else
//				{
//					response.setStatus("not found");
//				}
//			}
//		}
//
//		catch(Exception  e)
//		{
//
//			e.printStackTrace();
//
//		}
//
//		return response;
//
//
//
//	}
//
//
//	
//			@Override
//			public CommonDto saveProfileDetails(ProfileDetailsDto profData) 
//			{
//				CommonDto response=new CommonDto();
//				boolean saveProf=true;
//		
//				try
//				{
//					if(profData !=null)
//					{
//						if(saveProf)
//						{
//							ProfileDetails profileEntity=new ProfileDetails();
//		
//							profileEntity.setProfId(profData.getProfId());
//							profileEntity.setEmail(profData.getEmail());
//							profileEntity.setAge(profData.getAge());
//							profileEntity.setGender(profData.getGender());
//							profileEntity.setMobNumber(profData.getMobNumber());
//							profileEntity.setImage(profData.getImage());
//		
//		
//							profileDetailsRepository.save(profileEntity);
//							response.setStatus("success");
//							response.setResponseData(profileEntity);
//						}
//						else
//						{
//							response.setStatus("Failed");
//		
//						}
//					}
//				}
//				catch(Exception e)
//				{
//					e.printStackTrace();
//				}
//				return response;
//			}
		
		
//		
//			@Override
//			public CommonDto saveAddress(AddressDto addressData) 
//			{
//		
//				CommonDto response=new CommonDto();
//				boolean saveAddress=true;
//				try
//				{
//					if(addressData !=null)
//					{
//						if(saveAddress)
//						{
//							Address addressEntity=new Address();
//		
//							addressEntity.setAddId(addressData.getAddId());
//							addressEntity.setAddessType(addressData.getAddessType());
//							addressEntity.setAddress(addressData.getAddress());
//							addressEntity.setPincode(addressData.getPincode());
//		
//		
//							addressRepository.save(addressEntity);
//							response.setStatus("success");
//							response.setResponseData(addressEntity);
//						}
//						else
//						{
//							response.setStatus("Failed");
//		
//						}
//					}
//				}
//				catch(Exception e)
//				{
//					e.printStackTrace();
//				}
//				return response;
//			}
//	


	@Override
	public CommonDto<Employee> employeeDetails(EmployeeDto employeeDto) 
	{
		CommonDto<Employee> commonDto=new CommonDto<Employee>();
		boolean saveData=true;
		try {
			if (employeeDto != null)
			{
				if(saveData)
				{
					Employee employeeEntity=new Employee();

					
					employeeEntity.setName(employeeDto.getName());
					
					employeeRepository.save(employeeEntity);

					//oneToOne

					ProfileDetails profileEntity=new ProfileDetails();
					ProfileDetailsDto profileDetailsDto=employeeDto.getProfileDetailsDto();

					

					
					profileEntity.setEmail(profileDetailsDto.getEmail());
					profileEntity.setAge(profileDetailsDto.getAge());
					profileEntity.setGender(profileDetailsDto.getGender());
					profileEntity.setMobNumber(profileDetailsDto.getMobNumber());
					profileEntity.setImage(profileDetailsDto.getImage());

				
					employeeEntity.setProfileDetails(profileEntity);
					
					profileDetailsRepository.save(profileEntity);
					

					//OneToMany
					List<AddressDto>addressDto=employeeDto.getAddressDto();
					
					List<Address>address=new ArrayList<Address>();


					for ( AddressDto addDto : addressDto)
					{
						Address addressEntity=new Address();
						
						addressEntity.setAddressType(addDto.getAddressType());							
						addressEntity.setAddress(addDto.getAddress());
						addressEntity.setPincode(addDto.getPincode());

						employeeEntity.setAddress(address);
						
						addressRepository.save(addressEntity);

						commonDto.setStatus("success");
						
						commonDto.setResponseData(employeeEntity);
					}
				}
				else
				{
					commonDto.setStatus("Failed");

				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return commonDto;
	}
}




