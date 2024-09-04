package LatestJava.Java8;
interface test {
	boolean isTrue(String s, String s1);
}
interface sum {
	int sum1(int a, int b);
}
public class FunctionalInt implements sum {
	static void display() {
		System.out.println("display ");
	}
	@Override
	public int sum1(int a, int b) {
		return a + b;
	}
	public static void main(String[] args) {
		sum s = (var a, var b) -> a + b;
		int sum1 = s.sum1(10, 20);
		System.out.println(sum1);
		sum k = (var a, var b) -> {
			return a + b;
		};
		int sum12 = k.sum1(10, 20);
		System.out.println(sum12);
		test t1 = (var v, var y) -> v.equals(y);
		boolean true1 = t1.isTrue("n", "n");
		System.out.println("IsT:" + true1);
	}

}
