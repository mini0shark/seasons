package classTest;

class Parent{
	int i=5;
	public int getI() {
		return i;
	}
}
class Child extends Parent{
	int i = 10;
	public int getI() {
		return i;
	}
	public void printI() {
		System.out.println(i);
	}
}
public class Test1 {
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.i);
		System.out.println(p.getI());
		
		Child c = new Child();
		System.out.println(c.i);
		System.out.println(c.getI());
		
		Parent pc = new Child();
		System.out.println(pc.i);
		System.out.println(pc.getI());
		
	}

}
