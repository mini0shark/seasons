package ex3;

public class Point {
	private int x;
	private int y;
	
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
		Point point = new Point();
			
		point.setX(2);
		point.setY(5);
		
		point.setX(10);
		point.setY(23);
		
		int x = point.getX();
		int y= point.getY();

		System.out.println("��ǥ [x=" + x + ", y=" + y + "]�� ���� �׷Ƚ��ϴ�.");
		
	}
	
	public void show(boolean visible) {
		if (visible) {
			show();
		}else {
			System.out.printf("��ǥ [x=%d, y=%d]�� ���� �������ϴ�.",x,y);
		}
	}
	
}
