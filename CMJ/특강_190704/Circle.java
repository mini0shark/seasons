package CMJ.특강_190704;

public class Circle extends Shape implements Drawable {
	public Circle(int r) {
		this.r = r;
	}
	
	public double calculateArea() {
		System.out.println("Circle.calculateArea");
		return (double)r * r * Math.PI;
	}
	
	@Override
	public void draw() {
		System.out.println("Circle Draw");
	}
}
