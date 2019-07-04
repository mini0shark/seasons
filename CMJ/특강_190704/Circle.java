package CMJ.Æ¯°­_190704;

public class Circle extends Shape {
	public Circle(int r) {
		this.r = r;
	}
	
	public double calculateArea() {
		System.out.println("Circle.calculateArea");
		return (double)r * r * Math.PI;
	}
}
