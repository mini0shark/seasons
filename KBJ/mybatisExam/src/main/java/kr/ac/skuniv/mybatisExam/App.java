package kr.ac.skuniv.mybatisExam;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.ac.skuniv.mybatisExam.dao.TodoDao;
import kr.ac.skuniv.mybatisExam.dao.TodoDaoImpl;
import kr.ac.skuniv.mybatisExam.dto.Todo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext  context = 
        		new ClassPathXmlApplicationContext("applicationContext.mybatis.xml");
        TodoDao dao = context.getBean(TodoDao.class);
        System.out.println(dao);
        System.out.println(dao.getTodoList().size());
        System.out.println(dao.getTodo(30));
        
        List<Todo> list = dao.getTodoList();
        
        for(Todo todo: list) 
        	System.out.println(todo.getTodo());
    }
}
