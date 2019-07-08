package CMJ.특강_190703;

public class Student extends Person{
	public void set() {
		age = 30;
		name = "홍길동";
		height = 175;
		setHeight(99);
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.set();
	}
}