package kr.ac.skuniv.javaConfigexam;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.ac.skuniv.game.Game;
import kr.ac.skuniv.game.GameConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=GameConfig.class)
public class GameTest {
	private Game game;
	

	@Test
	public void play() {
		game.play();
	}

	@Autowired
	public void setGame(Game game) {
		this.game = game;
	}
}
