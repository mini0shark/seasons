package ex1;

class MyException extends Exception{
	
}
public class ExceptionTest3 {
	public static int scoreSum(int testScore, int homeworkScore) throws MyException {
		if(testScore<1 || testScore >50)
			throw new MyException();
		return testScore+homeworkScore;
	}
	public static void main(String[] args) {
		int testScore = 66;
		int homeworkScore = 44;
		int resultScore = 0;
		try {
			resultScore = scoreSum(testScore, homeworkScore);
		}catch(MyException e) {
			System.out.print(e);
		}
		System.out.println("학생의 score는 "+ resultScore +"입니다.");
	}

}
