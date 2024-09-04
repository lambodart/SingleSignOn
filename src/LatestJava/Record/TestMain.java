package LatestJava.Record;

import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		User u = new User("rakesh", "gupta", 30);
		System.out.println(u);
		User l = new User("lambodar", "thakur", 29);
		System.out.println(l);
		List<User> al = List.of(u, l);
		
		printDetails(al);
		
		recordClass r = new recordClass(10,20);
		System.out.println(r.a());
	}

	private static void printDetails(List<User> u) {
		
		for (User user : u) {
			System.out.println(user);
			System.out.println(user.username());
			
		}
	
	}

}
