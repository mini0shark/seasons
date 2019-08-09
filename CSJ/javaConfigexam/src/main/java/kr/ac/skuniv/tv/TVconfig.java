package kr.ac.skuniv.tv;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TVconfig {
	@Bean
	public TV TV() { //Bean 등록, xml방식에서 <bean id="mybean1" class="kr.ac.skuniv.springexam.MyBean"> 와 동일
		return new LTV();
	}
	
}

