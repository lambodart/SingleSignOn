import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class planetMain {

	public static void main(String[] args) {


		List<Planet> planets = new ArrayList<Planet>();
		// planets.add(new Planet("mer", false));
		// planets.add(new Planet("nep", true));
		planets.add(new Planet("Mercury", false));
		planets.add(new Planet("Venus", false));
		planets.add(new Planet("Earth", true));
		planets.add(new Planet("Mars", true));
		planets.add(new Planet("Jupiter", false));
		planets.add(new Planet("Saturn", false));
		planets.add(new Planet("Uranus", false));
		planets.add(new Planet("Neptune", false));

		planets.stream().filter(planet -> (planet.getInhab() == false))
				.collect(Collectors.toList());
		List<Planet> Inplanets = planets.stream().filter(planet -> (planet.getInhab() == false))
				.collect(Collectors.toList());
		// Inplanets.forEach(s -> System.out.println("Planet Not In ::" + s.getName()));

		List<Planet> Inplanets1 = planets.stream().filter(Planet::getInhab).collect(Collectors.toList());
		// Inplanets1.forEach(s -> System.out.println("Planet In ::" + s.getName()));

		List<Student> stdList = Utility.stdList();
		// stdList.sort((s,s1) -> s.getSalary() - s1.getSalary());
		stdList.stream().sorted((s, s1) -> s1.getSalary() - s.getSalary()).forEach(System.out::println);

		System.out.println("--------");
		stdList.stream().map(s -> s.getSalary()).sorted((s, s1) -> s.compareTo(s1)).collect(Collectors.toList());
		List<Student> collect = stdList.stream().sorted(((s, s1) -> s.getSalary() - s1.getSalary()))
				.collect(Collectors.toList());

		Comparator<Student> sal = (s, s1) -> s.getSalary() - s1.getSalary();
		Comparator<Student> age = (s, s1) -> s.getAge() - s1.getAge();
		stdList.stream().sorted(sal.thenComparing(age));
		List<Student> filteredStd = stdList.stream().sorted(sal.thenComparing(age)).collect(Collectors.toList());
		filteredStd.forEach(s -> System.out.println(s));
	}

}
