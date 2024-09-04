package com.Snapwork;



public class Student {
	public String Name;
	public Integer salary;
	public Integer age;
	public Student() {
		
	}
	public Student(Integer salary, Integer age) {
		super();
		this.salary = salary;
		this.age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	

}
