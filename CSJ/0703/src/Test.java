
class Parent1{
	int i = 5;
	public int getI() {
		return i;
	}
}
//부모 default 생성자 먼저 생성!!
class Parent2{
	public Parent2(String s) {
		System.out.println("Parent1 생성자 실행");
	}
}

class Child1 extends Parent1{
	int i = 10;
	
	public void print() {
		System.out.println("----------------");
		System.out.println(super.i);
		System.out.println(super.getI());
		System.out.println("----------------");
	}
}


class Child2 extends Parent1{
	public Child2() {
		System.out.println("Child1의 생성자 실행");
	}
	int i = 10;
	
}

public class Test extends Parent1 {
	public static void main(String[] args) {
		Parent1 p = new Parent1();
		System.out.println(p.i);
		System.out.println(p.getI());
		
		Child1 c = new Child1();
		System.out.println(c.i);
		System.out.println(c.getI());
		
		Parent1 pc = new Child1();
		System.out.println(pc.i);
		System.out.println(pc.getI());
		
		byte b=10;
		int i = b; //묵시적으로 형변환됨.(작은 그릇에 있는 값을 큰 그릇에 넣을때는 묵시적 형변환이 된다.)
		b =(byte)i;//큰 그릇에 있는 값을 작은 그릇에 담으려고 할 때는 명시적인 형변환을 해줘야한다.
		//Parent2 PC = new Parent2();
		//Child2 c = PC;

	}
}
