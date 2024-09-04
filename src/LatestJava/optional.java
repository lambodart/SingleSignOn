package LatestJava;

import java.util.Optional;

public class optional {
	public static String getEmail() {
		String a = null;
		return a;
	}

	public static String gg() {

		String of = null;
		return of;
		// return ofNullable;
	}
	
	public static Optional<String> getEmailByOptional() {

		Optional<String> of = null;
		return of;
		// return ofNullable;
	}

	public static Optional<String> ofNullable() {

		Optional<String> ofNullable = Optional.ofNullable(gg());
		return ofNullable;
		// return ofNullable;
	}

	public static void main(String[] args) {
		String email = getEmail();
		String sj = email + "gg";
		System.out.println(sj);

		String str = null;
		String result = "Prefix: " + str;
		System.out.println(null + "" + "og"+ result);

		// Optional<String> emailByOptional = getEmailByOptional();
		// System.out.println(emailByOptional.isEmpty());

		Optional<String> ofNullable = ofNullable();

		System.out.println(ofNullable);
		boolean empty = ofNullable.isEmpty();
		if (empty)
			System.out.println("empty");

	}

}
