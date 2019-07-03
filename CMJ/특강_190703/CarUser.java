package CMJ.Æ¯°­_190703;

public class CarUser {
	public static void main(String args[]) {
		Car firstCar = new Car("R8");
		Car secondCar = new Car("A8", 120);
		
		System.out.println(firstCar.getName());
		
		System.out.println(secondCar.getName());
		System.out.println(secondCar.getSpeed());
	}
}
