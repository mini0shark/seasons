package CMJ.특강_190704;

public class ExceptionTest_3 {
	public static void m() throws ArithmeticException {
		// throws FileNotFoundException
		int a = 0;

		// System.out.println(100 / a);
		
		// 이렇게 예외가 발생했을 때 처리하는 방법은 두가지
		// 이 메소드 내에서 직접 처리하는 방법 (try-catch 이용)
		/*
		 try {
			System.out.println(100 / a);
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		// 예외를 이 메소드를 호출한 쪽으로 넘김 (throws 이용)
		System.out.println("m 종료");
	}
	// 이 메소드를 정의하는 사람이 함수를 넘길 때 Checked Exception으로 처리하는 것이 좋다.
	
	public static void main(String[] args) {
		// 아래 메소드가 예외를 던졌으므로 예외 처리는 메소드가 호출한 쪽에서 한다.
		try {
			m();
		} catch (Exception e) {
			System.out.println("메소드를 호출한 쪽에서 예외처리 완료");
		}
		
		System.out.println("main 종료");
	}
}