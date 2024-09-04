package com.example.snapwork.StudentApp.Utility;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class EmployeeRestTemplate {
	 	
		@Bean
	    public RestTemplate restTemplate() {
	        return new RestTemplate();
	    }
}
