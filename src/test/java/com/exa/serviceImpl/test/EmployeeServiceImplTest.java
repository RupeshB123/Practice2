package com.exa.serviceImpl.test;

import org.junit.jupiter.api.Test;

import com.exa.model.Employee;

public class EmployeeServiceImplTest 
{
	

	@Test
	public String addEmployee(Employee emp) 
	{

		//Employee employee = new Employee(0, null, null, null, null, null);
		
		if(emp.getEmpName()==null )
		{
			return "Enter correct details" ;
		}
		
		Employee employee = empRepo.save(emp);
		
		return "Employee added successfully";
	}

}
