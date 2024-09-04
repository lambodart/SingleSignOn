package com.corejava;

public class finalConcept {
	private final double pi = 3.14; // we cant reassign
	private static double radius;
	// finally
	private void m1()
	{
		radius 	= 2 * pi * pi; 		// we can use it but cant reassign
		// pi 	= 4; 				// The final field finalConcept.pi cannot be assigned
		try {
		} finally {
			System.out.println("Finally always call");
			// use for cleanup activity for ex closing connection , thread shutdown , fileResouse close
		}
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("finalize mehod call ");
		super.finalize();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finalConcept concept = new finalConcept();
		radius = concept.pi;
		System.out.println(concept.pi);
		concept.m1();
		concept = null; // if we commrnt this we cant get finalize method
		System.gc();
	}

}
