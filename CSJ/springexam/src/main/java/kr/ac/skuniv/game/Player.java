package kr.ac.skuniv.game;

public class Player {
	private String name;
	private Dice dice;
	
	public Player() {
		System.out.println("player생성!!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDice(Dice dice) {
		this.dice = dice;
	}
	
	public void play() {
		System.out.println(name +"은 주사위를 던져서 "+dice.getNumber()+"가 나왔습니다.");
	}
}
