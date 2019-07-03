package upAndDownCast;

class Person{
	private String name;
	private String id;
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
class Student extends Person{
	private String grade;
	private String major;
	public Student(String name) {
		super(name);
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
}
public class UpcastingTest {
	public static void main(String[] args) {
		Person p;
		Student s = new Student("æ»¥Î«ı");
		p=s;
		
		p= new Student("æ»¥Î«ı");
		s = (Student)p;
		System.out.println(s.getName());
		s.setGrade("A");
	}
}
