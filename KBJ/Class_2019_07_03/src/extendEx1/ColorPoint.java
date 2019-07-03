package extendEx1;

public class ColorPoint extends Point{
	private String color;
	
	public ColorPoint(int x, int y, String color) {
		// TODO Auto-generated constructor stub
		super(x, y);
		this.color = color;
		System.out.println("ColorPoint생성");
	}
	public void show() {
		System.out.printf("좌표 [x=%d, y=%d, color=%s]에 점을 그렸습니다.\n", x, y, color);
	}
}