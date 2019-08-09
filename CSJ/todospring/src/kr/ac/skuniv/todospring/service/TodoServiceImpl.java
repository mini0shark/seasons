package kr.ac.skuniv.todospring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.ac.skuniv.todospring.dao.TodoMapper;
import kr.ac.skuniv.todospring.dto.Todo;
@Service
public class TodoServiceImpl implements TodoService {
	@Autowired
	TodoMapper todoMapper;
	@Override
	public void regTodo(Todo todo) {
		todoMapper.addTodo(todo);
	}

	@Override
	@Transactional
	public void todoDone(int id) throws RuntimeException{
		todoMapper.updateTodo(id);
		throw new RuntimeException();
	}

	@Override
	@Transactional(readOnly=true)
	public List<Todo> viewTodoList() {
		return todoMapper.getTodos();
	}

	@Override
	public Todo getTodo(int id) {
		
		return todoMapper.getTodo(id);
	}

	@Override
	@Transactional
	public void deleteTodo(int id) {
		todoMapper.deleteTodo(id);
		throw new RuntimeException();
	}

}
