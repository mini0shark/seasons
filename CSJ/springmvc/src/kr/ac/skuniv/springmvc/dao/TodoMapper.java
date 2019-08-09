package kr.ac.skuniv.springmvc.dao;

import java.util.List;

import kr.ac.skuniv.springmvc.dto.Todo;
import kr.ac.skuniv.springmvc.mapper.Mapper;

@Mapper
public interface TodoMapper {
	public Todo getTodo(int id);
	public List<Todo> getTodos();
	public int addTodo(Todo todo);
}
