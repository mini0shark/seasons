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
		List<String> stringList = null; //list�� ������ �ִ� �ڷᱸ��
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
		
		
		Set<String> nameSet = new HashSet<>(); //set�� �ߺ��� ���� X, ���� ���� �ڷᱸ��(�ε���X)
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
		
		System.out.println(ballSet); //��°�� : 1212 => ���� �ٸ� �޸� �ּҸ� �����Ƿ� 
		
		for(Ball ball : ballSet) {
			System.out.println(ball);
		}
		
		Iterator<Ball> iter = ballSet.iterator(); //for - each ���� ������ ����
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
