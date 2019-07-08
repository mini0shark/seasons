package CMJ.특강_190705;

public class SBTest {
	public static void main(String[] args) {
		StringBuffer SB = new StringBuffer("This");
		System.out.println(SB);
		
		SB.append(" is pencil");
		System.out.println(SB);
		
		SB.insert(7, " my ");
		System.out.println(SB);
		
		SB.insert(8, " your ");
		System.out.println(SB);
		
		SB.setLength(5);
		System.out.println(SB);
	}
}