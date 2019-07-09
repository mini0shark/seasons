package Test;

import java.util.ArrayList;
import java.util.List;

public class Student {
	String name;
	int korean;
	int math;
	int english;
	
	public Student(String name, int korean, int math, int english) {
		this.name = name;
		this.korean = korean;
		this.math = math;
		this.english = english;
	}
	
	@Override
	public String toString() {
		return name + " 국어점수: " + korean + " 수학점수: " + math + " 영어점수: " +  english + "\n";
	}
}
