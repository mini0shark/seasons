package kr.ac.skuniv.todospring.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.ac.skuniv.todospring.config.ApplicationConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ApplicationConfig.class)
public class TodoDaoTest {
	@Autowired
	TodoDao todoDao;
	@Test
	public void getMsg() {
		String msg = todoDao.getMsg();
		assertEquals("hihihihi~~~", msg);
	}

}
