
public class Car {
   String name;//field:멤버변수: 인스턴스 생성시 생성됨.
   int speed;
   static String 제조사;//클래스변수 static은 정적의(즉 상수): 클래스가 메모리에 올라갈 때 생성됨.
   
//생성자가 하나라도 있으면 컴파일러는 기본 생성자를 추가하지 않는다.(필요하면 정의하기)
//this는 제일먼저 생성해야한다.   
   
  /*public Car(){
   * 
   * this("이름없음",0);
   
   }
  */
  public Car(String name){
	   this.name=name;//this(name,0);
	   System.out.println("내 차이름은"+this.name+"입니다.");
   }
   
  public Car(String name,int speed){
	   this.name=name;//this(name);와 같다. 
	   this.speed=speed;
	   System.out.println("내 차이름은"+this.name+"입니다.");
	   System.out.println("내 차속도는"+this.name+"입니다.");
   }
   
   //메소드 정의
   //접근제한자,리턴타입,메소드형(매개변수 등..)
   
   //name(차의 이름)을 부여하는 메소드
 public void setName(String name) {
	 this.name=name;//나의 field:this.name, 매개변수(String name):name 
 }
 
 public String getName() {
	 return name;
 }
}
