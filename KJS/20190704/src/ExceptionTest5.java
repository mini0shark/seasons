

public class ExceptionTest5 {
 public static int scoreSum(int testScore, int homeworkScore) throws Exception{ 
	 if(testScore<1||testScore>50)
		 throw new Exception();//JVM이 모르는 예외 즉, 사용자가 강제로 예외를 발생시킴.
	 return testScore+homeworkScore;
	 }
	 
	 
	 

 
 
 public static void main(String args[]) {
	 int testScore=60;
	 int homeworkScore=44;
	 int resultScore=0;
	 try {
		 resultScore=scoreSum(testScore,homeworkScore);
	 }catch(Exception e) {
		 System.out.println("testScore는 50이상의 값이 들어올 수 없습니다.");
	 }
	 
	 System.out.println("testScore는 50이상의 값이 들어올 수 없습니다.");
 }
 
 
 
}
