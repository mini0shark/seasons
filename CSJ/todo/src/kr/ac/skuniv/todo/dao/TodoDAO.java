package kr.ac.skuniv.todo.dao;

import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.ac.skuniv.common.DBUtil;
import kr.ac.skuniv.todo.dto.Todo;

public class TodoDAO {

	public boolean addTodo(Todo todo) {
		boolean resultFlag = false;
		
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtil.getConnection();
			
			String sql = "insert into todo(id,todo,done) values(?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, todo.getId());
			ps.setString(2, todo.getTodo());
			ps.setInt(3, todo.getDone());

			int resultCount = ps.executeUpdate();
			if (resultCount == 1)
				resultFlag = true;
			
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			DBUtil.close(conn, ps);
		}

		return resultFlag;
	}


	public int updateTodo(Todo todo) {
	
		int resultCount=0;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtil.getConnection();
			String sql = "update todo set id=?,todo=?,done=? where id=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, todo.getId());
			ps.setString(2, todo.getTodo());
			ps.setInt(3, todo.getDone());		

			resultCount = ps.executeUpdate();
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// �ݴ´�.
			DBUtil.close(conn, ps);
		}
		return resultCount;
	}

	// ����
	public int deleteTodo(int id) {
		// ����
				int resultCount=0;
				Connection conn = null;
				PreparedStatement ps = null;
				try {
					conn = DBUtil.getConnection();
					String sql = "delete from todo where id=?";
					ps = conn.prepareStatement(sql);
					ps.setInt(1, id);			

					resultCount = ps.executeUpdate();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					// �ݴ´�.
					DBUtil.close(conn, ps);
				}
				return resultCount;
	}

	// ��ȸ (�Ѱ�)
	public Todo getTodo(int id) {
		Todo todo = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			String sql = "select id,todo,done from todo where id =?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				todo = new Todo();
				todo.setId(rs.getInt(1));
				todo.setTodo(rs.getString(2));
				todo.setDone(rs.getInt(3));
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(conn, ps, rs);
		}
		
		return todo;
	}
	// ��ȸ (������)
	public List<Todo> getTodoList(){
		List<Todo> todoList = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			String sql = "select id,todo,done from member";
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Todo todo = new Todo();
				todo = new Todo();
				todo.setId(rs.getInt(1));
				todo.setTodo(rs.getString(2));
				todo.setDone(rs.getInt(3));
				
				todoList.add(todo);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(conn, ps, rs);
		}
		
		return todoList;
	}
	
	
}
