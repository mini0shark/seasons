package kr.ac.skuniv.todospring.dao;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.ac.skuniv.todospring.config.ApplicationConfig;
import kr.ac.skuniv.todospring.dto.Todo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ApplicationConfig.class)
public class TodoMapperTest {
	@Autowired
	TodoMapper todoMapper;
	@Test
	public void getTodos() {
		List<Todo> todos = todoMapper.getTodos();
		assertNotNull(todos);
		System.out.println(todos.size());
		
	}
	

}
