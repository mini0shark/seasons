public class ExceptionTest{
	public static void main(String args[]) {
		int a=7;
		double b=0;
		
		int[] iarr=new int[5];
		
		try {
		System.out.println(iarr[5]);
		b=100/a;//java.lang.ArithmeticException발생
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 실행");
			System.out.println(e);
			
		}catch(ArithmeticException e) {
			
			System.out.println("ArithmeticException 실행");
			a=1;
			b=100/a;
		}
		
		
		System.out.printf("100/%d는 %f 입니다. \n",a,b);
		System.out.println("100/"+a+"는"+b+"입니다.");
		System.out.println("Some more codes");
	}
}