
public class CarUser {
	public static void main(String[] args) {
		Car car = new Car();
		Car.제조사 = "아우디";
		System.out.println(Car.제조사);
		car.setName("R8");
		System.out.println(car.getName());
	}
}
