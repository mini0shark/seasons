package kr.ac.skuniv.todo.service;

import java.util.List;

import kr.ac.skuniv.todo.dao.TodoDAO;
import kr.ac.skuniv.todo.dto.Todo;

public class TodoService {
	TodoDAO dao = new TodoDAO();
	
	public boolean todoJoin(Todo todo) {
		//Member 데이터를 얻어와서 회원 가입하기 위해
		//필요한 로직이 존재한다면 여기에서 수행함.
		
		//DB에 저장할 정보가 있다면 저장.
	
		return dao.addTodo(todo);
	}
	
	public List <Todo> getTodoList(){
		
		return dao.getTodoList();
	}
	
	public void deleteTodo(int id) {
		//삭제하기 전에 수행할 로직이 있따면 여기서 수행
		dao.deleteTodo(id);
	}
	
	public Todo getTodo(int id) {
		return dao.getTodo(id);
	}
	
	public void updateMember(Todo todo) {
		 dao.updateTodo(todo);
	}
}
