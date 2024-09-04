import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> stdListWithName = Utility.stdListWithName();
		Comparator<Student> sortByAge = (emp1,emp2) -> emp1.getAge() - emp2.getAge();
		Comparator<Student> sortBySal = (emp1,emp2) -> emp1.getSalary() - emp2.getSalary();
		
		//stdListWithName.stream().sorted(sortBySal.thenComparing(sortByAge)).forEach(s -> System.out.println(s));
		
		
		
		//stdListWithName.stream().sorted((s1,s2) -> s1.getAge().compareTo(s2.getAge())).forEach(s-> System.out.println(s));;
		
		stdListWithName.stream().sorted(sortByAge).forEach(s-> System.out.println(s));;
		
		Stream<Student> sorted = stdListWithName.stream().sorted(sortByAge);
		stdListWithName.forEach(s-> System.out.println("sort ::"+s));
		
		List<String> asList = Arrays.asList("a","b");
		Stream<String> stream = asList.stream();
		List<String> s1 = stream.filter(s -> s.contains("c")).map(s -> s.toUpperCase()).collect(Collectors.toList());
		stream.forEach(System.out::print);
		System.out.println(s1);
		
		//Reverse the element of ArrayList of type String using Stream API in reverse order
		
		List<String> s = Arrays.asList("a","b","c");
	//	s.stream().
		
		Map<String, Integer> m = new ConcurrentHashMap<String, Integer>();
		m.put("a", 1);
		m.put("b", 2);
		m.put("c", 3);
		
		Iterator<String> iterator = m.keySet().iterator();
		
		while (iterator.hasNext()) {
		//	String string = (String) iterator.next();
			m.put("ad", 4);
		}
		System.out.println("M ::"+m);
	} 

}
