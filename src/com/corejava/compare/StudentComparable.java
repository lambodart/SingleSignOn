package com.corejava.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparable implements Comparable<StudentComparable> {
	public String Name;
	public Integer salary;
	public Integer age;

	public StudentComparable() {

	}

	public StudentComparable(Integer salary, Integer age, String Name) {
		super();
		this.salary = salary;
		this.age = age;
		this.Name = Name;
	}

	public StudentComparable(Integer salary, Integer age) {
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

	@Override
	public String toString() {
		return "StudentComparable [salary=" + salary + ", age=" + age + "]";
	}

	@Override
	public int compareTo(StudentComparable s) {
		// TODO Auto-generated method stub
		if (salary == s.salary) {
			return 0;
		} else if (salary > s.salary) {
			return 1;
		} else
			return -1;
	}

	public static void main(String[] args) {

		StudentComparable comparable = new StudentComparable(2010, 20);
		StudentComparable comparable1 = new StudentComparable(1012, 10);
		StudentComparable comparable2 = new StudentComparable(3011, 30);

		List<StudentComparable> comparables = new ArrayList<StudentComparable>();
		comparables.add(comparable);
		comparables.add(comparable1);
		comparables.add(comparable2);

		System.out.println("Before Sort " + comparables);
		Collections.sort(comparables);
		System.out.println("After Sort " + comparables);

	}
}
