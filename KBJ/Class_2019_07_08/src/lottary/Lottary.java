package lottary;

public class Lottary {
	public static void main(String[] args) {
		LottaryMachine machine = new LottaryMachine();
		machine.mix();
		machine.printSelectedBalls();
	}

}
