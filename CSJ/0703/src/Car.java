
public class Car {
	String name;
	int speed;
	static String ������;
	
	public Car() {
		this("�̸�����", 0);
		System.out.println("Car() ������ ����");
		
	}
	public Car (String name) {
		//this(name,0);
		System.out.println("Car(String name) ������ ����");
		this.name = name;
		
	}
	
	public Car (String name, int speed) {
		this(name);
		System.out.println("Car(String name, int speed) ������ ����");
		//this.name = name;
		this.speed = speed;
	}
	
}
