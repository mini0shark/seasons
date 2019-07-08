
public class ExceptionTest2 {
 public static void m1() {
	 int a=0;
	 //예외가 발생했을때...
	 //처리하는 방법은 2가지..
	 
	 
	 //이 메소드 내에서 직접 처리하는 방법(try-catch)
	 try {
		 System.out.println(100/a);
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
	 System.out.println("m1 종료!!");
	
 }
 
 public static void main(String args[]) {
	 m1();
	 
	 System.out.println("main 종료!!");
 }
}



//예외를 이 메소드를 호출한 쪽으로 넘김!!

/*public static void m1() throws ArithmeticException{
int a=0;
//예외가 발생했을때...
//처리하는 방법은 2가지..

System.out.println(100/a);
System.out.println("m1 종료!!");

public static void main(String args[]) {

// 메소드가 예외를 던졌으므로 예외 처리를 메소드를 호출한 쪽에서 한다.
m1();

try{
m1();
}catch(Exception e){

   System.out.println("메소드를 호출한 쪽에서 예외처리 완료!!");
}

System.out,println("main 종료!!");
}
*/