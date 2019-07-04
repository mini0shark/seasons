package CMJ.Ư��_190704;

public class ExceptionTest_4 {
	public static int scoreSum(int testScore, int homeworkScore) throws MyException {
		// ����ڰ� ���ǿ� ���� �ʴ� ���� ������ ���ܸ� �߻���Ų��.
		if (testScore < 1 || testScore > 50)
			throw new MyException();

		return testScore + homeworkScore;
	}

	public static void main(String[] args) {
		int testScore = 50;
		int homeworkScore = 44;
		int resultScore = 0;
		
		try {
			resultScore = scoreSum(testScore, homeworkScore);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("testScore �� 50�� �̻��� ���� ���� �� �����ϴ�.");
		}
		
		System.out.println("�л��� score�� " + resultScore + "���Դϴ�.");
	}
	
	// ���� ��ü�� ����ڰ� �����ؼ� ��� ����
	// ������Ʈ ��ü���� ���� ��ü ���� ����
}