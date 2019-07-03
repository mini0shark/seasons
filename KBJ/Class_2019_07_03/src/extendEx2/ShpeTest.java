package extendEx2;
class Shape{
	public void draw() {
		System.out.println("구체적인 도형을 그릴 수 없습니다. 상속해서 재정의 하세요");
	}
	
}
class Rect extends Shape{
	public void draw() {
		System.out.println("사각형을 그렸습니다.");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("원을 그렸습니다.");
	}
}
public class ShpeTest {
	public static void main(String[] args) {
		Shape rect = new Rect();
		Shape circle = new Circle();
		rect.draw();
		circle.draw();
		
	}
}
