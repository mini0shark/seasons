package ex1;

public class GoodApp {
	public static void main(String[] args) {
		Goods camera = new Goods();
		camera.setName("Nikon");
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);
		System.out.println("getter, setter를 이용한 초기화");
		printGoods(camera);

		Goods notebook = new Goods("LG gram", 1300000, 2000, 64000);
		System.out.println("\n\n생성자를 이용한 초기화");
		printGoods(notebook);
	}
	private static void printGoods(Goods obj) {
		System.out.println("상품이름 : "+obj.getName());
		System.out.println("상품가격 : "+obj.getPrice());
		System.out.println("재고수량 : "+obj.getCountStock());
		System.out.println("팔린수량 : "+obj.getCountSold());
	}
}
