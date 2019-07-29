package kr.ac.skuniv.mybatisExam.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import kr.ac.skuniv.mybatisExam.dto.Todo;

@Repository
//@Repository를 붙여주면 Bean을 알아서 등록해줌
public class TodoDaoImpl implements TodoDao {
	@Autowired	//등록된 빈을 주입 받는것!(생성자 or Getter, Setter)
	private SqlMapClientTemplate template;	//마이바티스를 지원 안한다.
	//템플릿
	@Override
	public List<Todo> getTodoList() {
		// TODO Auto-generated method stub
		return template.queryForList("todoList");
		//리스트로 리턴할것이다. xml에 정의해 놓은 ID를 알리줘야함
	}
	@Override
	public Todo getTodo(int id) {
		// TODO Auto-generated method stub
		return (Todo)template.queryForObject("getTodo", id);
	}
}
