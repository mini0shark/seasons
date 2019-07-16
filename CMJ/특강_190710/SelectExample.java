package CMJ.특강_190710;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectExample {
	public ResultSet selectMember(String name) throws Exception {
		Connection conn = null;
		PreparedStatement preStmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/skudb?useSSL=false&allowPublicKeyRetrieval=true";
			String user = "root";
			String password = "minji1106";
			
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "select id, name, email from members where name = ?";
			
			preStmt = conn.prepareStatement(sql);
			preStmt.setString(1, name);
			
			rs = preStmt.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString("id");
				String email = rs.getString("email");
				
				System.out.println("id = " + id + ", name = " + name + ", email = " + email);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(preStmt != null) {
				preStmt.close();
				conn.close();
			}
		}
		
		return rs;
	}
	
	public static void main(String[] args) throws Exception {
		SelectExample sel = new SelectExample();
		sel.selectMember("abcd");
	}
}