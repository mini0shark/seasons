package kr.ac.skuniv.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.skuniv.springmvc.service.TodoService;

@Controller
public class TodoController {
	@Autowired
	TodoService todoService;
	@RequestMapping("/viewTodo")
	public String todos(Model model) {
		model.addAttribute("todoList", todoService.viewTodoList());
		return "todo/todo";
	}
	@RequestMapping("/regTodo")
	public String addTodo(String todo) {
		todoService.regTodo(todo);
		return "redirect:viewTodo";
	}
}
