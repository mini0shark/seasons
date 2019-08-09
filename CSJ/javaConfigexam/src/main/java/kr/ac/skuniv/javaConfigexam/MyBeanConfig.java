package kr.ac.skuniv.javaConfigexam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBeanConfig {
	@Bean
	public MyBean myBean() { //Bean 등록, xml방식에서 <bean id="mybean1" class="kr.ac.skuniv.springexam.MyBean"> 와 동일
		return new MyBean();
	}
}
