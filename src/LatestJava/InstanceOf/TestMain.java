package LatestJava.InstanceOf;

public class TestMain {

	public static void afterJava17(Account acc) {
		if (acc instanceof Debit d) {
			String name = d.name();
			System.out.println("Type :: " + name);
		}
		if (acc instanceof Saving d) {
			String name = d.name();
			System.out.println("Type :: " + name);
		}
	}

	public static void beforeJava17(Account acc) {
		if (acc instanceof Debit) {
			Debit d = (Debit) acc;
			String name = d.name();
			System.out.println("Type :: " + name);
		}
		if (acc instanceof Saving) {
			Saving d = (Saving) acc;
			String name = d.name();
			System.out.println("Type :: " + name);
		}
	}

	public static void main(String[] args) {
		Account a = new Saving();
		Account b = new Debit();
		afterJava17(a);
		beforeJava17(b);
	}

}
