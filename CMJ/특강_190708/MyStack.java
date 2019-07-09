package CMJ.특강_190708;

import java.util.Stack;

public class MyStack<E> {
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