
public class ExceptionTest2 {
 public static void m1() {
	 int a=0;
	 //���ܰ� �߻�������...
	 //ó���ϴ� ����� 2����..
	 
	 
	 //�� �޼ҵ� ������ ���� ó���ϴ� ���(try-catch)
	 try {
		 System.out.println(100/a);
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
	 System.out.println("m1 ����!!");
	
 }
 
 public static void main(String args[]) {
	 m1();
	 
	 System.out.println("main ����!!");
 }
}



//���ܸ� �� �޼ҵ带 ȣ���� ������ �ѱ�!!

/*public static void m1() throws ArithmeticException{
int a=0;
//���ܰ� �߻�������...
//ó���ϴ� ����� 2����..

System.out.println(100/a);
System.out.println("m1 ����!!");

public static void main(String args[]) {

// �޼ҵ尡 ���ܸ� �������Ƿ� ���� ó���� �޼ҵ带 ȣ���� �ʿ��� �Ѵ�.
m1();

try{
m1();
}catch(Exception e){

   System.out.println("�޼ҵ带 ȣ���� �ʿ��� ����ó�� �Ϸ�!!");
}

System.out,println("main ����!!");
}
*/