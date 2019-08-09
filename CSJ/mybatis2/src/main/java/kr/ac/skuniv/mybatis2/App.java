package kr.ac.skuniv.mybatis2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.ac.skuniv.mybatis2.dao.TodoDao;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = 
    		   new ClassPathXmlApplicationContext("applicationContext.mybatis.xml");
        
       TodoDao dao = context.getBean(TodoDao.class);
       
       System.out.println(dao);
       System.out.println(dao.getTodoList().size());
       System.out.println(dao.getTodo(30));
       dao.deleteTodo(28);
       System.out.println(dao.getTodoList().size());
    }
}
