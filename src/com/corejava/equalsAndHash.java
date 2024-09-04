package com.corejava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class equalsAndHash {
	String name;
	Integer id;

	public equalsAndHash(String name, Integer id) {
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
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		equalsAndHash other = (equalsAndHash) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "equalsAndHash [name=" + name + ", id=" + id + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		equalsAndHash hash = new equalsAndHash("lam", 1);
		equalsAndHash hash1 = new equalsAndHash("lam", 1);
		Set<equalsAndHash> andHashs = new HashSet<equalsAndHash>();
		andHashs.add(hash);
		andHashs.add(hash1);
		System.out.println(andHashs);
		System.out.println(andHashs.size());
		
		Set<String> ss = new HashSet<String>();
		ss.add("shams");
		ss.add("shams");
		System.out.println("Shams :: "+ss.size());//1

		  Map<String,String> map = new HashMap<>();
	        map.put("shams","Jr. Java Dev");//6
	        map.put("shams1","Sr. Java Dev");//7
	        Set<String> keySet = map.keySet();
	       keySet.stream().forEach(s-> System.out.println("Unique Keys:: "+s));
	}

}
