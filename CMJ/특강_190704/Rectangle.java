package CMJ.특강_190704;

public class Rectangle extends Shape implements Drawable {
	public Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	public double calculateArea() {
		System.out.println("Rectangle.calculateArea");
		return (double)w * h;
	}
	
	@Override
	public void draw() {
		System.out.println("Rectangle Draw");
	}
}