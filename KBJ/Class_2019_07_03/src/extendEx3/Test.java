package extendEx3;

class Person{
	public Person() {
		System.out.println("Person Ŭ������ �����ڰ� ȣ�� �Ǿ����ϴ�.");
	}
}
class Student extends Person{
	public Student() {
		System.out.print("Student Ŭ������ �����ڰ� ȣ�� �Ǿ����ϴ�.");
	}
}
public class Test {
	public static void main(String[] args) {
		Person student = new Student();
	}
}
