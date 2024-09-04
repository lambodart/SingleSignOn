package com.corejava.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class studentComparator implements Comparator<studentComparator> {

	String name;
	Integer id;

	public studentComparator() {

	}

	public studentComparator(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public int compare(studentComparator s1, studentComparator s2) {

		// TODO Auto-generated method stub
		if (s1.id == s2.id) {
			return 0;
		} else if (s1.id > s2.id) {
			return 1;
		} else
			return -1;
	}

	
	@Override
	public String toString() {
		return "studentComparator [name=" + name + ", id=" + id + "]";
	}

	public static void main(String[] args) {
		studentComparator comparator = new studentComparator("ra", 1);
		studentComparator comparator1 = new studentComparator("raj", 3);
		studentComparator comparator2 = new studentComparator("raja", 2);

		List<studentComparator> comparators = new ArrayList<studentComparator>();
		comparators.add(comparator1);
		comparators.add(comparator2);
		comparators.add(comparator);
		

		 System.out.println("Before :: "+comparators);

		 Collections.sort(comparators, new studentComparator());
		 
		 System.out.println("After :: "+comparators);
		 
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("l", 1);
		m.put("a", 1);
		m.put("b", 1);

		System.out.println(m);

	}

}
