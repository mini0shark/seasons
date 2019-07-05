
 abstract class Shape {
 public abstract double calculateArea();
 
}
 
 class Circle extends Shape implements Drawable{

	private double r;
	
	 Circle(double r){
		this.r=r;
	}

	@Override
	public double calculateArea() {
		return (double)r*r*Math.PI;
	}
	
	public void draw() {
		System.out.println("이 객체는 원 입니다.");
	}
	 
 }
 
 
 class Triangle extends Shape{

	private double w;
	private double h;
	
	Triangle(double w,double h){
		this.w=w;
		this.h=h;
	}

	@Override
	public double calculateArea() {
		
		return (double)w*h*1/2;
	}
	 
 }
 
 
 class Rectangle extends Shape{
	private double w;
	private double h;
	
	Rectangle(double w, double h){
		this.w=w;
		this.h=h;
	}

	@Override
	public double calculateArea() {
		 return (double)w*h;
	 }
 }
