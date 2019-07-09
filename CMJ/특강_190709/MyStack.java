package CMJ.특강_190709;

import java.util.Stack;

public class MyStack<E extends Object> {
	private int stackSize;
	private int top = -1;
	//private E[] array = new stackArr[];
	private Stack<E> stack = new Stack<>();

	public boolean empty() {
		return stack.empty();
	}
	
	public synchronized E peek() {
		return stack.peek();
	}
	
	public synchronized E pop() {
		return stack.pop();
	}
	
	public E push(E item) {
		return stack.push(item);
	}
	
	public synchronized int search(Object o) {
		return stack.search(o);
	}
}
