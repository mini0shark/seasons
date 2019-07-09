package ex4;

public class StringTest {
	public static void main(String[] args) {
		String a = new String(" abcd");
		String b = new String(" ,efg");
		
		a = a.concat(b);
		System.out.println(a);
		
		a.trim();
		System.out.println("---"+a+"---");
		a= a.replace("ab", "12");
		System.out.println(a);
		
		
		
		String ccc[] = ("ask.sdf.s.fd.").split("9");
		System.out.println(ccc.length);
//		System.out.println(ccc[0]);
//		System.out.println(ccc[1]);
//		System.out.println(ccc[2]);
		String s[] = a.split(",");
		for(int i = 0; i< s.length; i++) {
			System.out.print(s[i]+"/");
		}
		a = a.substring(3);
		System.out.println();
		System.out.println(a);
		char c = a.charAt(3);
		System.out.println(c);
		
		
	}
}
