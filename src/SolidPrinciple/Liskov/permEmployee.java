package SolidPrinciple.Liskov;

public class permEmployee extends Employee {

	int id;
	String name;

	public permEmployee() {
	}

	public permEmployee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int getMinimunSalary() {
		// TODO Auto-generated method stub
		return 10000;
	}

	@Override
	public int getIncrement(int sal) {
		// TODO Auto-generated method stub
		return 10000 * 10;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

}
