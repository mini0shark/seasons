package extendEx3;

class Person{
	public Person() {
		System.out.println("Person 클래스의 생성자가 호출 되었습니다.");
	}
}
class Student extends Person{
	public Student() {
		System.out.print("Student 클래스의 생성자가 호출 되었습니다.");
	}
}
public class Test {
	public static void main(String[] args) {
		Person student = new Student();
	}
}
