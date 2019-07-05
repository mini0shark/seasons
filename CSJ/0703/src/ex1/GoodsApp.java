package ex1;

public class GoodsApp {
	public static void main(String[] args) {
		Goods camera = new Goods();
		
		camera.setName("Nikon");
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);
		
		String name = camera.getName();
		int price = camera.getPrice();
		int countStock = camera.getCountStock();
		int countSold = camera.getCountSold();
		
		System.out.println("상품이름: "+ name);
		System.out.println("상품가격: " + price);
		System.out.println("재고수량: " + countStock);
		System.out.println("팔린수량: " + countSold);

	}
}
	
