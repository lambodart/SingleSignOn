package LatestJava;

@FunctionalInterface
public interface functional2 {
	
	default String tricky() {
		return "functional2";
	}

	public void name();
}
