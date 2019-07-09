package lottary;

import java.util.ArrayList;
import java.util.Collections;

public class LottaryMachine {
	private ArrayList<LottaryBall> allBalls;
	private ArrayList<LottaryBall> selectedBalls;
	public LottaryMachine() {
		// TODO Auto-generated constructor stub
		allBalls = new ArrayList<LottaryBall>();
		selectedBalls = new ArrayList<LottaryBall>();
		for(int i = 0; i<45; i++) {
			LottaryBall  ball = new LottaryBall();
			ball.setNumber(i+1);
			allBalls.add(ball);
		}
	}
	public void printSelectedBalls() {
		if(selectedBalls.size()>0) {
			System.out.println("선택된 공 : ");
			for(LottaryBall ball: selectedBalls) {
				System.out.print(ball.getNumber()+"\t");
			}
		}
		else {
			System.out.println("선택된 공이 없습니다. pickBall()으로 공을 뽑아보세요");
		}
	}

	public void mix() {
		System.out.println("로또 공을 섞는다.");
		for(int i= 0; i<100; i++) {
			int x = (int)(Math.random()*45);
			LottaryBall temp = allBalls.get(x);
			allBalls.remove(x);
			allBalls.add(temp);
		}
	}

	public void pickBall() {
		System.out.println("6개의 공을 뽑아준다.");
		for(int i=0;i<6; i++) {
			selectedBalls.add(allBalls.get(0));
			allBalls.remove(0);
		}
	}
	public void pourToContainer() {
		for(int i =0; i<selectedBalls.size(); i++) {
			allBalls.add(selectedBalls.get(0));
			selectedBalls.remove(0);
		}
	}
}