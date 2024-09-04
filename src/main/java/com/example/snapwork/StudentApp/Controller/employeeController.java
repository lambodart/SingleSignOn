package com.example.snapwork.StudentApp.Controller;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.snapwork.StudentApp.Bean.CoverPositionRequestSchema;
import com.example.snapwork.StudentApp.Bean.Employee;
import com.example.snapwork.StudentApp.Bean.Request;
import com.example.snapwork.StudentApp.Service.AsyncService;
import com.example.snapwork.StudentApp.Service.employeeService;
import com.example.snapwork.schedular.ScheduledTask;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping(path="/employee")
public class employeeController {
	
	@Autowired
	employeeService employeeService;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired(required = false) 
	AsyncService AsyncService;
	
	@PostMapping("/createEmployee") 
	//@RequestMapping(value = "/createEmployee", method = RequestMethod.POST)
	public Employee createEmployee(@RequestBody Employee emp) {
		return employeeService.createEmployee(emp);
	} 
	
	@GetMapping("/getEmployee")
	public Employee getEmployee(@RequestParam String s) {
	
		Employee employee = employeeService.getEmployee(s);
		
		return employee;
	}
	
	@GetMapping("/getAgeByName")
	public String getAgeByName(@RequestParam String name) {
	 
		String employee = employeeService.getAgeByName(name);
		if(!employee.isEmpty())
			return employee;
		
		return "";
	}
	
	
	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployee() {
	
		List<Employee> employee = employeeService.getAllEmployee();
		
		return employee;
	}
	
	
	@GetMapping("/getSalary")
	public List<Employee> getFilteredSalary() {
	 
		List<Employee> employee = employeeService.getFilteredSalary();
	
		return employee;
	}
	
	@GetMapping("/getSalaryAbove5000")
	public List<Employee> getSalaryAbove5000() {
	 
		List<Employee> employee = employeeService.getSalaryAbove5000();
	
		return employee;
	}
	
	@GetMapping("/getEmployeeAgeByName")
	public String getEmployeeAgeByName(@RequestParam String name) {
	 
		 String employeeAgeByName = employeeService.getEmployeeAgeByName(name); 
	
		return employeeAgeByName;
	}
	
	@PostMapping("/getEmployeeId")
	public String getEmployeeId(@RequestBody Employee employee) {
	        // Invoke the API
	    //String invokeApi = invokeApi(employee);
		 Instant startTime = null;
	     Instant endTime = null;
	     startTime = Instant.now();
	     long totalresponseTime = 0;
		String invokeApi = invokeApiUsingExchange(employee);
		endTime = Instant.now();
		totalresponseTime = ChronoUnit.MILLIS.between(startTime, endTime);
	    System.out.println("invokeApi :: "+invokeApi + " API Response Time in Milliseconds :: "+totalresponseTime);
	    if (!invokeApi.isEmpty()) {
			
		}  
	  return invokeApi;
	}
	
	@PostMapping("/getEmployeeMap")
	public String objectMap() {
	        // Invoke the API
		   	Map<String, Object> reqData = new HashMap<>();
	        reqData.put("positionName", "Manager");
	        reqData.put("positionId", 101);
	        reqData.put("coverageAmount", 50000.75);
	        
	        CoverPositionRequestSchema coverPositionRequestSchema = new ObjectMapper().convertValue(reqData, CoverPositionRequestSchema.class);
	        System.out.println("coverPositionRequestSchema :: " +coverPositionRequestSchema);
			String invokeApi = "";
			
			
			return coverPositionRequestSchema.getPositionName();
	}
	
	private String invokeApi(Employee employee) {
        String url = "http://localhost:8080/employee/createEmployee";
        
        // Make the POST request
        ResponseEntity<String> response = restTemplate.postForEntity(url, employee, String.class);
        
        // Return the employee ID from the response
        return response.getBody();
    }
	
	private String invokeApiUsingExchange(Employee employee) {
	    String url = "http://localhost:8080/employee/createEmployee";

	    // Create the request entity with the body only
	    HttpEntity<Employee> requestEntity = new HttpEntity<>(employee);

	    // Make the POST request using exchange
	    ResponseEntity<String> response = restTemplate.exchange(
	            url, 
	            HttpMethod.POST, 
	            requestEntity, 
	            String.class
	    );

	    // Check the response status and return the body
	    if (response.getStatusCode().is2xxSuccessful()) {
	        return response.getBody();
	    } else {
	        throw new RuntimeException("Failed to create employee: " + response.getStatusCode());
	    }
	}
	

	 @GetMapping("/employees")
	 public Page<Employee> getEmployees(
	            @RequestParam(defaultValue = "0") int page,
	            @RequestParam(defaultValue = "10") int size) {
	        return employeeService.getEmployees(page, size);
	    }
	 
	 @GetMapping("/fetchSuccessResponsesAsync")
	 public void fetchSuccessResponsesAsync() {			
			System.out.println(Thread.currentThread().getName());
			AsyncService.fetchSuccessResponsesAsync();   
	    } 
	 
}
