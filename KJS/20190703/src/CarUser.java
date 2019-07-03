
public class CarUser {
 public static void main(String args[]) {
	 Car.제조사="아우디";//클래스변수는 사용하려면 클래스.변수이름을 써야한다. 
    Car car=new Car("R8");
	Car car2= new Car("A8",120);
	 //Car car3=new Car(); -> 오류 필요하면 default생성자가 필요하면 정의하기.
	//car.setName("아우디");
   //System.out.println("내 차는 "+car.getName()+"입니다.");
 }
}
