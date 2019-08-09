package kr.ac.skuniv.springexam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringExam02 {

	public static void main(String[] args) {
		System.out.println("스프링공장세우기전!!");
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("exam02.xml");
		System.out.println("스프링공장세운 후!!");
		
		MyBean mybean = context.getBean("mybean1", MyBean.class);
		MyBean mybean2 = context.getBean("mybean1", MyBean.class);
		mybean.setCount(200);
		System.out.println(mybean.getName());
		System.out.println(mybean.getCount());
		System.out.println(mybean2.getCount());
		
		
//		MyBean mybean2 = context.getBean("mybean2",MyBean.class);
//		System.out.println(mybean2.getName());
	}

}
