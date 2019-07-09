package ex3;

public class StringTest {
	public static void main(String[] args) {
		String str = "aBcAbCabcABC";			//1
		System.out.println(str.charAt(2));		//2
		System.out.println(str.indexOf("abc"));	//3
		System.out.println(str.length());		//4
		System.out.println(str.replace('a', 'R'));		//5
		System.out.println(str.replace("abc", "123"));	//6
		System.out.println(str.substring(0, 3));		//7
		System.out.println(str.toUpperCase());			//8
	}
}

