package ex1;

public class Goods {
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	Goods(){}
	Goods(String name){
		this(name,0,0, 0);
	}
	Goods(String name, int price){
		this(name, price, 0, 0);
	}
	Goods(String name, int price, int countStock){
		this(name, price, countStock, 0);
	}
	Goods(String name, int price, int countStock, int countSold){
		this.name = name;
		this.price = price;
		this.countStock = countStock;
		this.countSold = countSold;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getCountStock() {
		return countStock;
	}
	public int getCountSold () {
		return countSold;
	}
}
