package extendEx1;

public class ColorPoint extends Point{
	private String color;
	
	public ColorPoint(int x, int y, String color) {
		// TODO Auto-generated constructor stub
		super(x, y);
		this.color = color;
		System.out.println("ColorPoint����");
	}
	public void show() {
		System.out.printf("��ǥ [x=%d, y=%d, color=%s]�� ���� �׷Ƚ��ϴ�.\n", x, y, color);
	}
}