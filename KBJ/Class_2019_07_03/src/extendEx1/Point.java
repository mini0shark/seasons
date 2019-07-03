package extendEx1;

public class Point {
	protected int x;
	protected int y;
	public Point() {
		// TODO Auto-generated constructor stub
		System.out.println("Point 기본 생성자");
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		System.out.println("Point 매개변수 생성자");
	}
	public void show() {
		System.out.printf("좌표 [x=%d, y=%d]에 점을 그렸습니다.\n", x, y);
	}
}