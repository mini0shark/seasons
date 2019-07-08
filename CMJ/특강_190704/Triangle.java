package CMJ.특강_190704;

public class Triangle extends Shape implements Drawable {
	public Triangle(int t, int h) {
		this.h = h;
		this.t = t;
	}
	
	public double calculateArea() {
		System.out.println("Triangle.calculateArea");
		return (double)t * h / 3;
	}
	
	public void draw() {
		System.out.println("Triangle Draw");
	}
}
