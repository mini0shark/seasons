package ex1;

public class GoodApp {
	public static void main(String[] args) {
		Goods camera = new Goods();
		camera.setName("Nikon");
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);
		System.out.println("getter, setter�� �̿��� �ʱ�ȭ");
		printGoods(camera);

		Goods notebook = new Goods("LG gram", 1300000, 2000, 64000);
		System.out.println("\n\n�����ڸ� �̿��� �ʱ�ȭ");
		printGoods(notebook);
	}
	private static void printGoods(Goods obj) {
		System.out.println("��ǰ�̸� : "+obj.getName());
		System.out.println("��ǰ���� : "+obj.getPrice());
		System.out.println("������ : "+obj.getCountStock());
		System.out.println("�ȸ����� : "+obj.getCountSold());
	}
}
