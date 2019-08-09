package kr.ac.skuniv.todospring.service;

import java.util.List;

import kr.ac.skuniv.todospring.dto.Todo;

public interface TodoService {
	public void regTodo(Todo todo);
	public void todoDone(int id);
	public List<Todo> viewTodoList();
	public Todo getTodo(int id);
	public void deleteTodo(int id);
}
