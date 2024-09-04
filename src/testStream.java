import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class testStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		List<Student> stdList = Utility.stdList();
		Stream<Student> sorted = stdList.stream().sorted(Comparator.comparing(Student :: getSalary));
		sorted.forEach(s -> System.out.println(s.getName() + " :: "+ s.getSalary()));
		Stream<Integer> map = stdList.stream().sorted(Comparator.comparing(Student :: getSalary)).map(s -> s.getSalary());
		map.forEach(s -> System.out.println("Sal :: "+s));
		
		OptionalInt first = stdList.stream().sorted(Comparator.comparing(Student :: getSalary)).mapToInt(s->s.getSalary()).findFirst();
		System.out.println(first.getAsInt());
		if( first.isPresent() )
		{
			System.out.println(first.getAsInt());
		}
	}

}
