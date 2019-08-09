package kr.ac.skuniv.game;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfig {
	@Bean
	public Dice dice() {
		return new Dice(6);
	}
	
	@Bean
	public List<Player> Players(Dice dice) { //Bean 등록, xml방식에서 <bean id="mybean1" class="kr.ac.skuniv.springexam.MyBean"> 와 동일
		List<Player> list = new ArrayList<>();
		Player cha = new Player();
		cha.setName("차수진");
		cha.setDice(dice);
		list.add(cha);
		
		Player hong = new Player();
		hong.setName("홍길동");
		hong.setDice(dice);
		list.add(hong);
		return list;
	}
	
	
	@Bean
	public Game Game(List<Player> Players) {
		Game game = new Game();
		game.setList(Players);
		return game;
	}
	
}
