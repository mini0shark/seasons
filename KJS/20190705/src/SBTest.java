
public class SBTest {
 public static void main(String args[]) {
	 StringBuffer sb=new StringBuffer("This");//생성
	 System.out.println(sb);
	 
	 sb.append(" is pencil");
	 System.out.println(sb);//문자열 덧붙이기
	 
	 sb.insert(7, " my");//문자열 삽입
	 System.out.println(sb);
	 
	 sb.insert(8, "your");//문자열 대치
	 System.out.println(sb);
	 
	 sb.setLength(5);//스트링 버퍼 내 문자열 길이 설정
	 System.out.println(sb);
 }
}
