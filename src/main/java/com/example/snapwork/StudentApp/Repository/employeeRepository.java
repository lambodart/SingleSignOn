package com.example.snapwork.StudentApp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.snapwork.StudentApp.Bean.Employee;

public interface employeeRepository extends JpaRepository<Employee,Integer> {

	@Query("select u.empAge from Employee u where u.empName =?1") 
	String findAgeByName(String empNumber);

	@Query("select u from Employee u") 
	List<Employee> getFilteredSalary(); 

	@Query("SELECT e FROM Employee e where e.empSalary > 5000") 
	List<Employee>	getSalaryAbove5000();

}
