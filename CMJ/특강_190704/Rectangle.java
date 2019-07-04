package CMJ.Æ¯°­_190704;

public class Rectangle extends Shape {
	public Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	public double calculateArea() {
		System.out.println("Rectangle.calculateArea");
		return (double)w * h;
	}
}
