import java.util.ArrayList;
import java.util.List;

public class Utility {

	public static List<Student> stdList() {
		List<Student> stdList = new ArrayList();
		Student s = new Student(100, 15);
		Student s1 = new Student(600, 20);
		Student s2 = new Student(300, 30);
		Student s3 = new Student(310, 30);
		Student s4 = new Student(310, 25);

		stdList.add(s);
		stdList.add(s1);
		stdList.add(s2);
		stdList.add(s3);
		stdList.add(s4);
		return stdList;
	}
	
	public static List<Student> stdListWithName() {
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
}
