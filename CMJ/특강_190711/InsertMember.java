package CMJ.특강_190711;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertMember {
	static Connection conn = null;
	static PreparedStatement preStmt = null;
	
	public static void main(String[] args) {
		connect(conn);
		
	}
	
	public static void connect(Connection conn) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/skudb?useSSL=false&allowPublicKeyRetrieval=true";
			String user = "root";
			String password = "minji1106";
			
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("connect");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void closes(Connection conn, PreparedStatement preStmt) throws Exception {
		if(preStmt != null) {
			preStmt.close();
			conn.close();
		}
	}
}