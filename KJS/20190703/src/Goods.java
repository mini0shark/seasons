
//field�� private�� �����ؼ� ���� �����ڸ� �������� ������ set�޼ҵ忡 ���� ��ü�� �ʱ�ȭ�ȴ�.
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
  
  
public  String GetName() {//static�� ���� �ʴ� ������ static�޼ҵ�� static����� ���� �����ϱ� �����̴�.
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
