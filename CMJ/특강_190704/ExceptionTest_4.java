package CMJ.특강_190704;

public class ExceptionTest_4 {
	public static int scoreSum(int testScore, int homeworkScore) throws MyException {
		// 사용자가 조건에 맞지 않는 값이 들어오면 예외를 발생시킨다.
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
			System.out.println("testScore 는 50점 이상의 값이 들어올 수 없습니다.");
		}
		
		System.out.println("학생의 score는 " + resultScore + "점입니다.");
	}
	
	// 예외 객체를 사용자가 정의해서 사용 가능
	// 프로젝트 자체에서 예외 객체 정의 가능
}