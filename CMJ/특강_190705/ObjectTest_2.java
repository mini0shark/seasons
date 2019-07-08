package CMJ.특강_190705;

public class ObjectTest_2 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		String str3 = "abc";
		
		if(str1 == str2)
			System.out.println("str1과 str2는 같습니다.");
		
		if(str2 == str3)
			System.out.println("str2와 str3는 같습니다.");
		
		if(str3 == str1)
			System.out.println("str3와 str1은 같습니다.");
	}
}