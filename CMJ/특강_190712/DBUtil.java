package CMJ.특강_190712;

import java.sql.*;

public class DBUtil {
	public static Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/skudb?useSSL=false&allowPublicKeyRetrieval=true";
		String user = "root";
		String password = "minji1106";
		
		Connection conn = DriverManager.getConnection(url, user, password);
		
		return conn;
	}
	
	public static void closeConnection(Connection conn) throws SQLException {
		if(conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void closeConnection(Connection conn, PreparedStatement preStmt) throws SQLException {
		if(preStmt != null) {
			try {
				preStmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		closeConnection(conn);
	}
	
	public static void closeConnection(Connection conn, PreparedStatement preStmt, ResultSet rs) throws SQLException {
		if(rs != null) {
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		closeConnection(conn, preStmt);
	}
	
	public static void main(String[] args) throws Exception {
		DBUtil.closeConnection(DBUtil.getConnection());
	}
}
