package com.corejava.Java8;

public interface payment {

	// this is day to day transavtion of particular payments will change from bank
	// to bank
	public void doTransaction();

	// this feature is depend on the implementation class whether they want to give
	// any coupon or not
	default void addCoupon() {
		System.out.println("this is special coupon ");
	}

	// This is common feature for all to mandatory and have same report so will take
	// it as static
	static void transactionReport() {
		System.out.println("DayEnd Report for transaction ");
	}
}
