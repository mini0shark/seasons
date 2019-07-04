
public class ShapeTest {
	public static void main(String[] args) {
		Shape rect = new Rectangle(10, 20);
		Shape cir = new Circle(5);
		Shape tri = new Triangle(10, 20);
		System.out.println("rect's area : "+rect.calculateArea());
		System.out.println("tri 's area : "+tri.calculateArea());
		System.out.println("cir's area : "+cir.calculateArea());
		
	}
}
abstract class Shape{
	public abstract double calculateArea();
}
class Circle extends Shape{
	private double r;
	public Circle(int r) {
		super();
		this.r = r;
	}
	public double calculateArea() {
		return (double)r*r*Math.PI;
	}
	
}
class Rectangle extends Shape{
	private double w;
	private double h;
	public Rectangle(int w, int h) {
		super();
		this.w = w;
		this.h = h;
	}
	public double calculateArea() {
		return (double)w*h;
	}
}

class Triangle extends Shape{
	private double w;
	private double h;
	public Triangle(int w, int h) {
		super();
		this.w = w;
		this.h = h;
	}
	public double calculateArea() {
		return (double)w*h/2;
	}
}