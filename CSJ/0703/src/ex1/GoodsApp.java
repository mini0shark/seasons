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
		
		System.out.println("��ǰ�̸�: "+ name);
		System.out.println("��ǰ����: " + price);
		System.out.println("������: " + countStock);
		System.out.println("�ȸ�����: " + countSold);

	}
}
	
