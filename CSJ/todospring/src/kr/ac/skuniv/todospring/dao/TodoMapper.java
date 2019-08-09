package kr.ac.skuniv.todospring.dao;

import java.util.List;

import kr.ac.skuniv.todospring.dto.Todo;
import kr.ac.skuniv.todospring.mapper.Mapper;

@Mapper
public interface TodoMapper {
	public Todo getTodo(int id);
	public List<Todo> getTodos();
	public Todo addTodo(Todo todo);
	public void updateTodo(int id);
	public void deleteTodo(int id);
	
}
