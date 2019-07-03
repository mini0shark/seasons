
public class Parent2 {
 public Parent2(String s) {
	 System.out.println("Parent1 생성자 실행");
 }
}

class Child2 extends Parent2{
	public Child2() {
		super("ss");//오버라이드가 되면 겹쳐져서 부모에 접근을 못한다. 그럴때 super를 쓰면 접근가능.
		            // 생성자도 부모의 생성자를 쓰고 싶으면 super사용.
	}
}


