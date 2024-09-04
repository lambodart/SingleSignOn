package SolidPrinciple.OpenClosedPrinciple;

public class openClosedMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new permEmployee();
		Employee e1 = new TempEmployee();

		int calculateSal 	= e.calculateSal(1000);
		int calculateSal2 	= e1.calculateSal(1000);
		
		System.out.println(calculateSal);
		System.out.println(calculateSal2);
		
		
	}

}
