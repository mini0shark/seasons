package CMJ.특강_190704;

public class ExceptionTest {
	public static void main(String[] args) {
		int a = 7;
		double b = 0;
		
		int[] arr = new int[5];
		
		/*
			// 비정상적인 종료
			b =	100 / a;
			System.out.println("Some more codes before try-catch"); // 예외 발생으로 수행되지 않음
		*/
		
		//정상적인 종료
		try {
			System.out.println(arr[5]);
			b = 100 / a;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 실행");
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException 실행");
			a = 1;
			b = 100 / a;
		} catch (Exception e) {
			System.out.println("One more catch block");
		} finally {
			System.out.println("반드시 실행되는 블럭");
		}
		
		System.out.println("Some more codes after try-catch");
	}
}