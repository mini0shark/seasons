package car;

public class CarUser {
	public static void main(String[] args) {
		Car car = new Car("R8");
		Car car2 = new Car("RS5", 320);

		System.out.println(car.getName()+"      "+car.getMaxSpeed());
		System.out.println(car2.getName()+"      "+car2.getMaxSpeed());
	}
}
