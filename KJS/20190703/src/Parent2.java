
public class Parent2 {
 public Parent2(String s) {
	 System.out.println("Parent1 ������ ����");
 }
}

class Child2 extends Parent2{
	public Child2() {
		super("ss");//�������̵尡 �Ǹ� �������� �θ� ������ ���Ѵ�. �׷��� super�� ���� ���ٰ���.
		            // �����ڵ� �θ��� �����ڸ� ���� ������ super���.
	}
}


