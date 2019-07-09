import java.util.ArrayList;

public class Ball {
	private ArrayList<Integer> randomBall = new ArrayList<Integer>(); 
	private ArrayList<Integer> pickedBall = new ArrayList<Integer>();

	public Ball() { //Ball 메서드에서는
		for(int i = 0;i < 45;i++) {
			randomBall.add(i + 1); //생성한 randomBall ArrayList에 공 45개를 하나씩 넣습니다.
		}
	}
	
	public void pick() { //pick메서드에서는
		for(int i = 0;i < 6;i++) {
			int rand = (int)(Math.random() * randomBall.size()); //ball 6개를 하나씩 1부터 45까지의 숫자 중에 랜덤생성해서
			pickedBall.add(randomBall.get(rand)); //랜덤생성한 ball을 pickedBall 메서드에 넣습니다.
			randomBall.remove(rand); //중복을 제거하기위해 뽑은 ball 숫자는 randomBall ArrayList에서 삭제하고 다시 for문을 돌려 ball을 뽑는 과정을 거칩니다.
		}
	}
	
	public void print() { //print 메서드는 뽑은 공을 pickedBall arrayList 크기만큼 순서대로 출력하는 메서드 입니다.
		System.out.print("Picked Number: ");
		for(int i = 0;i < pickedBall.size();i++) {
			System.out.print(pickedBall.get(i) + " ");
		}
		System.out.println();
	}
}