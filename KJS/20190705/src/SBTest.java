
public class SBTest {
 public static void main(String args[]) {
	 StringBuffer sb=new StringBuffer("This");//����
	 System.out.println(sb);
	 
	 sb.append(" is pencil");
	 System.out.println(sb);//���ڿ� �����̱�
	 
	 sb.insert(7, " my");//���ڿ� ����
	 System.out.println(sb);
	 
	 sb.insert(8, "your");//���ڿ� ��ġ
	 System.out.println(sb);
	 
	 sb.setLength(5);//��Ʈ�� ���� �� ���ڿ� ���� ����
	 System.out.println(sb);
 }
}
