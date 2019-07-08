
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
		if(obj instanceof Point) { //포인터가 가리키는 인스턴스 비교
			Point p = (Point)obj; //형변환 하기
			if(x==p.x && y==p.y) {
				return true;
			}
		}
		return false;
		//return super.equals(obj);
	}
}
