class Parent1{
	int i=5;
	public int getI() {
		return i;
	}
	
}

class child1 extends  Parent1{
	int i=10;
	
	public int getI() {
		return i;
	}
	
	public void print() {
		System.out.println(i);
	}
}
public interface Test1 {
  
	public static void main(String args[]) {
		Parent1 p=new Parent1();
		System.out.println(p.i);
		System.out.println(p.getI());
		
		child1 c=new child1();
		System.out.println(c.i);
		System.out.println(c.getI());//5�� ��µȴٸ�. �θ�� �ڽĿ��� �����ذ͸� �ȴ�.
		                             //10�� ��µǰ� �ϰ������ �ڽ�Ŭ�������� �޼ҵ� �������̵��ؾ���.
		
		
		Parent1 pc=new child1();
		System.out.println(pc.i);//5���.
		System.out.println(pc.getI());//10�� ��µȴ�. �޼ҵ带 �������̵��ϸ� ������ �ڽĸ޼ҵ带 ����.
		
		((child1) pc).print();//pc�� Ÿ���� parent �ڽ��� �޼ҵ带 ����ϱ����ؼ��� ����ȯ�� �ؾ��Ѵ�.
		
	}
}
