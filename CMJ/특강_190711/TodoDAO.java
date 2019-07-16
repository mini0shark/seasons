package CMJ.특강_190711;

import java.sql.*;

public class TodoDAO {
	public static void addTodo(TodoDTO todo) throws Exception {
		Connection conn = null;
		PreparedStatement preStmt = null;
		
		try {
			conn = DBUtil.getConnection();
			
			String sql = "INSERT INTO todo(todo, done) VALUES (?, ?)";
			
			preStmt = conn.prepareStatement(sql);
			
			preStmt.setString(1, todo.getTodo());
			preStmt.setBoolean(2, false);
			
			preStmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConnection(conn, preStmt);
		}
	} // 삽입
	
	public static void updateTodo(TodoDTO todo) throws Exception {
		Connection conn = null;
		PreparedStatement preStmt = null;
		
		try {
			conn = DBUtil.getConnection();
			
			String sql = "UPDATE todo SET done = true WHERE todo = ?";
			
			preStmt = conn.prepareStatement(sql);
			
			preStmt.setString(1, todo.getTodo());
			
			preStmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConnection(conn, preStmt);
		}
	} // 수정
	
	public static void deleteTodo(TodoDTO todo) throws Exception {
		Connection conn = null;
		PreparedStatement preStmt = null;
		
		try {
			conn = DBUtil.getConnection();
			
			String sql = "DELETE FROM todo WHERE todo = ?";
			
			preStmt = conn.prepareStatement(sql);

			preStmt.setString(1, todo.getTodo());
			
			preStmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConnection(conn, preStmt);
		}
	} // 삭제
	
	public static void selectTodo(TodoDTO todo) throws Exception {
		Connection conn = null;
		PreparedStatement preStmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection();
			
			String sql = "SELECT id, todo, done FROM todo WHERE todo = ?";
			
			preStmt = conn.prepareStatement(sql);
			
			preStmt.setString(1, todo.getTodo());
			
			rs = preStmt.executeQuery();

			while(rs.next()) {
				System.out.println("id = " + rs.getString(1) + ", todo = " + rs.getString(2) + ", done = " + rs.getBoolean(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConnection(conn, preStmt);
		}
	} // 조회
}
