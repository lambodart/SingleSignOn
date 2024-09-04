package SolidPrinciple.Liskov;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LiskovMain {

	public static void main(String[] args) {

		permEmployee p = new permEmployee(1, "raja");
		TempEmployee t = new TempEmployee(2, "Babu");
		contractEmp c = new contractEmp(3, "ramesh");
		
		List<Employee> e = new ArrayList<Employee>();
		e.add(p);
		e.add(t);
		//e.add(c);

		List<MinimunSalary> min = new ArrayList<MinimunSalary>();
		min.add(c);
		min.add(p);
		min.add(t);
		
		List<MinimunSalary> s =  new LinkedList<MinimunSalary>();
		s.add(c);
		s.add(p);
		s.add(t);
		
		
		for (MinimunSalary minimunSalary : s) {
			System.out.println(minimunSalary.getMinimunSalary());
		}
	}

}
