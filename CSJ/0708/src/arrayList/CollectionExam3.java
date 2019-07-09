package arrayList;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionExam3 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();  //순서 보장 X(인덱스X)
		
		map.put(10, "kang");
		map.put(20, "kim");
		map.put(30, "hong");
		map.put(40, "kkkk");
		
		
		System.out.println(map); //key=value 형식으로 출력(toString() override 해놓음)
		
		map.put(10, "choi");
		
		System.out.println(map);
		
		System.out.println(map.get(10));
		System.out.println(map.get(30));
		
		Set<Integer> keys = map.keySet();
		for(Integer key : keys) {
			System.out.println(map.get(key));
		}
	}
}
