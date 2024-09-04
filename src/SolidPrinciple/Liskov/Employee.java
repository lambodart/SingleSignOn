package SolidPrinciple.Liskov;

public abstract class Employee implements MinimunSalary, SalaryCalculate {

	int id;
	String name;

	public Employee() {
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract int getMinimunSalary();

	public abstract int getIncrement(int sal);
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

}
