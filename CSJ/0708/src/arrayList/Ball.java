package arrayList;

public class Ball {
	int number;
	
	public Ball(int number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return number +""; // +"" => String으로 바꾸기
	}
	
}
