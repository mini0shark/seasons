
public class LangClassTest2 {
 public static void main(String args[]) {
	 Integer i=new Integer(10);
	 Character c=new Character('4');
	 Double d=new Double(3.1234566);
	 
	 System.out.println(Character.toLowerCase('A'));//�빮�� A�� �ҹ��ڷ� ��ȯ
	 if(Character.isDigit(c)) {//���� c�� ���ڸ� ��Ÿ���� 
		 System.out.println(Character.getNumericValue(c));//���ڸ� ���ڷ� ��ȯ
 }
 System.out.println(Integer.parseInt("-123"));//���ڿ��� ������ ��ȯ
 System.out.println(Integer.parseInt("10",16));//16���� ���ڿ��� ������ ��ȯ
 System.out.println(Integer.toBinaryString(28));//2������ ǥ���� ���ڿ��� ��ȯ
 System.out.println(Integer.bitCount(28));//2�������� 1�� ����
 //System.out.println(Integer.toHexString("28"));//16���� ���ڿ��� ��ȯ
 System.out.println(i.doubleValue());//������ douDouble�� ��ȯ
 System.out.println(d.toString());//���ڸ� ���ڿ��� ��ȯ
 System.out.println(Double.parseDouble("44,13e-16"));//���ڿ��� double�� ��ȯ
 
}
}