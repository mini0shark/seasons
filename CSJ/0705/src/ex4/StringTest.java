package ex4;

public class StringTest {
	public static void main(String[] args) {
		String a = new String(" abcd");
		String b = new String(",efg ");
		//���ڿ� ����
		a = a.concat(b);
		System.out.println(a);
		
		//��������
		a = a.trim();
		System.out.println("---" + a + "---");
		
		//���ڿ� ��ġ
		a = a.replace("ab", "12");
		System.out.println(a);
		
		//���ڿ� �и�
		String s[] = a.split(",");
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
		//���꽺Ʈ��
		a = a.substring(3);
		System.out.println(a);
		
		//���ڿ��� ����
		char c = a.charAt(2);
		System.out.println(c);
		
	}
}
