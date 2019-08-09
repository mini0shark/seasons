package kr.ac.skuniv.springmvc.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.ac.skuniv.springmvc.config.ApplicationConfig;
import kr.ac.skuniv.springmvc.dto.Todo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ApplicationConfig.class)
public class TodoMapperTest {
	@Autowired
	TodoMapper todoDao;
	
	@Test
	public void getTodos() {
		assertEquals(3, todoDao.getTodos().size());
	}
	@Test
	public void getTodo() {
		assertEquals("mvcTodo", todoDao.getTodo(2).getTodo());
	}
	@Test
	public void addTodo() {
		int size = todoDao.getTodos().size();
		Todo todo = new Todo();
		todo.setTodo("spring study");
		int id = todoDao.addTodo(todo);
		System.out.println("test::"+id);
		assertEquals(size+1, todoDao.getTodos().size());;
	}
}
