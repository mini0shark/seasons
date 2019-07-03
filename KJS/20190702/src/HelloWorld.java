
public class HelloWorld {
	
	public static String hello() { //static:정적의-> 객체를 생성하지 않고도 memory에 있는 상태.
		                           //즉 모든 객체들이 함께 공유하는 상수를 만드는 키워드
		return "hello";
	}
	
 public static void main(String args[]) {
	 System.out.println("안녕~~!!"); // System class의 기본 field out(실체는 PrintStream)의 기본method println
	 hello();
	 HelloWorld h1=new HelloWorld();
	 h1.hello();
	 Object obj=new HelloWorld();//부모클래스를 이용하여 객체를만들수있다. 쓰는이유:나한테 없는 자식클래스의 메소드를 쓰려고
	 ((HelloWorld)obj).hello();  // 형변환 사용해야한다. 
 }                                 
 
 
} //class는 HelloWorld,String,System이다.
 //java.lang안의 기본 class는 String,System,내가 만든 클래스도.
  


