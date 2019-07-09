package CMJ.특강_190708;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class CollectionTest_3 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Chung");
		map.put(2, "Min");
		map.put(3, "Ji");
		
		System.out.println(map);
		System.out.println();
		
		map.put(1, "Hong Gwang Ho ");
		
		System.out.println(map);
		System.out.println();
		
		System.out.println(map.get(1));
		System.out.println(map.get(3));
		System.out.println();
		
		Set<Integer> keys = map.keySet();
		
		for(Integer key : keys) {
			System.out.println(map.get(key));
		}
		
		Stack<String> stack = new Stack<>();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		stack.remove(0);
		
		System.out.println(stack);
		
	}
}
