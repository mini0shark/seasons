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
		System.out.println(c.getI());//5가 출력된다면. 부모는 자식에게 물려준것만 안다.
		                             //10이 출력되게 하고싶으면 자식클래스에서 메소드 오버라이딩해야함.
		
		
		Parent1 pc=new child1();
		System.out.println(pc.i);//5출력.
		System.out.println(pc.getI());//10이 출력된다. 메소드를 오버라이딩하면 무조건 자식메소드를 쓴다.
		
		((child1) pc).print();//pc의 타입은 parent 자식의 메소드를 사용하기위해서는 형변환을 해야한다.
		
	}
}
