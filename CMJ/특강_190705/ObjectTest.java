package CMJ.Ư��_190705;

public class ObjectTest {
	public static void main(String[] args) {
		Point point = new Point(2, 3);
		
		System.out.println(point.getClass().getName());
		System.out.println(point.toString());
		System.out.println(point); // point.toString()�� ����� ����.
		System.out.println(point.equals(point));
		System.out.println(point.hashCode());
		
		Point secondPoint = new Point(2, 3);
		
		if(point == secondPoint) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		
		if(point.equals(secondPoint)) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		
		String str = new String("abc");
		System.out.println(str);
		System.out.println(str.toString());
		
		String str2 = new String("abc");
		
		if(str == str2) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		
		if(str.equals(str2)) {
			System.out.println(str.equals(str2));
		} else {
			System.out.println(str.equals(str2));
		}
		
		if(point.equals(str))
			System.out.println("ok");
		
		if(point.equals(secondPoint))
			System.out.println("point�� secondPoint�� ����.");
	}
}