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
				System.out.println("���� �Ϸ�");
			}
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("���� ����");
			e.printStackTrace();
		}
//		
		System.out.println(conn);

		PreparedStatement ps = conn.prepareStatement("insert into test values(?,?,?");
		ps.setInt(1, 1);
		ps.setString(2, "�׽�Ʈ");
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
