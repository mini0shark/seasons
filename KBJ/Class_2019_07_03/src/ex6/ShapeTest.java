package ex6;

public class ShapeTest {
	public static void main(String[] args) {
		Point shape = new Point(2,5);
		Point shape2 = new Point(10,23);

		shape.show(true);
		shape2.show(true);
		shape.show(false);
		shape2.show(false);
	}

}
