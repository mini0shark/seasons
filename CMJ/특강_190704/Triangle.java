package CMJ.Æ¯°­_190704;

public class Triangle extends Shape {
	public Triangle(int t, int h) {
		this.h = h;
		this.t = t;
	}
	
	public double calculateArea() {
		System.out.println("Triangle.calculateArea");
		return (double)t * h / 3;
	}
}
