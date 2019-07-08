package CMJ.특강_190705;

import java.util.Scanner;

public class Lottery {
	public static void main(String[] args) {
		Ball lottery = new Ball();
		
		lottery.pick();
		
		lottery.print();
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[6];
		
		for(int i = 0;i < 6;i++) {
			do {
				arr[i] = sc.nextInt();
				if(arr[i] < 0 || arr[i] > 45) {
					System.out.println("잘못 입력");
				}
			} while(arr[i] < 0 || arr[i] > 45);
		}
		
		sc.close();
	}
}