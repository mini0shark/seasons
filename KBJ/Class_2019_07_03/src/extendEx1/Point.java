package extendEx1;

public class Point {
	protected int x;
	protected int y;
	public Point() {
		// TODO Auto-generated constructor stub
		System.out.println("Point �⺻ ������");
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		System.out.println("Point �Ű����� ������");
	}
	public void show() {
		System.out.printf("��ǥ [x=%d, y=%d]�� ���� �׷Ƚ��ϴ�.\n", x, y);
	}
}