package kr.ac.skuniv.mybatisExam.dao;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;

import kr.ac.skuniv.mybatisExam.dto.Todo;

public interface TodoDao {
	public List<Todo> getTodoList();
	public Todo getTodo(int id);
}
