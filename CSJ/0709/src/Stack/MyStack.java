package Stack;

import java.util.Stack;

public class MyStack<E> {
	Stack<E> stack = new Stack<>();
	
	
	public boolean empty() {
		return stack.empty();
	}
	
	public synchronized E peek() {
		return stack.peek();
	}
	
	public synchronized E pop() {
		return stack.pop();
	}
	
	public synchronized E push(E item) {
		return stack.push(item);
	}	
	
	public synchronized int search(Object o) {
		return stack.search(o);
	}
	
}
