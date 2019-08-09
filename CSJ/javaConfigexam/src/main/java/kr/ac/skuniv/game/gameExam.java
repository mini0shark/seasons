package kr.ac.skuniv.game;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class gameExam {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class); //애노테이션으로 bean 등록
		
		Game game = context.getBean(Game.class);
		
		game.play();
	
	}
}	

