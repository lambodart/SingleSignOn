import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class finalClass {

	/*
	 * Reverse the element of ArrayList of type String using Stream API in reverse
	 * order First non-repeating character in the given string (time and space
	 * complexity for all the codes) Implement first non-repeating character in the
	 * given string using spring boot
	 */
	public static void main(String[] args) {
		// Stream<String> map =
		Stream<String> sorted = List.of("a", "b", "c").stream().sorted();
		sorted.forEach(s-> System.out.println(s));
		
		List<Student> stdList = Utility.stdList();
		//(s1,s2) -> s.
		Comparator<Student> sortUsingSalary = (s1,s2) -> s1.getSalary().compareTo(s2.getSalary());
		
		Comparator<Student> sortUsingAge = (s1,s2) -> s1.getAge().compareTo(s2.getAge());
		
		stdList.stream().sorted(sortUsingSalary ).forEach(s -> System.out.println(" Sal :"+s.getSalary()+ "Age"+s.getAge()));
		stdList.stream().sorted(sortUsingSalary.thenComparing(sortUsingAge) ).forEach(s -> System.out.println(" Sal :"+s.getSalary()+ "Age"+s.getAge()));
		
		
		Stream<String> sorted1 = List.of("a", "b", "c").stream().sorted(  (s1,s2) -> -s1.compareTo(s2) );
		sorted1.forEach(s-> System.out.println(s));
		
		Stream<Integer> sorted2 = List.of(1,2,4).stream().sorted(  (s1,s2) -> -s1.compareTo(s2) );
		sorted2.forEach(s-> System.out.println(s));
		
		String s= "swiss";
		
		Map<Character , Integer> chars = new LinkedHashMap<Character, Integer>();
		char[] charArray = s.toCharArray();
		for(char c:charArray) {
		//	System.out.println("c ::"+chars.get(c));
			System.out.println("c ::"+chars.getOrDefault(c, 0)+1); //chars.getOrDefault(ch, 0) + 1
			chars.put(c, chars.getOrDefault(c, 0)+1);
		}
		
		Set<Character> 		keySet 	 = chars.keySet();
		Iterator<Character> iterator = keySet.iterator();
		
		while(iterator.hasNext()) {
			Character next = iterator.next();
			if (chars.get(next) == 1) {
				System.out.println("First :: "+next);
				break;
			}
		}
		System.out.println(chars);
	}
}