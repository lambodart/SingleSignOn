package SolidPrinciple.Liskov;

public class contractEmp implements MinimunSalary {

	int id;
	String name;

	public contractEmp() {
	}

	public contractEmp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int getMinimunSalary() {
		// TODO Auto-generated method stub
		return 3000;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}
