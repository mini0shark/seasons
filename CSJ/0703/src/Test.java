
class Parent1{
	int i = 5;
	public int getI() {
		return i;
	}
}
//�θ� default ������ ���� ����!!
class Parent2{
	public Parent2(String s) {
		System.out.println("Parent1 ������ ����");
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
		System.out.println("Child1�� ������ ����");
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
		int i = b; //���������� ����ȯ��.(���� �׸��� �ִ� ���� ū �׸��� �������� ������ ����ȯ�� �ȴ�.)
		b =(byte)i;//ū �׸��� �ִ� ���� ���� �׸��� �������� �� ���� ������� ����ȯ�� ������Ѵ�.
		//Parent2 PC = new Parent2();
		//Child2 c = PC;

	}
}
