package CMJ.특강_190705;

public class CircleTest {
	public static void main(String[] args) {
		Circle firstCircle = new Circle(2, 3, 5);
		Circle secondCircle = new Circle(3, 2, 5);
		
		if(firstCircle.equals(secondCircle)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
	}
}
