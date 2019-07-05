
public class Car {
	String name;
	int speed;
	static String 제조사;
	
	public Car() {
		this("이름없음", 0);
		System.out.println("Car() 생성자 실행");
		
	}
	public Car (String name) {
		//this(name,0);
		System.out.println("Car(String name) 생성자 실행");
		this.name = name;
		
	}
	
	public Car (String name, int speed) {
		this(name);
		System.out.println("Car(String name, int speed) 생성자 실행");
		//this.name = name;
		this.speed = speed;
	}
	
}
