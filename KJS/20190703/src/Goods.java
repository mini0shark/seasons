
//field를 private로 선언해서 만약 생성자를 선언하지 않으면 set메소드에 의해 객체가 초기화된다.
public class Goods {
 private  String name;
 private int price;
 private int countStock;
 private int countSold;
  
  /*Goods(String name,int price,int countStock,int countSold){
	  this.name=name;
	  this.price=price;
	  this.countStock=countStock;
	  this.countSold=countSold;
  }*/
  
  
public  String GetName() {//static을 쓰지 않는 이유는 static메소드는 static멤버만 접근 가능하기 때문이다.
	return name;
}


public void SetName(String name) {
  this.name=name;}

public int Getprice() {
	return price;
}

public void Setprice(int price) {
	this.price=price;
}

public int GetcountStock() {
	return countStock;
}

public void SetcountStock(int countStock) {
	this.countStock=countStock;
}

public int GetcountSold() {
	return countSold;
}

public void SetcountSold(int countSold) {
	this.countSold=countSold;
}







}
