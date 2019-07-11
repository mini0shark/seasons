package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectExam {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
			String url = "jdbc:mariadb://localhost:3306/skudb";
			String id = "sku";
			String password = "sku";
			
			conn = DriverManager.getConnection(url, id, password);
			String sql = "SELECT * FROM member WHERE id =?";
			String sql2 = "SELECT * FROM member";
			
			ps = conn.prepareStatement(sql2);
//			ps.setString(1, "*");
			
			rs = ps.executeQuery();
			
			while(rs.next()){
				System.out.println(rs.getString(1)+"  "+rs.getString("name")+
						"  "+rs.getString(3)+"  "+rs.getString(4));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
//		====
		try {
			if(rs != null)
				rs.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			if(ps != null)
				ps.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			if(conn != null)
				conn.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
