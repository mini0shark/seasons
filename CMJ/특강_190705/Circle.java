package CMJ.특강_190705;

public class Circle {
	private int x;
	private int y;
	private int radius;
	
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	@Override
	public boolean equals(Object obj) {
		Circle otherCircle = (Circle)obj;
		
		if(otherCircle.radius == this.radius)
			return true;

		return false;
	}
}