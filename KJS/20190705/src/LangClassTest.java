
public class LangClassTest {

	public static void main(String[] args) {
		Point p=new Point(2,3);
		Point p1=new Point(2,3);

		System.out.println(p.getClass().getName());
		System.out.println(p.hashCode());// 객체를 유일하게 구분할 수 있는 정수 id
		System.out.println(p.toString());// 입력받는 객체 출력. 주로 자신의 형태에 맞게 override해서 많이 사용한다.
		System.out.println(p);
		
		
		if(p==p1)//==는 주소값들을 비교함.
			System.out.println("같다");
		else
			System.out.println("다르다.");
		
		
		if(p.equals(p1))//equals()메소드를 사용해야한다. 
		System.out.println("같다");
		else
			System.out.println("다르다.");
		
		/*객체는 if를 쓰든 equals를 쓰든 다르다고 나온다.(Point class에 equals메소드를 override해야한다. 하지만 String은 if는 다르다. equals는 같다고 나온다. 즉 String은 equals
		 *를 override하는 것이다.
		 */
	}
}