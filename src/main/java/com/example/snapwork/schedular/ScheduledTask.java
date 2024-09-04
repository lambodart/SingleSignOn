package com.example.snapwork.schedular;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.snapwork.StudentApp.Bean.Employee;
import com.example.snapwork.StudentApp.Repository.employeeRepository;

@Component
public class ScheduledTask {

	@Autowired
	employeeRepository employeeRepository;
	 
	 @Scheduled(fixedRate = 60000)  // 60000 milliseconds = 1 minute
	 public void fetchSuccessResponses() {
			List<Employee> salaryAbove5000 = employeeRepository.getSalaryAbove5000();
	        // Process the success responses as needed
			salaryAbove5000.forEach(response -> {
	            System.out.println("Fetched Success ScheduledTask: " + response.getEmpName());
	            // Add your processing logic here
	        });
	 }
	
}
