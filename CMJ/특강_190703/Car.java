package CMJ.Ư��_190703;

public class Car {
	String name;
	int speed;
	static int numberOfCars;
	
	public Car() {
		name = "MyCar";
		speed = 0;
		numberOfCars++;
	}
	
	public Car(String name, int speed) {
		//this(name); --> ������ ȣ��
		System.out.println("Car(String name, int speed) ����");
		this.name = name;
		this.speed = speed;
	}
	
	public Car(String name) {
		System.out.println("Car(String name) ����");
		this.name = name;
	}
	
	//�޼ҵ带 �����ϴ� ���
	//���������� ����Ÿ�� �޼ҵ��(�Ű�������...)
	
	//this -> �� Ŭ������ �ʵ带 ����ų �� ����.
	//super -> �θ� Ŭ������ ����Ų��.
	
	//�̸��� �����ִ� �޼ҵ�
	public void setName(String name) {
		this.name = name;
	}
	
	//�̸��� �޴� �޼ҵ�
	public String getName() {
		return this.name;
	}
	
	//�ӵ��� �����ִ� �޼ҵ�
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//�� �ӵ��� �޴� �޼ҵ�
	public int getSpeed() {
		return this.speed;
	}
}