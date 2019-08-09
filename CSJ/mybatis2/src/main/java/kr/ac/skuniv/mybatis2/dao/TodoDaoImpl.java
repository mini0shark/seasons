package kr.ac.skuniv.mybatis2.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import kr.ac.skuniv.mybatis2.dto.Todo;

@Repository
public  class TodoDaoImpl implements TodoDao {
	@Autowired
	private SqlMapClientTemplate template;
	@Override
	public List<Todo> getTodoList() {
		return template.queryForList("todoList");
	}
	@Override
	public Todo getTodo(int id) {		
		return (Todo)template.queryForObject("getTodo", id);
	}
	@Override
	public void deleteTodo(int id) {
		template.delete("deleteTodo", id);
	}

}
