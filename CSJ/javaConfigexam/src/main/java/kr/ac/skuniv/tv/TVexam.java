package kr.ac.skuniv.tv;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TVexam {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(TVconfig.class); //애노테이션으로 bean 등록
		
		TV tv = context.getBean(TV.class);
		
		
		tv.turnOn();
		tv.소리를키우다();
		tv.소리를줄이다();
		tv.turnOff();
	}
}	
