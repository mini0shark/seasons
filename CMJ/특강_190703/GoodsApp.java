package Ư��_190703;

public class GoodsApp {
	public static void main(String[] args) {
		Goods camera = new Goods("Nikon", 400000, 30, 50);
		System.out.println("��ǰ�̸�: " + camera.getName());
		System.out.println("��ǰ����: " + camera.getPrice());
		System.out.println("������: " + camera.getCountStock());
		System.out.println("�ȸ�����: " + camera.getCountSold());
	}
}