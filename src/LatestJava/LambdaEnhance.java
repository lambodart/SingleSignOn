package LatestJava;

import java.util.List;

public class LambdaEnhance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List.of("apple","banana","cherry").stream().map(s -> s.toUpperCase()).forEach(m -> System.out.println(m));
		
		System.out.println( "------" );
		
		List.of("apple","banana","cherry").stream().map( (var s) -> s.toUpperCase()).forEach(m -> System.out.println(m));

		System.out.println( "------" );

		List.of("apple","banana","cherry").stream().map( (String s) -> s.toUpperCase()).forEach(m -> System.out.println(m));		
		

		System.out.println( "------" );
	}

}
