package day06;

import java.util.ArrayList;

public class CollectionExam1 {

	public static void main(String[] args) {
		String[] names = new String[3];
		names[0] = "kang";
		names[1] = "kim";
		names[2] = "hong";
		
		for(String name : names) {
			System.out.print(name+"\t");
		}
		
		System.out.println();
		ArrayList<String> nameList = new ArrayList<>();

		nameList.add("kang");
		nameList.add("kim");
		nameList.add("hong");
		nameList.add("choi");
		for(String name : nameList) {
			System.out.print(name+"\t");
		}
		System.out.println();
		System.out.println(nameList.get(0));
		for(String name : nameList) {
			System.out.print(name+"\t");
		}

		System.out.println();
		System.out.println(nameList.remove("choii"));
		System.out.println();
		System.out.println(nameList);
		for(String name : nameList) {
			System.out.print(name+"\t");
		}
	}
}
abstract class A{
	void a() {
		
	} 
	
}
