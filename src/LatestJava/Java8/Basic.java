package LatestJava.Java8;

@FunctionalInterface
interface A {
	public Boolean checkSingleDigit(int x);
}

public class Basic implements A {
	@Override
	public Boolean checkSingleDigit(int x) {
		return isSingleDigit(x);
	}
	
	public static Boolean isSingleDigit(int x) {
		return x > -10 && x < 10;
		
	}
	

	public static void main(String[] args) {

		A a = Basic::isSingleDigit;
		Boolean checkSingleDigit = a.checkSingleDigit(9);
		System.out.println("Is Single Digit :: "+checkSingleDigit);
		
		
		A a1 = (x) -> {
			return x> 10 && x <10 ;
		};
		Boolean checkSingleDigit2 = a1.checkSingleDigit(29);
		System.out.println("Is Single Digit :: "+checkSingleDigit2);
		System.out.println(a + " :: "+a1);
		
	}

	

}
