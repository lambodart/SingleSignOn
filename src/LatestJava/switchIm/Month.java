package LatestJava.switchIm;

public class Month {

	public static int name(String month) {
		int n = 0;
		switch (month) {
		case "jan":
			n = 1;
			break;
		case "feb":
			n = 2;
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + month);
		}
		return n;
	}

	public static int getMonth(String month) {

		return switch (month) {
		case "jan" -> 1;
		case "feb" -> 2;
		default -> throw new IllegalArgumentException();
		};

	}
	
	public static boolean getInhabi(String planet)  {
		return switch(planet) {
		case "nep" -> true;
		default ->throw new IllegalArgumentException("Please Enter Planet");
		};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = getMonth("jan");
		int wrng = getMonth("");
		int name = name("feb");
		
		System.out.println("old :"+month +" new :"+ name+ " wrng :"+wrng);
		
		boolean inhabi = getInhabi("nep1");
		System.out.println(inhabi);
	}

}
