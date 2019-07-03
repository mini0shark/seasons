package staticMethod;

public class StaticTest {
	String name;
	int speed;
	static int numberOfCars;
	
	public StaticTest() {	
		name = "My Car";
		speed= 0;
		numberOfCars++;
	}
	public int getSpeed() {
		return speed;
	}
	public static int getNumberOfCars() {
		return numberOfCars;
	}
	public static void printNumberOfCars() {
		System.out.println("현재 생성된 차량은 "+numberOfCars+"대 입니다.\n");
	}

}
