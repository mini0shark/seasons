package kr.ac.skuniv.springexam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tv.TV;

public class SpringExam01 {
	public static void main(String [] args) {
		System.out.println("스프링 공장 세우기 전!");
		ApplicationContext context = new ClassPathXmlApplicationContext("exam01.xml");
		System.out.println("스프링 공장 세우기 후!");
		
		MyBean mybean = context.getBean(MyBean.class); //class만
		
		mybean.setName("kang");
		System.out.println(mybean.getName());    
		
		MyBean mybean2 = context.getBean("myBean", MyBean.class); //id와 class 함께
		mybean2.setName("hong");
		System.out.println(mybean2.getName());
		System.out.println(mybean.getName());
		
		if(mybean == mybean2) {
			System.out.println("같은객체");
		}
	}
}
