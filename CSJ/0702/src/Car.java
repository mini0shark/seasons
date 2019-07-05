
public class Car {
	String name;
	int speed;
	static String 제조사;
	static int numberOfCars;
	
	//메소드 정의
	//name 차의 이름을 부여하는 메서드
	//접근제한자 리턴타입 메소드명(매개변수)
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public Car() {
		name = "MyCar";
		speed= 0;
		numberOfCars++;
	}
	
	public void setName1(String name) {
		name = name;
	}
	public void setSpeed(int s) {
		speed = s;
	}
	
	public int getSpeed() {
		return speed;
	}
}
