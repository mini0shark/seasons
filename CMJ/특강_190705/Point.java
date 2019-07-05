package CMJ.Ư��_190705;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "x: " + x + ", y: " + y;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point p = (Point)obj;
			if(x == p.x && y == p.y) {
				// ���ٰ� ��ȯ�� ���� ����
				return true;
			}
		}
		
		return false;
	}
}