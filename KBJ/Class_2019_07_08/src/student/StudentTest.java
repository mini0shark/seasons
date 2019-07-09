package student;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentTest {
	public static void main(String[] args) {
		
		
		Map<String , Student> map = new HashMap<String, Student>();
		map.put("choi", new Student("choi", 99,83, 72));
		map.put("kim", new Student("kim", 99,95, 97));
		map.put("kong", new Student("kong", 88,89, 79));
		map.put("kang", new Student("kang", 95,96, 98));
		map.put("jung", new Student("jung", 77,87, 98));
		
		Set<String> set = map.keySet();
		System.out.println("어떤 학생의 성적을 보시겠습니끼?");
		for(String a : set) {
			System.out.print(a+"\t");
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		System.out.println();
		System.out.println(map.get(name));
	}
}

class Student{
	private String name;
	private int korean;
	private int mathmatics;
	private int english;
	public Student() {
		this("unknown", 0,0,0);
	}
	public Student(String name, int korean, int mathmatics, int english) {
		super();
		this.name = name;
		this.korean = korean;
		this.mathmatics = mathmatics;
		this.english = english;
	}
	public String getName() {
			return this.name;
	}
	public int getKoreanScore() {
		return this.korean;
	}
	public int getMathmaticsScore() {
		return this.mathmatics;
	}

	public int getEnglishScore() {
		return this.english;
	}
	@Override
	public String toString() {
		return "이름 =" + name + ", [ 국어 성적=" + korean + ", 수학성적=" + mathmatics + ", 영어성적=" + english
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + english;
		result = prime * result + korean;
		result = prime * result + mathmatics;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (english != other.english)
			return false;
		if (korean != other.korean)
			return false;
		if (mathmatics != other.mathmatics)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

}