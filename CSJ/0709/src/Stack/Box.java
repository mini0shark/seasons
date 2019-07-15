package Stack;

public class Box<E> { //Generic(�پ��� Ÿ���� ��ü�� ���� ����)
	private E e;
	
	public E getE() {
		return e;
	}
	
	public void setE(E e) {
		this.e = e;
	}
	
	public static void main(String[] args) {
		Box<String> stringBox = new Box<>(); //��ü ���� �� ��ü���� Ÿ�� ����
		stringBox.setE("a");
		Box<Integer> intBox  = new Box<>();
		intBox.setE(1);
	}
}
