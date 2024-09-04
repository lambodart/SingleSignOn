package com.example.snapwork.StudentApp.Bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	private String empName;
	
	@Id
	@GeneratedValue
	private Integer empNumber;
	
	private Integer empSalary;
	private Integer empAge;

}
