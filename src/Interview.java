import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> month = new ArrayList<String>(12);
		month.add("jan");
		month.add("feb");
		month.add("mar");
		month.add("apr");
		month.add("may");

		// Optional<String> matchMonth = month.stream().filter(s ->
		// s.equalsIgnoreCase("apr")).findAny();
		List<String> collect = month.stream().filter(s -> s.equalsIgnoreCase("apr")).map(s -> s)
				.collect(Collectors.toList());
		System.out.println(collect);
		List ok = new ArrayList(2);
		ok.add(1);
		ok.add(2);
		ok.add(3);
		ok.add(4);

		System.out.println(ok);

		// print all the lang using java 8
		String a[] = { "c", "java" };
		Arrays.asList(a).stream().forEach(System.out::println);

		Arrays.asList(a).stream().forEach(s -> System.out.println("Lang :: " + s));

		List<String> asList = Arrays.asList(a);
		Stream<String> stream = asList.stream();
		List<String> s1 = stream.filter(s -> s.contains("c")).map(s -> s.toUpperCase()).collect(Collectors.toList());
		// stream.forEach(System.out::print);
		System.out.println(s1);

		// diff betn findAny findFirst
		List<Integer> i = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		Integer fa = i.stream().findAny().get();
		Integer ff = i.stream().findFirst().get();
		Integer fap = i.parallelStream().findAny().get();// In parallelStream can get any value
		Integer faf = i.parallelStream().findFirst().get();
		System.out.println(" fa " + fa + " ff " + ff + " fap " + fap + " faf " + faf);

		int so[] = { 1, 3, 5, 9, 6 };

		for (int j = 0; j < so.length; j++) {
			for (int j2 = j + 1; j2 < so.length; j2++) {
				// if(j < j2)
			}
		}
	}

}
