package extendEx2;
class Shape{
	public void draw() {
		System.out.println("��ü���� ������ �׸� �� �����ϴ�. ����ؼ� ������ �ϼ���");
	}
	
}
class Rect extends Shape{
	public void draw() {
		System.out.println("�簢���� �׷Ƚ��ϴ�.");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("���� �׷Ƚ��ϴ�.");
	}
}
public class ShpeTest {
	public static void main(String[] args) {
		Shape rect = new Rect();
		Shape circle = new Circle();
		rect.draw();
		circle.draw();
		
	}
}
