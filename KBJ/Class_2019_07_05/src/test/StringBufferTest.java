package test;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		sb.append(" is pencil");
		System.out.println(sb);
		sb.insert(7,  " my");
		System.out.println(sb);
		sb.insert(8, "your ");
		System.out.println(sb);
		sb.setLength(5);
		System.out.println(sb);
	}
}
