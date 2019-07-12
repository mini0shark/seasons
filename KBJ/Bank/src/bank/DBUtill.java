package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtill {
	public static Connection getConnection() throws SQLException{
		return getConnection( "jdbc:mariadb://localhost:3306/skudb", "sku", "sku");
	}
	public static Connection getConnection( String url,String id, String password) throws SQLException{
		Connection conn = null;
			conn = DriverManager.getConnection(url, id, password);
			return conn;
		
	}
	
	public static void destroy(Connection conn, PreparedStatement ps) {
		try {
			if(ps != null)
				ps.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			System.out.println("ps 종료");
		}
		try {
			if(conn != null)
				conn.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			System.out.println("conn 종료");
		}
	}
	public static void destroy(Connection conn, PreparedStatement ps, ResultSet rs) {		
		//		====
		try {
			if(rs != null)
				rs.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			System.out.println("rs 종료");
		}

		destroy(conn, ps);

	}

}
