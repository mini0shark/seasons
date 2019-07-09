package day06;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionTest2 {
		public static void main(String[] args) {
			Map<Integer, String> map = new HashMap<Integer, String>();
			map.put(1, "kang");
			map.put(2, "kim");
			map.put(3, "hong");
			System.out.println();
			
			Set<Integer> keys = map.keySet();
			for(Integer a : keys) {
				System.out.println(map.get(a));
			}
			System.out.println(map);
		}
}
