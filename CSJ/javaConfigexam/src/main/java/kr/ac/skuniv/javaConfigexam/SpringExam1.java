package kr.ac.skuniv.javaConfigexam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExam1 {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyBeanConfig.class); //애노테이션으로 bean 등록
		
		MyBean bean = context.getBean(MyBean.class);
		bean.setName("kang");
		System.out.println(bean.getName());
	}
}	
