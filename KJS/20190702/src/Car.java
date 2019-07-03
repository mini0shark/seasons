
public class Car {
   String name;//field:멤버변수: 인스턴스 생성시 생성됨.
   int speed;
   static String 제조사;//클래스변수 static은 정적의(즉 상수): 클래스가 메모리에 올라갈 때 생성됨.
   
   //메소드 정의
   //접근제한자,리턴타입,메소드형(매개변수 등..)
   
   //name(차의 이름)을 부여하는 메소드
 public void setName(String name) {
	 this.name=name;//나의 field:this.name, 매개변수(String name):name 
 }
 
 public String getName() {
	 return name;
 }
 
 public static void setPrice() {
	 
 }
}
