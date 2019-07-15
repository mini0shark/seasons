package Stack;

public class Box<E> { //Generic(다양한 타입의 객체에 대한 재사용)
	private E e;
	
	public E getE() {
		return e;
	}
	
	public void setE(E e) {
		this.e = e;
	}
	
	public static void main(String[] args) {
		Box<String> stringBox = new Box<>(); //객체 생성 시 구체적인 타입 기재
		stringBox.setE("a");
		Box<Integer> intBox  = new Box<>();
		intBox.setE(1);
	}
}
