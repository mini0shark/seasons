package CMJ.특강_190708;

import java.awt.*;
import java.util.*;

public class CollectionTest_2 {
	public static void test(List<String> list) {
		
	}
	
	public static void test(LinkedList<String> list) {
		
	}
	
	public static void test(ArrayList<String> list) {
		
	}
	
	public static void main(String args[]) {
		List<String> stringList = null;
		LinkedList<String> list = new LinkedList<>();
		ArrayList<String> alist = new ArrayList<>();
		
		test(stringList);
		test(list);
		test(alist);
		
		List<String> nameList = new ArrayList<>();
		nameList.add("Chung");
		nameList.add("Min");
		nameList.add("Ji");
		
		Set<String> nameSet = new HashSet<>();
		
		List<Ball> ballList = new ArrayList<>();
		ballList.add(new Ball(1));
		ballList.add(new Ball(2));
		ballList.add(new Ball(1));
		ballList.add(new Ball(2));
		
		System.out.println(ballList);
		
		Set<Ball> ballSet = new HashSet<>();
		ballSet.add(new Ball(1));
		ballSet.add(new Ball(2));
		ballSet.add(new Ball(1));
		ballSet.add(new Ball(2));
		
		System.out.println(ballSet);
		
		for(Ball ball : ballSet) {
			System.out.println(ball);
		}
		
		Iterator<Ball> iter = ballSet.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
}
