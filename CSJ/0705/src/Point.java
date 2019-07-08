
public class Point {
	private int x;
	private int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point(" + x + "," + y + ")";		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) { //�����Ͱ� ����Ű�� �ν��Ͻ� ��
			Point p = (Point)obj; //����ȯ �ϱ�
			if(x==p.x && y==p.y) {
				return true;
			}
		}
		return false;
		//return super.equals(obj);
	}
}
