package kr.ac.skuniv.todospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.skuniv.todospring.dto.Todo;
import kr.ac.skuniv.todospring.service.TodoService;

@Controller
public class TodoController {
	@Autowired
	TodoService todoService;
	@RequestMapping("/viewTodo")
	public String todos(Model model) {
		model.addAttribute("todoList", todoService.viewTodoList());
		return "todo";
	}
	@RequestMapping("/regTodo")
	public String addTodo(Todo todo) {
		System.out.println(todo);
		todoService.regTodo(todo);
		return "redirect:viewTodo";
	}
	@RequestMapping("/doneTodo")
	public String doneTodo(int id) {
		System.out.println("done");
		Todo todo = todoService.getTodo(id);
		if(todo.isDone()) {
			todoService.deleteTodo(id);
		}else {
			todoService.todoDone(id);
		}	
		
		return "redirect:viewTodo";
	}
	
}
