import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] a = { "l", "s", "k", "s", "w", "k", "w", "j" };
		String fiest = fiest(a);
		System.out.println("NM :: " + fiest);
		String mapT = MapT(a);
		System.out.println("map :: " + mapT);
		List<String> allOnes = AllOnes(a);
		System.out.println("All Ones :: "+allOnes);
	}

	private static List<String> AllOnes(String[] string) {

		List<String> allOnes = new ArrayList<String>();
		LinkedHashMap<String, Integer> lhp = new LinkedHashMap<String, Integer>();
		System.out.println(Arrays.toString(string));
		for (String s : string) {
			// lhp.put(s, lhp.getOrDefault(s, 0) + 1);
			// lhp.put( s, lhp.get(s)+1 );
			if (!lhp.containsKey(s)) {
				lhp.put(s, 1);
			} else {
				lhp.put(s, lhp.get(s) + 1);
			}
		}
		System.out.println("Lh" + lhp);

		Set<String> keySet = lhp.keySet();
		Iterator<String> itr = keySet.iterator();

		while (itr.hasNext()) {
			String str = itr.next();
			if (lhp.get(str) == 1) {
				allOnes.add(str);
			}

		}

		return allOnes;
	}

	private static String MapT(String[] string) {
		LinkedHashMap<String, Integer> lhp = new LinkedHashMap<String, Integer>();
		System.out.println(Arrays.toString(string));
		for (String s : string) {
			// lhp.put(s, lhp.getOrDefault(s, 0) + 1);
			// lhp.put( s, lhp.get(s)+1 );
			if (!lhp.containsKey(s)) {
				lhp.put(s, 1);
			} else {
				lhp.put(s, lhp.get(s) + 1);
			}
		}
		System.out.println("Lh" + lhp);

		Set<String> keySet = lhp.keySet();
		Iterator<String> itr = keySet.iterator();

		while (itr.hasNext()) {
			String str = itr.next();
			if (lhp.get(str) == 1)
				return str;
		}

		return "";
	}

	private static String fiest(String[] string) {

		Stream<String> stream = Arrays.asList(string).stream();

		Map<String, Long> collect2 = stream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect2);

		Set<String> keySet = collect2.keySet();
		Iterator<String> itr = keySet.iterator();

		while (itr.hasNext()) {
			String str = itr.next();
			if (collect2.get(str) == 1)
				return str;
		}
		return " ";
	}

}
