package kr.ac.skuniv.springexam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.ac.skuniv.game.Game;

public class SpringExam03 {

	public static void main(String[] args) {
		System.out.println("스프링공장세우기전!!");
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("diceplayer.xml");
		System.out.println("스프링공장세운 후!!");
		
		Game game = context.getBean("game", Game.class);
		Game game2 = context.getBean("game", Game.class);
		game.play();
		
		
	}

}
