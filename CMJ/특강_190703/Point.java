package CMJ.Ư��_190703;

public class Point {
	private int x;
	private int y;
	private boolean showState;
	
	public Point(int x, int y) {
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
		System.out.println("��ǥ [x = " + x + ", y = " + y + "]�� ���� �׷Ƚ��ϴ�.");
	}
	
	public void show(boolean visible) {
		if (visible) {
			show();
		} else {
			System.out.println("��ǥ [x = " + x + ", y = " + y + "]�� ���� �������ϴ�.");
		}
	}
}