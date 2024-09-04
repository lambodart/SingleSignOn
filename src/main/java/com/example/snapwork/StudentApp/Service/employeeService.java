package com.example.snapwork.StudentApp.Service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;

import com.example.snapwork.StudentApp.Bean.Employee;

public interface employeeService  {

	Employee createEmployee(Employee emp);

	Employee getEmployee(String s);
	
	public List<Employee> getAllEmployee() ;
	
	String getAgeByName(String name);

	List<Employee> getFilteredSalary();
	
	String getEmployeeAgeByName(String name);
 
	List<Employee>	getSalaryAbove5000();
	
	Page<Employee> getEmployees(int page, int size);
	
	// public void fetchSuccessResponsesAsync() ;
}
