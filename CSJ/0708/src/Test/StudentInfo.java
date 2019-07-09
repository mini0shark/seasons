package Test;

import java.util.HashMap;
import java.util.Map;

public class StudentInfo {
	public static void main(String[] args) {
		
		Map <String, Student> studentMap = new HashMap<>();
		studentMap.put("kang", new Student("kang", 100,90,90));
		studentMap.put("choi", new Student("choi", 90,100,100));
		studentMap.put("hong", new Student("hong", 100,80,100));
		studentMap.put("lee", new Student("lee", 80,70,100));
		studentMap.put("cha", new Student("cha", 100,100,100));
		

		System.out.println(studentMap);
	}
}
