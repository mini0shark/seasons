package test;


public class Point {
	private int x;
	private int y;

	public Point() {
		this(0,0);
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void show() {
		System.out.printf("ÁÂÇ¥ [x=%d, y=%d]¿¡ Á¡À» ±×·È½À´Ï´Ù.\n", x, y);
	}
}