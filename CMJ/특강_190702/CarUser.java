package CMJ.특강_190702;

public class CarUser {
	public static void main(String[] args) {
		//Car를 쓰고 싶다면 Car를 생성해야 한다.
		//생성하는 명령어는 new
		Car car = new Car();
		
		//알맞는 매개변수를 넣어준다.
		car.setName("아우디");
		System.out.println(car.getName());
	}
}