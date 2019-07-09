package test;

public class CircleTest {
	public static void main(String[] args) {
		Circle c1 = new Circle(1,2,3);
		Circle c2 = new Circle(1,2,3);
			
		System.out.println(c1.equals(c2));
	}
}
class Circle extends Point{
	private int r;
	public Circle(int x, int y, int r){
		super(x,y);
		this.r = r;
	}
	public int getR() {
		return r;
	}
	@Override
	public boolean equals(Object p) {
		Circle a = (Circle)p;
		// TODO Auto-generated method stub
		return a.getR() == r;
	}
}
