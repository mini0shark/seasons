package CMJ.Ư��_190704;

public class ShapeTest {
	public static void main(String[] args) {
		Shape C = new Circle(5);
		System.out.println(C.calculateArea());
		
		Shape R = new Rectangle(3, 4);
		System.out.println(R.calculateArea());
		
		Shape T = new Triangle(3, 5);
		System.out.println(T.calculateArea());
	}
}