package CMJ.특강_190703;

public class Car {
	String name;
	int speed;
	static int numberOfCars;
	
	public Car() {
		name = "MyCar";
		speed = 0;
		numberOfCars++;
	}
	
	public Car(String name, int speed) {
		//this(name); --> 생성자 호출
		System.out.println("Car(String name, int speed) 실행");
		this.name = name;
		this.speed = speed;
	}
	
	public Car(String name) {
		System.out.println("Car(String name) 실행");
		this.name = name;
	}
	
	//메소드를 정의하는 방법
	//접근제한자 리턴타입 메소드명(매개변수들...)
	
	//this -> 내 클래스의 필드를 가리킬 때 쓴다.
	//super -> 부모 클래스를 가리킨다.
	
	//이름을 지어주는 메소드
	public void setName(String name) {
		this.name = name;
	}
	
	//이름을 받는 메소드
	public String getName() {
		return this.name;
	}
	
	//속도를 지어주는 메소드
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//현 속도를 받는 메소드
	public int getSpeed() {
		return this.speed;
	}
}