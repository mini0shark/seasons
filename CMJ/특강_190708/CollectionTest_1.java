package CMJ.특강_190708;

import java.util.ArrayList;

public class CollectionTest_1 {
	public static void main(String[] args) {
		// 배열 (고정길이 자료구조)
		String[] names = new String[3];
		
		names[0] = "Chung";
		names[1] = "Min";
		names[2] = "Ji";
		
		for(String name : names) {
			System.out.print(name + "\t");
		}
		
		// ArrayList (가변길이 자료구조)
		ArrayList<String> nameList = new ArrayList<String>();
		
		nameList.add("Chung");
		nameList.add("Min");
		nameList.add("Ji");
		
		for(String name : nameList) {
			System.out.print(name + "\t");
		}
		
		nameList.remove(0);
		
		for(String name : nameList) {
			System.out.println(name);
		}
		
		nameList.add(0, "Chung");
		
		for(int i = 0;i < nameList.size();i++) {
			System.out.println(nameList.get(i) + "\t");
		}
	}
}