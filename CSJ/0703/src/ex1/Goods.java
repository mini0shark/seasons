package ex1;

public class Goods {
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountStock() {
		return countStock;
	}
	
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	public int getCountSold() {
		return countSold;
	}
}
