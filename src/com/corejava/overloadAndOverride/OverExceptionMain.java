package com.corejava.overloadAndOverride;

public class OverExceptionMain {
	// can we override static and private method -- No -- The method name() of type
	// childException must override or implement a supertype method static method
	// @override
	// If child throws exception parent has to handle it also
	// if parent throws no need to handle in child

	public static void main(String[] args) {
		// in this case m1() compliler check if present in Child class if not present
		// take it from parent class in that case op will be from parent class
		ParentException exception2 = new childException();
		exception2.m1();
		exception2.name(); 		// it will run from parent
		ParentException.name();	// only bcoz static method can call from there class name

		ParentException exception = new ParentException();
		exception.m1();

		childException childException = new childException();
		childException.m1();

		// childException childException = new ParentException();
		// Type mismatch: cannot convert from ParentException to childException

		// childException childException =
		// (com.corejava.overloadAndOverride.childException) new ParentException();
		// parentException cannot be cast to class
		// childException.m1();
	}

}
