package CMJ.특강_190708;

public class Ball {
	int number;
	
	public Ball(int number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return number + " ";
	}
	
	@Override
	public boolean equals(Object ob) {
		Ball object = (Ball)ob;
		
		if(this.number == object.number)
			return true;
		return false;
	}
}
