package classTest;
class Parent2{
	public Parent2(String s) {
		System.out.println("parent2 »£√‚");
	}
}
class Child2 extends Parent2{
	Child2(){
		super("111");
	}
}
public class Test2 {
	public static void main(String[] args) {
		Parent2 p = new Parent2("aa");
		Child2 c = new Child2();
		
		c = (Child2)p;
	}
}