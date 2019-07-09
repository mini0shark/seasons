package mystack;

import java.util.Collection;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Stack;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class MystackTest {
	public static void main(String[] args) {
		Stack<String> a = new MyStack<String>();
		a.push("������");
		a.push("���ڱ�");
		a.push("��");
		a.push("�ӷ��� �Ź�");
		a.push("��������");
		System.out.println(a);
		a.remove(1);
		System.out.println(a);
		System.out.println(a.pop());
		System.out.println(a);
		
	}

}

class MyStack<E> extends Stack<E>{

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		System.out.println("Stack��  Ư�� ������ ���Ҹ� ������ �� �����ϴ�.");
		int top = this.size()-1;
		if(top ==-1)
			return false;
		Object temp = this.get(top);
		return super.remove(temp);
	}
}