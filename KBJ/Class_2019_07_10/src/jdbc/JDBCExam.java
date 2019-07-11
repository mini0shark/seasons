package jdbc;

import java.sql.*;

public class JDBCExam {
	public static void main(String[] args) throws Exception {
		String driver = "com.mysql.jdbc.Driver";
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/skudb";
		String user = "sku";
		String password = "sku";

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			if (conn != null) {
				System.out.println("접속 완료");
			}
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("드라이버 로드 실패");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("접속 실패");
			e.printStackTrace();
		}
//		
		System.out.println(conn);

		PreparedStatement ps = conn.prepareStatement("insert into test values(?,?,?");
		ps.setInt(1, 1);
		ps.setString(2, "테스트");
		ps.setString(3, "carmi@nate.com");
		try {
			System.out.println(ps.executeUpdate());
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e);
			e.printStackTrace();
		}

		ps.close();
		conn.close();

	}
}
