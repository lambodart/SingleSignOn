import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class medium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = List.of(10,4,22,23,22,4);
		List<String> numberWith1 = List.of(10,12,22,23).stream().map(s-> s+"").filter(a -> a.startsWith("1")).collect(Collectors.toList());
		//System.out.println(numberWith1);
		//numbers.stream().filter(i -> i%2 == 0).collect(Collectors.toList()).forEach(s-> System.out.println(s));
		//numbers.stream().filter(i -> i%2 == 0).map(a -> a*a).forEach(s-> System.out.println(s));
		//numbers.stream().collect(Collectors.toSet()).forEach(s-> System.out.println(s));
		Set<Integer> set = new HashSet();
		System.out.println(set.add(5));
		System.out.println(set.add(5));
		numbers.stream() .filter(n -> !set.add(n) )  .forEach(s-> System.out.println(" ! :"+s));
		
		numbers.stream() .filter(n -> set.add(n) )  .forEach(s-> System.out.println("  :"+s));
	
		long count = numbers.stream().distinct().map(i->i).count();
		System.out.println(count);
		numbers.stream().distinct().map(i->i).forEach(s-> System.out.println(":"+s)); 
		Integer integer = numbers.stream().findFirst().get();
		
		Stream<Integer> sorted = numbers.stream().sorted();
		List<Integer> collect = numbers.stream().sorted( (i,i1) -> i.compareTo(i1)).collect(Collectors.toList());
		List<Integer> collect1 = numbers.stream().sorted( (i,i1) -> -i.compareTo(i1)).collect(Collectors.toList());
		System.out.println("Sort ::"+collect);
		System.out.println("Sort ::"+collect1);
		
		Integer maxVal = numbers.stream().max(Comparator.naturalOrder()).get();
		System.out.println("MAX :: "+maxVal);
		
		Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();
		String input = "Java articles are Awesome";
		 input = input.replace(" ",""); 
		 char[] charArray = input.strip().toCharArray();
		 for (char c : charArray) {
			m.put(c, m.getOrDefault(c, 0)+1);
		}
		Set<Character> keySet = m.keySet();
		Iterator<Character> iterator = keySet.iterator();
		for (Iterator iterator2 = keySet.iterator(); iterator2.hasNext();) {
			Character character = (Character) iterator2.next();
			if (m.get(character) == 1) {
				
			}
		}
		 
		 input.chars() // Stream of String       
         .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase         
         .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count 
         .entrySet()
         .stream()
         .filter(entry -> entry.getValue() == 1L)
         .map(entry -> entry.getKey())
         .findFirst()
         .get();
		 
		 
		 Iterator<Character> iterator2 = input.chars() // Stream of String       
         .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase         
         .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count 
         .keySet()
         .iterator( );
		 
		 LocalDate 		now  = LocalDate.now();
		 LocalTime 		now2 = LocalTime.now();
		 LocalDateTime	now3 = LocalDateTime.now();
		 System.out.println(now +" : "+now2 +" : "+ now3);
		 
		 
		  List<String> names = Arrays.asList("AA", "BB", "AA", "CC","DD","DD","EE","EE","EE");
		  Map<String, List<String>> collect2 = names.stream().collect(Collectors.groupingBy(Function.identity()));
		  Map<String, Long> collect3 = names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		  System.out.println(""+collect2 + " ::: "+collect3);
		  List<String> collect4 = names.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		  .entrySet().stream().filter(e -> e.getValue() > 1L).map(e->e.getKey())
		  .collect(Collectors.toList());
		  System.out.println(collect4);
		  //.forEach(s -> System.out.println("Duplicates :: "+s));
		 
		  int[] arr = {12,19,20,88,00,9};
		  IntStream 		stream  = Arrays.stream(arr);
		  Stream<Integer> 	stream2 = numbers.stream();
		  stream.forEach(System.out::println);
		  stream2.forEach(System.out::println);
		  String a= "SBI";
		  List<String> of = List.of(a);
		  Map<String, Long> collect5 = of.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
		  System.out.println("MAP :: "+collect5);
		  System.out.println(of);
		  of.stream().map(s -> s.toUpperCase()).filter(i -> i.equals("SBI") ).forEach(s -> System.out.println("op ::"+s));
		  
		 //getAllEmployees
		  List<Employee> employeeList = Employee.employeeList();
		  //count of male female
		  countMaleAndFemale(employeeList);
		  //print the names of all departments in the organization.
		  getAllDepts(employeeList);
		  //find avg age of male
		  getAvgAgeMale(employeeList);
		  // Names of employees who joined after 2015.
		  getNameEmployees(employeeList);
		  //countNumberempInEachDept
		  Map<String, Long> countNumberempInEachDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment , Collectors.counting()));
		  System.out.println("countNumberempInEachDept : "+countNumberempInEachDept);
		  //average salary of each department.
		  Map<String, Double> avgSalary = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment , Collectors.averagingDouble(Employee::getSalary)));
		  System.out.println("avagSala"+avgSalary);
		  //findOldEmpl
		  Comparator<Employee> sortBySal = (emp1,emp2) -> (int)emp1.getSalary() - (int)emp2.getSalary();
		  List<Double> employeeListSal = employeeList.stream().sorted(sortBySal).map(i -> i.getSalary()).collect(Collectors.toList());
		  System.out.println("sort 1: "+employeeListSal);
		  Comparator<Employee> sortBySal2 = (emp1,emp2) -> (int)emp2.getSalary() - (int)emp1.getSalary();
		  List<Double> employeeListSal2 = employeeList.stream().sorted(sortBySal2).map(i -> i.getSalary()).collect(Collectors.toList());
		  System.out.println("sort 2: "+employeeListSal2);
		  
		  Comparator<Employee> sortByAge = (emp1,emp2) -> emp2.getAge() - emp1.getAge();
		  List<Integer> sortByAgeList = employeeList.stream().sorted(sortByAge).map(i -> i.getAge()).collect(Collectors.toList());
		  System.out.println("sortByAgeList:: "+sortByAgeList);
		  Employee employee = employeeList.stream().sorted(sortByAge).findFirst().get();
		  System.out.println(employee);
	}

	private static void getNameEmployees(List<Employee> employeeList) {
		//Stream<Integer> map = 
		List<Integer> yr = employeeList.stream().map( emp -> emp.getYearOfJoining())
		.filter( emp -> emp>2015)
		.collect(Collectors.toList());
		System.out.println(" yr "+yr);
		
		 String year = employeeList.stream().filter(Employee -> Employee.getYearOfJoining() > 2015)
		 .map(Employee :: getName).collect(Collectors.joining(" , "));
		System.out.println(year);
		
	}

	private static void getAvgAgeMale(List<Employee> employeeList) {
		Long collect = employeeList.stream().filter( Employee -> Employee.getGender().equals("Male"))
		.map(i -> i.getAge()).collect(Collectors.counting());
		System.out.println(collect);
		 Map<String, Double> avg = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,(Collectors.averagingInt( Employee :: getAge) ) ));
		 System.out.println("Avg :: "+avg);
	}

	private static void getAllDepts(List<Employee> employeeList) {
		List<String> deptList = employeeList.stream().map( Employee :: getDepartment).distinct().collect(Collectors.toList());
		String		 deptString = employeeList.stream().map( Employee :: getDepartment).distinct().collect(Collectors.joining(","));
		System.out.println("deptString :"+deptString +"\ndeptList : "+deptList);
		
	}

	private static void countMaleAndFemale(List<Employee> employeeList) {
		Map<String, Long> countMaleFemale = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println("countMaleFemale : "+countMaleFemale);
	}

}
