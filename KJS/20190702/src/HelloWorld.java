
public class HelloWorld {
	
	public static String hello() { //static:������-> ��ü�� �������� �ʰ� memory�� �ִ� ����.
		                           //�� ��� ��ü���� �Բ� �����ϴ� ����� ����� Ű����
		return "hello";
	}
	
 public static void main(String args[]) {
	 System.out.println("�ȳ�~~!!"); // System class�� �⺻ field out(��ü�� PrintStream)�� �⺻method println
	 hello();
	 HelloWorld h1=new HelloWorld();
	 h1.hello();
	 Object obj=new HelloWorld();//�θ�Ŭ������ �̿��Ͽ� ��ü��������ִ�. ��������:������ ���� �ڽ�Ŭ������ �޼ҵ带 ������
	 ((HelloWorld)obj).hello();  // ����ȯ ����ؾ��Ѵ�. 
 }                                 
 
 
} //class�� HelloWorld,String,System�̴�.
 //java.lang���� �⺻ class�� String,System,���� ���� Ŭ������.
  


