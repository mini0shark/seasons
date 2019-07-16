package CMJ.특강_190710;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteExample {
	public void deleteMember(String id) throws Exception {
		Connection conn = null;
		PreparedStatement preStmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/skudb?useSSL=false&allowPublicKeyRetrieval=true";
			String user = "root";
			String password = "minji1106";
			
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "delete from members where id = ?";
			
			preStmt = conn.prepareStatement(sql);
			preStmt.setString(1, id);
			
			int count = preStmt.executeUpdate();
			
			System.out.println(count + "번 입력");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(preStmt != null) {
				preStmt.close();
				conn.close();
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		DeleteExample del = new DeleteExample();
		del.deleteMember("abc");
	}
}