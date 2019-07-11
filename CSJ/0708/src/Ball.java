import java.util.ArrayList;

public class Ball {
	private ArrayList<Integer> randomBall = new ArrayList<Integer>(); 
	private ArrayList<Integer> pickedBall = new ArrayList<Integer>();

	public Ball() { //Ball �޼��忡����
		for(int i = 0;i < 45;i++) {
			randomBall.add(i + 1); //������ randomBall ArrayList�� �� 45���� �ϳ��� �ֽ��ϴ�.
		}
	}
	
	public void pick() { //pick�޼��忡����
		for(int i = 0;i < 6;i++) {
			int rand = (int)(Math.random() * randomBall.size()); //ball 6���� �ϳ��� 1���� 45������ ���� �߿� ���������ؼ�
			pickedBall.add(randomBall.get(rand)); //���������� ball�� pickedBall �޼��忡 �ֽ��ϴ�.
			randomBall.remove(rand); //�ߺ��� �����ϱ����� ���� ball ���ڴ� randomBall ArrayList���� �����ϰ� �ٽ� for���� ���� ball�� �̴� ������ ��Ĩ�ϴ�.
		}
	}
	
	public void print() { //print �޼���� ���� ���� pickedBall arrayList ũ�⸸ŭ ������� ����ϴ� �޼��� �Դϴ�.
		System.out.print("Picked Number: ");
		for(int i = 0;i < pickedBall.size();i++) {
			System.out.print(pickedBall.get(i) + " ");
		}
		System.out.println();
	}
}