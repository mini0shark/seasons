package CMJ.특강_190703;

class Parent {
	public Parent(String s) {
		System.out.println("Parent 생성자 실행");
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
		int i = b; // 묵시적으로 형변환이 일어난 상황이다.
		// 작은 그릇에 있는 값을 큰 그릇에 넣을 때는 묵시적 형변환이 가능하다.

		b = (byte) i; // 명시적으로 형변환이 일어난 상황이다.
		// 큰 그릇에 있는 값을 작은 그릇에 넣을 때는 명시적 형변환을 해야 가능하다.

		Parent PC = new Child(); // 객체도 똑같다.
	}
}