package com.corejava;

public class StringSCP {

	public static void main(String[] args) {

		String s  = new String("lam");
		String s2 = "lam";
		
		int hashCode  = s.hashCode();
		int hashCode2 = s.intern().hashCode();
		int hashCode3 = s2.hashCode();
		int hashCode4 = s2.intern().hashCode();
		
		System.out.println(hashCode +" : " +hashCode2 +" : " + hashCode3 +" : " +hashCode4);
		System.out.println(s.intern() + " :: " +s2.intern());
	}

}
