package LatestJava;

import java.util.stream.Stream;

public class StringEx {

	public static void main(String[] args) {
		String query = """
				SELECT id, name, email
				FROM users
				WHERE status = 'active'
				ORDER BY name;
				""";

		String q = "  SELECT id, name, email\r\n" + "  FROM users\r\n" + "  WHERE status = 'active'\r\n"
				+ "  ORDER BY name";

		 System.out.println("Query ::"+query + "q ::" + q);

		String s = "     ";
		String s1 = "gg\ngg";

		System.out.println(s.isBlank());
		System.out.println(s1.isBlank());

		Stream<String> lines = s.lines();
		lines.forEach(s9 -> System.out.println("No o/p ::" + s9));

		Stream<String> lines1 = s1.lines();
		lines1.forEach(s9 -> System.out.println("Lines ::" + s9));

		String h = "  Hello Wo  ";
		System.out.println("Strip :" + h.strip() + "Lead :" + h.stripLeading() + " Tailing:" + h.stripTrailing());

		String str = "Hello";
		// Integer length = str.transform(String::length);
		// String sss =
		Boolean transform = str.transform(o -> o.equals("h"));
		System.out.println(" transform :" + transform); // 5

		
		
		String indent = "Hello  \nWorldnjkn \nhjj";
		System.out.println("indent :" +indent.indent(-5));
		
	}

}
