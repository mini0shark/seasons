package kr.ac.skuniv.todospring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.ac.skuniv.todospring.dto.Todo;
import kr.ac.skuniv.todospring.service.TodoService;

@RestController
@RequestMapping("/todos")
public class TodoRestController {
	@Autowired
	private TodoService todoService;
	
	@GetMapping
	public List<Todo> getTodos(){
		return todoService.viewTodoList();
	}
	@GetMapping("/{id}")
	public Todo getTodo(@PathVariable(name="id")int id) {
		return todoService.getTodo(id);
	}
	@DeleteMapping
	public void deleteTodo(@RequestBody int id) {
		todoService.deleteTodo(id);
	}
	@PostMapping
	public Todo addTodo(@RequestBody Todo todo) {
		todoService.regTodo(todo);
		return todo;
	}
}
