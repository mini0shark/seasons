package CMJ.Ư��_190704;

public class ExceptionTest_3 {
	public static void m() throws ArithmeticException {
		// throws FileNotFoundException
		int a = 0;

		// System.out.println(100 / a);
		
		// �̷��� ���ܰ� �߻����� �� ó���ϴ� ����� �ΰ���
		// �� �޼ҵ� ������ ���� ó���ϴ� ��� (try-catch �̿�)
		/*
		 try {
			System.out.println(100 / a);
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		// ���ܸ� �� �޼ҵ带 ȣ���� ������ �ѱ� (throws �̿�)
		System.out.println("m ����");
	}
	// �� �޼ҵ带 �����ϴ� ����� �Լ��� �ѱ� �� Checked Exception���� ó���ϴ� ���� ����.
	
	public static void main(String[] args) {
		// �Ʒ� �޼ҵ尡 ���ܸ� �������Ƿ� ���� ó���� �޼ҵ尡 ȣ���� �ʿ��� �Ѵ�.
		try {
			m();
		} catch (Exception e) {
			System.out.println("�޼ҵ带 ȣ���� �ʿ��� ����ó�� �Ϸ�");
		}
		
		System.out.println("main ����");
	}
}