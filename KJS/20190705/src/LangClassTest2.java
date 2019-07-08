
public class LangClassTest2 {
 public static void main(String args[]) {
	 Integer i=new Integer(10);
	 Character c=new Character('4');
	 Double d=new Double(3.1234566);
	 
	 System.out.println(Character.toLowerCase('A'));//대문자 A를 소문자로 변환
	 if(Character.isDigit(c)) {//문자 c가 숫자를 나타내면 
		 System.out.println(Character.getNumericValue(c));//문자를 숫자로 변환
 }
 System.out.println(Integer.parseInt("-123"));//문자열을 정수로 변환
 System.out.println(Integer.parseInt("10",16));//16진수 문자열을 정수로 변환
 System.out.println(Integer.toBinaryString(28));//2진수로 표현된 문자열로 변환
 System.out.println(Integer.bitCount(28));//2진수에서 1의 개수
 //System.out.println(Integer.toHexString("28"));//16진수 문자열로 변환
 System.out.println(i.doubleValue());//정수를 douDouble로 변환
 System.out.println(d.toString());//숫자를 문자열로 변환
 System.out.println(Double.parseDouble("44,13e-16"));//문자열을 double로 변환
 
}
}