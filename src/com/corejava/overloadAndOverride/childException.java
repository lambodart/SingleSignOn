package com.corejava.overloadAndOverride;


public class childException extends ParentException {
	
	
	@Override
	public void m1() {
		System.out.println("childException");
	}

	public static void name() {
		System.out.println("child");
	}

}
