package CMJ.Ư��_190704;

class Parent {
	public Parent(String s) {
		System.out.println("Parent ������ ����");
	}
}

class Child extends Parent {
	public Child() {
		super("Parent");
	}
}

public class Test {
	public static void main(String[] args) {
		byte b = 10;
		int i = b; // ���������� ����ȯ�� �Ͼ ��Ȳ�̴�.
		// ���� �׸��� �ִ� ���� ū �׸��� ���� ���� ������ ����ȯ�� �����ϴ�.

		b = (byte) i; // ��������� ����ȯ�� �Ͼ ��Ȳ�̴�.
		// ū �׸��� �ִ� ���� ���� �׸��� ���� ���� ����� ����ȯ�� �ؾ� �����ϴ�.

		Parent PC = new Child(); // ��ü�� �Ȱ���.
		if (PC instanceof Child) {
			Child C = (Child)PC;
		}
		
		Object O = PC;
	}
}