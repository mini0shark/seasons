package tv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		//STV를 사용하고 있었을때의 코드 
//		STV tv = new STV();
//		tv.전원을켜다();
//		tv.소리를키우다();
//		tv.소리를줄이다();
//		tv.전원을끄다();
//		
//		//STV가 고장나서 LTV로 바꾸면 어떻게 될까요?
//		LTV tv = new LTV();
//		tv.turnOn();
//		tv.soundUp();
//		tv.soundDown();
//		tv.turnOff();
//STV와 LTV 가 각각 알아서 구현을 했을경우는 TV를 바꿨을때 TV 사용자는
		//많은 부분의 코드를 바꿔야 한다.  
		//그래서 interface로 기능을 통일 시켜서 사용하는것이 바람직하다.
		
		//interface를 이용해서 구현을 하니까 결합도가 낮나져서 수정해야하는 코드가 줄었다.
		//그런데도. new 하는 코드 부분은 수정을 해야만 한다.    이런 부분을 더 개선하기 위해서는
		//어떤방법을 사용해야할까요?? 
		//Factory 객체를 사용해봅시다.
		
//		TV tv = new /*STV();*/ LTV();
		
//		TVfactory tvfactory = new TVfactory();
//		TV tv = tvfactory.getTV(args[0]);
	
		
		ApplicationContext context = new ClassPathXmlApplicationContext("exam01.xml");
		TV tv = (TV)context.getBean("tv");
		
		
		tv.turnOn();
		tv.소리를키우다();
		tv.소리를줄이다();
		tv.turnOff();
		
		
	}

}
