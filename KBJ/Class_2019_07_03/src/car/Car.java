package car;

public class Car {
	private String name;
	private int maxSpeed;
	public Car() {
		// TODO Auto-generated constructor stub
		this("Unknown",0);
	}
	public Car(String name) {
		// TODO Auto-generated constructor stub
		this(name,0);
	}
	public Car(String name, int maxSpeed) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.maxSpeed=maxSpeed;
	}
	public String getName() {
		return name;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}

}
