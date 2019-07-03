
public class CarUser {
 public static void main(String args[]) {
	 Car.제조사="아우디";//클래스변수는 사용하려면 클래스.변수이름을 써야한다. 
	 Car car=new Car();
	 car.setName("아우디");
	 System.out.println("내 차는 "+car.getName()+"입니다.");
 }
}
