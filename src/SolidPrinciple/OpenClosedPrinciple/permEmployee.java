package SolidPrinciple.OpenClosedPrinciple;

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
	public int calculateSal(int sal) {
		return sal * 10;
	}

}
