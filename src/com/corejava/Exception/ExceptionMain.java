package com.corejava.Exception;

public class ExceptionMain {

	public static void main(String[] args) throws orderNotFoundException {
		try {
			System.out.println(10 / 0);
		}
		//order is important 
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		if (true) {
			throw new orderNotFoundException("Order Not Found ");
		}
	}

}
