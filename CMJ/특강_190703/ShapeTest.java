package CMJ.특강_190703;

public class ShapeTest {
	public static void main(String[] args) {
		Point p = new Point(3, 4);
		
		p.show();
		
		p.setX(5);
		p.setY(10);
		
		p.show(true);
		p.show(false);
	}
}