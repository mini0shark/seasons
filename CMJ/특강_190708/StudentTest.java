package CMJ.특강_190708;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentTest {
	public static void main(String[] args) {
		Map<String, Student> stu = new HashMap<>();
		stu.put("홍광호", new Student("홍광호", 90, 100, 100));
		stu.put("박은태", new Student("박은태", 100, 90, 100));
		stu.put("민우혁", new Student("민우혁", 100, 100, 90));
		
		Set<String> keys = stu.keySet();
		
		Scanner sc = new Scanner(System.in);
		
		String enter = sc.next();
		System.out.println(stu.get(enter));
		
//		for(String key : keys) {
//			if(key.equals(enter))
//		}
	}
}
