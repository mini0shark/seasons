
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
			System.out.println("p1�� p2�� ����.");
		}
		
		if(p1 == p2) {
			System.out.println("����.");
		}
		else System.out.println("�ٸ���."); //�޸� ��ġ �� (�ٸ� ���)
		
		if(p1.equals(p2)) {
			System.out.println("����.");
		}
		else System.out.println("�ٸ���."); //�޸� ��ġ �� (�ٸ� ���)
		
		if(str1.equals(str2)) {
			System.out.println("����.");
		}
		else System.out.println("�ٸ���."); //���� ���
		
	}
}
