package kr.ac.skuniv.game;

import java.util.List;

public class Game {
	private List<Player> list;
	
	public Game() {
		System.out.println("Game생성");
	}

	public void setList(List<Player> list) {
		this.list = list;
	}
	
	public void play() {
		System.out.println("Game.play호출");
		for(Player player : list) {
			player.play();
		} 
	}
}

