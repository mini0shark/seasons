package arrayList;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;


public class CollectionExam2 {
	
	public static void test(List<String> list) {
		
	}
	
	public static void main(String[] args) {
		List<String> stringList = null; //list는 순서가 있는 자료구조
		LinkedList<String> list = new LinkedList<>();
		ArrayList<String> alist = new ArrayList<>();
		
		test(stringList);
		test(list);
		test(alist);
		
		List<String> nameList = new ArrayList<>();
		nameList.add("kang");
		nameList.add("kim");
		nameList.add("kang");
		System.out.println(nameList);
		
		
		Set<String> nameSet = new HashSet<>(); //set은 중복값 혀용 X, 순서 없는 자료구조(인덱스X)
		nameSet.add("kang");
		nameSet.add("kim");
		nameSet.add("kang");
		System.out.println(nameSet);
		
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
		
		System.out.println(ballSet); //출력결과 : 1212 => 서로 다른 메모리 주소를 가지므로 
		
		for(Ball ball : ballSet) {
			System.out.println(ball);
		}
		
		Iterator<Ball> iter = ballSet.iterator(); //for - each 문과 동일한 역할
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
