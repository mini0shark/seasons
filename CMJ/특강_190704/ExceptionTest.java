package CMJ.Ư��_190704;

public class ExceptionTest {
	public static void main(String[] args) {
		int a = 7;
		double b = 0;
		
		int[] arr = new int[5];
		
		/*
			// ���������� ����
			b =	100 / a;
			System.out.println("Some more codes before try-catch"); // ���� �߻����� ������� ����
		*/
		
		//�������� ����
		try {
			System.out.println(arr[5]);
			b = 100 / a;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException ����");
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException ����");
			a = 1;
			b = 100 / a;
		} catch (Exception e) {
			System.out.println("One more catch block");
		} finally {
			System.out.println("�ݵ�� ����Ǵ� ��");
		}
		
		System.out.println("Some more codes after try-catch");
	}
}