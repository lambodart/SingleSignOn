import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	public static List<Student> stdList() {
		List<Student> stdList = new ArrayList();
		Student s = new Student(100, 15);
		Student s1 = new Student(600, 20);
		Student s2 = new Student(300, 30);
		Student s3 = new Student(310, 30);
		Student s4 = new Student(310, 25);

		stdList.add(s2);
		stdList.add(s1);
		stdList.add(s);
		stdList.add(s3);
		stdList.add(s4);
		return stdList;
	}

	public static void main(String[] args) {
		List<Student> stdList2 = stdList();
		// System.out.println("stdList2 : "+Arrays.toString(stdList2.toArray()));
		Stream<Integer> map = stdList2.stream().map(s -> s.getSalary());
		map.forEach(s -> System.out.println(s));
		System.out.println("------------");

		List<Student> stdList3 = stdList();
		// System.out.println("stdList3 ::"+Arrays.toString(stdList3.toArray()));
		Stream<Integer> map1 = stdList3.stream().map(s1 -> s1.salary);
		Stream<Integer> sorted2 = map1.sorted((s, s1) -> s1.compareTo(s));
		// Stream<Integer> sorted = map1.sorted();
		sorted2.forEach(s2 -> System.out.println(s2));
		System.out.println("Hi");

		List<Student> stdList = stdList();
		stdList.sort((s, s1) -> s1.getSalary() - s.getSalary());
		stdList.forEach(s2 -> System.out.println(s2.getSalary()));
		System.out.println("-----");

		List<Student> list = stdList();
		// list.stream().sorted((s,s1) -> s1.compareTo(s)
		// ).collect(Collectors.toList());
		list.stream().sorted((s, s1) -> s.getSalary() - s1.getSalary()).collect(Collectors.toList());
		list.forEach(s2 -> System.out.println(s2.getSalary()));

		List<Student> slist = stdList();
		Stream<Student> sorted = slist.stream().sorted((x, y) -> x.getSalary() - y.getSalary());
		Stream<Student> sorted3 = sorted.sorted((x, y) -> x.getAge() - y.getAge());
		sorted3.forEach(s -> System.out.println(s.getAge() + ":: " + s.getSalary()));

		List<Student> std = stdList();
		Comparator<Student> sal = (x, y) -> x.getSalary() - y.getSalary();
		Comparator<Student> age = (x, y) -> x.getAge() - y.getAge();
		Stream<Student> sorted4 = std.stream().sorted(sal.thenComparing(age));
		sorted4.forEach(s -> System.out.println(s.getSalary() + " :: " + s.getAge()));
		char nonRepeatingChar = nonRepeatingChar("swiss");
		System.out.println(" nonRepeatingChar :: "+nonRepeatingChar);
		String nonRepeatingCharUsiingStr = nonRepeatingCharUsiingStr("swiss");
		System.out.println("nonRepeatingCharUsiingStr :: "+nonRepeatingCharUsiingStr);
	}

	private static String nonRepeatingCharUsiingStr(String string) {
		IntStream map = string.chars().map(c -> (char) c);
		Stream<Integer> boxed = map.boxed();
		boxed.forEach(s -> System.out.println("boxed :: "+s));
		//System.out.println("Boxed"+boxed);
		Stream<Character> charStrign = string.chars().mapToObj(c -> (char) c);
		//System.out.println("chars :: "+charStrign);
		charStrign.forEach(s -> System.out.println("charStrign :: "+s));
		String a1[] = { "s", "w", "i", "s" };
		Map<String, Long> collect1 = Arrays.asList(a1).stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect1);

		Set<String> keySet2 = collect1.keySet();
		Iterator<String> itr = keySet2.iterator();

		while (itr.hasNext()) {
			String s = itr.next();
			if (collect1.get(s) == 1) {
				return s;
			}

		}
		return "N/A";
	}

	private static char nonRepeatingChar(String string) {

		// Map<Character , Integer > chars = new LinkedHashMap<Character, Integer>();
		Map<Character, Integer> chars = new HashMap<Character, Integer>();
		for (char ch : string.toCharArray()) {
			chars.put(ch, chars.getOrDefault(ch, 0) + 1);
		}
		
		System.out.println("Using Map :: " + chars);

		Character a[] = { 's', 'w', 'i', 's' };
		Map<Character, Long> collect = Arrays.asList(a).stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Char using Java 8 :: " + collect);

		Set<Character> keySet = collect.keySet();
		Iterator<Character> iterator = keySet.iterator();

		while (iterator.hasNext()) {
			Character character = (Character) iterator.next();
			if (collect.get(character) == 1) {
				return character;
			}
		}
		return 0;
	}

}
