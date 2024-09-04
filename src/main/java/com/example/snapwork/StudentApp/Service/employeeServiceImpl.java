package com.example.snapwork.StudentApp.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.snapwork.StudentApp.Bean.Employee;
import com.example.snapwork.StudentApp.Repository.employeeRepository;
import com.example.snapwork.StudentApp.Utility.EmployeeRestTemplate;

@Service
public class employeeServiceImpl implements employeeService {

	@Autowired
	employeeRepository employeeRepository;
	
	@Autowired
	RestTemplate employeeRestTemplate;

	@Value("${schedular.time}")
	 String schedularTime;
	

	@Override
	public Employee createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return employeeRepository.save(emp);
	}

	@Override
	public Employee getEmployee(String s) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(Integer.parseInt(s)).get();
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll(); // return employeeRepository.findById(Integer.parseInt(s)).get(); 
	}

	@Override
	public String getAgeByName(String name) {
		// TODO Auto-generated method stub
		return employeeRepository.findAgeByName(name);
	}

	@Override
	public List<Employee> getFilteredSalary() { 
		List<Employee> filteredSalary = employeeRepository.getFilteredSalary();
		
		//Stream<Employee> sorted = filteredSalary.stream().sorted(Comparator.comparing(Employee :: getEmpSalary));
		//List<Employee> FilteredSalary = sorted.collect(Collectors.toList());
		
		filteredSalary.sort((s1,s2) -> s2.getEmpSalary()-s1.getEmpSalary()); 
		
		return filteredSalary;
	}
	
	@Override
	public String getEmployeeAgeByName(String name) { 
		String age = ""; 
		
		String url = "http://localhost:8080/employee/getAgeByName?name={name}"; // Replace with the correct URL
		
		//"http://localhost:8080/employee/getAgeByName?name={name}";
        ResponseEntity<String> getAgeByName = employeeRestTemplate.getForEntity(url, String.class,name); 
        boolean is2xxSuccessful = getAgeByName.getStatusCode().is2xxSuccessful();
        System.out.println("API Response :: "+ getAgeByName.getBody() +" :: Response Code ::"+is2xxSuccessful);
        if (is2xxSuccessful) {
			return getAgeByName.getBody();
		}

		return age;
	}

	
	@Override
	public List<Employee> getSalaryAbove5000() {
		List<Employee> filteredSalary = employeeRepository.getSalaryAbove5000();
		
		//Stream<Employee> sorted = filteredSalary.stream().sorted(Comparator.comparing(Employee :: getEmpSalary));
		//List<Employee> FilteredSalary = sorted.collect(Collectors.toList());
		
		filteredSalary.forEach(response -> {
	           // System.out.println("Fetched Success Response getSalaryAbove5000 : " + response.getEmpName());
	            // Add your processing logic here
	        });
		
		return filteredSalary; 
	}
			
	//@Scheduled(fixedRate = schedularTime)  // 60000 milliseconds = 1 minute
	@Scheduled(fixedRateString =  "${schedular.time}") 
	
	//@Scheduled(fixedRateString = "PT5S")
    public void fetchSuccessResponses() {
		List<Employee> salaryAbove5000 = getSalaryAbove5000();   
        // Process the success responses as needed
		salaryAbove5000.forEach(response -> {
            System.out.println("Fetched Success Response fetchSuccessResponses : " + response.getEmpName());
            // Add your processing logic here
        });
    }
 
	@Override
	public Page<Employee> getEmployees(int page, int size) {
		 Pageable pageable = PageRequest.of(page, size);
	     return employeeRepository.findAll(pageable);
	}

}
