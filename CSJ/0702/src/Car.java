
public class Car {
	String name;
	int speed;
	static String ������;
	static int numberOfCars;
	
	//�޼ҵ� ����
	//name ���� �̸��� �ο��ϴ� �޼���
	//���������� ����Ÿ�� �޼ҵ��(�Ű�����)
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public Car() {
		name = "MyCar";
		speed= 0;
		numberOfCars++;
	}
	
	public void setName1(String name) {
		name = name;
	}
	public void setSpeed(int s) {
		speed = s;
	}
	
	public int getSpeed() {
		return speed;
	}
}
