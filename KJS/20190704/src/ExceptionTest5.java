

public class ExceptionTest5 {
 public static int scoreSum(int testScore, int homeworkScore) throws Exception{ 
	 if(testScore<1||testScore>50)
		 throw new Exception();//JVM�� �𸣴� ���� ��, ����ڰ� ������ ���ܸ� �߻���Ŵ.
	 return testScore+homeworkScore;
	 }
	 
	 
	 

 
 
 public static void main(String args[]) {
	 int testScore=60;
	 int homeworkScore=44;
	 int resultScore=0;
	 try {
		 resultScore=scoreSum(testScore,homeworkScore);
	 }catch(Exception e) {
		 System.out.println("testScore�� 50�̻��� ���� ���� �� �����ϴ�.");
	 }
	 
	 System.out.println("testScore�� 50�̻��� ���� ���� �� �����ϴ�.");
 }
 
 
 
}
