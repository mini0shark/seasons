package kr.ac.skuniv.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.skuniv.springmvc.dao.TodoMapper;
import kr.ac.skuniv.springmvc.dto.Todo;
@Service
public class TodoServiceImpl implements TodoService {
	@Autowired
	TodoMapper todoDao;
	@Override
	public void regTodo(String todo) {
	//	todoDao.addTodo(todo);
	}

	@Override
	public void todoDone(int id) {
	//	todoDao.updateTodo(id);
	}

	@Override
	public List<Todo> viewTodoList() {
		return todoDao.getTodos();
	}

	@Override
	public Todo getTodo(int id) {
		
		return todoDao.getTodo(id);
	}

	@Override
	public void deleteTodo(int id) {
	//	todoDao.deleteTodo(id);
	}

}
