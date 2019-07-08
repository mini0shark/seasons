package CMJ.특강_190705;

import java.util.ArrayList;
import java.util.Random;

public class Ball {
	private ArrayList<Integer> randomBall = new ArrayList<Integer>();
	private ArrayList<Integer> pickedBall = new ArrayList<Integer>();

	public Ball() {
		for(int i = 0;i < 45;i++) {
			randomBall.add(i + 1);
		}
	}
	
	public void pick() {
		for(int i = 0;i < 6;i++) {
			int rand = (int)(Math.random() * randomBall.size());
			pickedBall.add(randomBall.get(rand));
			randomBall.remove(rand);
		}
	}
	
	public void print() {
		System.out.print("Picked Number: ");
		for(int i = 0;i < pickedBall.size();i++) {
			System.out.print(pickedBall.get(i) + " ");
		}
		System.out.println();
	}
}