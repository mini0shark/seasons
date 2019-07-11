package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.sun.xml.internal.txw2.output.ResultFactory;

public class TodoDAO {

	public boolean insertTodo(String todoList) {
		boolean resultFlag = false;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DataBaseUtill.getConnection();
			String sql = "INSERT INTO todo (id,todo,done) VALUES(DEFAULT, ?, FALSE)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, todoList);
			int result = ps.executeUpdate();
			if(result == 1){
				resultFlag = true;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			return resultFlag;	
		}
	}

	public boolean updateTodo(Todo t) {
		boolean resultFlag = false;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DataBaseUtill.getConnection();
			String sql = "UPDATE todo SET todo = ?, done = ? WHERE id = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, t.getTodo());
			ps.setBoolean(2, t.isDone());
			ps.setInt(3, t.getId());
			int result = ps.executeUpdate();
			if(result == 1){
				resultFlag = true;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			return resultFlag;	
		}
	}
	public boolean done(int id) {
		boolean resultFlag = false;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DataBaseUtill.getConnection();
			String sql = "UPDATE todo SET done = ? WHERE id = ?";
			ps = conn.prepareStatement(sql);
			ps.setBoolean(1, true);
			ps.setInt(2, id);
			int result = ps.executeUpdate();
			if(result == 1){
				resultFlag = true;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			return resultFlag;	
		}
	}
	public boolean deleteTodo(int id) {
		boolean resultFlag = false;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DataBaseUtill.getConnection();
			String sql = "DELETE FROM todo WHERE id=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			int result = ps.executeUpdate();
			if(result == 1){
				resultFlag = true;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			return resultFlag;	
		}
	}
	public Todo selectTodo(int id) {
		boolean resultFlag = false;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Todo t=null;
		try {
			conn = DataBaseUtill.getConnection();
			String sql = "SELECT * FROM todo WHERE id =?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1,id);
			rs = ps.executeQuery();
			if(rs.next()) {
				t = new Todo(rs.getString("todo"));
				t.setId(rs.getInt("id"));
				t.setDone(rs.getBoolean("done"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			return t; 
		}
	}


	public ArrayList<Todo> selectTodo() {
		boolean resultFlag = false;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<Todo> t= new ArrayList<Todo>();
		try {
			conn = DataBaseUtill.getConnection();
			String sql = "SELECT * FROM todo";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Todo temp = new Todo(rs.getString("todo"));
				temp.setId(rs.getInt("id"));
				temp.setDone(rs.getBoolean("done"));
				t.add(temp);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			return t; 
		}
	}
}
