package CMJ.Ư��_190705;

public class CircleTest {
	public static void main(String[] args) {
		Circle firstCircle = new Circle(2, 3, 5);
		Circle secondCircle = new Circle(3, 2, 5);
		
		if(firstCircle.equals(secondCircle)) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
	}
}
