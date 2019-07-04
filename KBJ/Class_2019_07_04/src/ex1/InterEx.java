package ex1;

public class InterEx {
	public static void main(String[] args) {
		Circle c = new Circle(15);
		Drawable d = (Circle)c;
		Shape s = (Circle)c;
		d.draw();
		System.out.println(s.calculate());
	}
}
interface Drawable{
	public void draw();
}

abstract class Shape{
	public abstract double calculate();
}

class Circle extends Shape implements Drawable{
	private double r;
	public Circle(double r) {
		// TODO Auto-generated constructor stub
		this.r = r;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("이 객체는 원입니다.");
	}

	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return r*r*Math.PI;
	}
	
}