
public class ObjectTest2 {
	public static void main(String[] args) {
		Point p1 = new Point(2,3);
		Point p2 = new Point(2,3);
		
		String str2 = new String("abc");
		String str1 = new String("abc");
		
		if(p1.equals(str1)) {
			System.out.println("ok");
		}
		if(p1.equals(p2)) {
			System.out.println("p1과 p2가 같다.");
		}
		
		if(p1 == p2) {
			System.out.println("같다.");
		}
		else System.out.println("다르다."); //메모리 위치 비교 (다름 출력)
		
		if(p1.equals(p2)) {
			System.out.println("같다.");
		}
		else System.out.println("다르다."); //메모리 위치 비교 (다름 출력)
		
		if(str1.equals(str2)) {
			System.out.println("같다.");
		}
		else System.out.println("다르다."); //같음 출력
		
	}
}
