public class ExceptionTest{
	public static void main(String args[]) {
		int a=7;
		double b=0;
		
		int[] iarr=new int[5];
		
		try {
		System.out.println(iarr[5]);
		b=100/a;//java.lang.ArithmeticException�߻�
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException ����");
			System.out.println(e);
			
		}catch(ArithmeticException e) {
			
			System.out.println("ArithmeticException ����");
			a=1;
			b=100/a;
		}
		
		
		System.out.printf("100/%d�� %f �Դϴ�. \n",a,b);
		System.out.println("100/"+a+"��"+b+"�Դϴ�.");
		System.out.println("Some more codes");
	}
}