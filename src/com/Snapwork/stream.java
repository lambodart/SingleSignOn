package com.Snapwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> al = new ArrayList<String>();

		List<String> asList = Arrays.asList("a", "b", "a");

		List<List<String>> asList2 = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("c", "d"));

		// Intermediate Operations

		// filter
		List<String> collect = asList.stream().filter(s -> !s.toUpperCase().equalsIgnoreCase("x"))
				.collect(Collectors.toList());
		collect.forEach(s -> System.out.println(" filter:"+s));

		// map
		List<String> collect2 = asList.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		collect2.forEach(s -> System.out.println(" map:"+s));

		// flatMap
		List<String> collect3 = asList2.stream().flatMap(List::stream).collect(Collectors.toList());
		collect3.forEach(s -> System.out.println(" flatMap:"+s));

		// distinct
		List<String> collect4 = asList.stream().distinct().collect(Collectors.toList());
		collect4.forEach(s -> System.out.println(" dist:"+s));

		// sort
		List<String> collect5 = asList.stream().sorted().collect(Collectors.toList());
		collect5.forEach(s -> System.out.println(" sort:"+s));

		// limit
		List<String> collect6 = asList.stream().limit(1).collect(Collectors.toList());
		collect6.forEach(s -> System.out.println(" limit :"+s));	
		//Terminal
		//count
				//max
		//foreach
		//Collect
		
		Optional<String> reduce = asList.stream().reduce( (s,s1 ) -> s.concat(s1));
		System.out.println(" Reduce:"+reduce.get());
		
		
	}

}
