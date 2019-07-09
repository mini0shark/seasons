package CMJ.특강_190708;

public class Student {
	private String name;
	private int Korean;
	private int Mathematics;
	private int English;
	private double average;
	
	public Student(String name, int Korean, int Mathematics, int English) {
		this.name = name;
		this.Korean = Korean;
		this.Mathematics = Mathematics;
		this.English = English;
		this.average = (double) (Korean + Mathematics + English) / 3.0;
	}
	
	@Override
	public String toString() {
		return name + " 학생\n================\n국어 점수는 " + Korean +
				"점,\n수학 점수는 " + Mathematics + "점,\n영어 점수는 " +
				English + "점,\n평균은 " + average + "입니다.";
	}
}
