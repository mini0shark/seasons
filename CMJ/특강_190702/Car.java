package CMJ.Ư��_190702;

public class Car {
	String name;
	int speed;
	
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