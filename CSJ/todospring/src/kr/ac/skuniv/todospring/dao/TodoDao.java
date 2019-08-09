package kr.ac.skuniv.todospring.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kr.ac.skuniv.todospring.dto.Todo;

@Repository
public class TodoDao {
	public String getMsg() {
		//디비에서 정보를 꺼내서 리턴한다.
		return "hihihihi~~~";
	}
	
	public List<Todo> getTodoList(){
		ArrayList<Todo> todolist = new ArrayList<>();
		
		
		return todolist;
	}
	
	
}
