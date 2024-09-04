package SolidPrinciple.Liskov;

public class TempEmployee extends Employee {

	int id;
	String name;

	public TempEmployee() {
	}

	public TempEmployee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int getMinimunSalary() {
		return 5000;
	}

	@Override
	public int getIncrement(int sal) {
		// TODO Auto-generated method stub
		return sal*5;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}
