
public class LangClassTest {
	public static void main(String[] args) {
		Point p = new Point(2,3);
		
		System.out.println(p.getClass().getName());
		System.out.println(p.hashCode()); //��ü�� �����ϰ� ������ �� �ִ� ���� id
		System.out.println(p.toString());
		System.out.println(p);
	
		System.out.println(p.equals(p)); //�� ��ü �� �� == or equals()
		
		String str = new String("abc");
		System.out.println(str);
		System.out.println(str.toString());
		
	}
}
