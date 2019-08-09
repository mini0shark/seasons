package kr.ac.skuniv.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DBUtil {
	// DB ����
	public static Connection getConnection() throws SQLException, ClassNotFoundException{
		// 1. ����(Connection ��ü ����)
		String url = "jdbc:mysql://117.17.143.110:3306/skudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "sku";
		String password = "sku";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = 
				DriverManager.getConnection(url, user, password);
		return conn;
	}

	// DB ��������
	public static void close(Connection conn, PreparedStatement ps) {
		if(ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		close(conn, ps);

	}


	public static void main(String[] args) throws Exception {
		System.out.println(DBUtil.getConnection());
	}
}
