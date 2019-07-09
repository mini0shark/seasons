package stack;

import java.util.ArrayList;

public class MyStackTest {
	public static void main(String[] args) {
		MyStack<String> stack = new MyStack<String>();
		
	}
}

class MyStack<E>{
	private ArrayList<E> myArray;
	private int top = -1; 
	public MyStack(){
		myArray = new ArrayList<E>();
	}
	public MyStack(E e) {
		this();
		push(e);
	}
	
	public void push(E e) {
		myArray.add(e);
		top++;
	}
	public E peek() {
		if(top<-1) {
			System.out.println("Stack에 원소가 없습니다.");
			return null;
		}
		E newE = myArray.get(top);
		return newE;
	}
	public E pop() {
		E newE = this.peek();
		myArray.remove(top--);
		return newE;
	}
	public void emptyStack() {
		myArray.clear();
		top =-1;
	}
	public synchronized int search(Object o) {
		int result = -1;
		for(int i=0; i<=top; i++) {
			if(myArray.get(i).equals(o)) {
				result =i;
				break;
			}
		}
		return result;
	}
}
