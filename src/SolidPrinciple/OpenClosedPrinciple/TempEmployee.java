package SolidPrinciple.OpenClosedPrinciple;

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
	public int calculateSal(int sal) {
		return sal * 5;
	}

}
