import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CustomArrayList extends ArrayList {

	@Override
	public boolean add(Object e) {

		if (this.contains(e))
			return true;
		else
			return super.add(e);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomArrayList c = new CustomArrayList();
		c.add(1);
		c.add(1);
		c.add(1);
		c.add(2);
		System.out.println(c);
		
		Set<Student> s = new HashSet<Student>();
		new Student(10, 15);
		s.add(new Student(10, 15));
		s.add(new Student(10, 15));
		s.add(new Student(10, 15));
		s.add(new Student(10, 15));
		s.add(new Student(10, 15));
		System.out.println(s);
	}

}
