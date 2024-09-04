package LatestJava;

public class functionalImp implements functional1, functional2 {

	@Override
	public String tricky() {
		String tricky 	= functional2.super.tricky();
		String tricky2 	= functional1.super.tricky();
		String n = tricky + " : " + tricky2;
		System.out.println(n);
		return n;

	}

	@Override
	public void name() {
		System.out.println("ok");
	}

	public static void main(String[] args) {

		new functionalImp().name();
		
		String tricky = new functionalImp().tricky();
		System.out.println(tricky);
	}

}
