import java.util.Objects;

public class Student {
	public String Name;
	public Integer salary;
	public Integer age;
	public Student() {
		
	}
	public Student(Integer salary, Integer age,String Name) {
		super();
		this.salary = salary;
		this.age 	= age;
		this.Name 	= Name;
	}
	
	public Student(Integer salary, Integer age) {
		super();
		this.salary = salary;
		this.age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getSalary() {
		return salary;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Name, age, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(Name, other.Name) && Objects.equals(age, other.age)
				&& Objects.equals(salary, other.salary);
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", salary=" + salary + ", age=" + age + "]";
	}
		
	private String a;
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a=a;
	}
}
