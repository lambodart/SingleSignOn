import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class failSafe {

	public static void main(String[] args) {

		List<String> s = new ArrayList<String>();
		s.add("a");
		s.add("b");
		s.add("c");
		System.out.println("nm :: " + s);

		Iterator<String> iterator = s.iterator();

		while (iterator.hasNext()) {
			//s.add("t");
			s.remove(0);
		}
		System.out.println("s ::"+s);
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		System.out.println("map :: " + map);
		Set<String> keySet = map.keySet();
		Iterator<String> iterator2 = keySet.iterator();

		while (iterator2.hasNext()) {

		}

		Map<String, Integer> ch = new ConcurrentHashMap<String, Integer>();
		ch.put("a", 1);
		ch.put("b", 2);
		ch.put("c", 3);
		System.out.println("CH :: " + ch);
		Set<String> keySet1 = ch.keySet();
		Iterator<String> iterator3 = keySet1.iterator();

		while (iterator3.hasNext()) {
		}
		System.out.println("nm1 :: " + s);
		System.out.println("map1 :: " + map);
		System.out.println("CH1 :: " + ch);

	}

}
