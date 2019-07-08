
public class ObjectTest4 {
	
	public static void testMethod(Object obj) {
		System.out.println();
	}
	
	public static void main(String[] args) {
		//object Á¾·ù
		//Car car = new Car(); ->1
		String str = new String(); //->2
		
		ObjectTest4.testMethod(str);
		//ObjectTest4.testMethod(car);
	}
}
