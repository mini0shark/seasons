
public class LangClassTest {
	public static void main(String[] args) {
		Point p = new Point(2,3);
		
		System.out.println(p.getClass().getName());
		System.out.println(p.hashCode()); //객체를 유일하게 구분할 수 있는 정수 id
		System.out.println(p.toString());
		System.out.println(p);
	
		System.out.println(p.equals(p)); //두 객체 비교 시 == or equals()
		
		String str = new String("abc");
		System.out.println(str);
		System.out.println(str.toString());
		
	}
}
