package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertMember {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			String driver = "org.mariadb.jdbc.Driver";
			String url = "jdbc:mariadb://localhost:3306/skudb";
			String user = "sku";
			String password = "sku";

			try {
				//드라이버 로딩
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
			String sql = "INSERT INTO member values(?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, "398");
			ps.setString(2, "bong");
			ps.setString(3, "juor");
			ps.setString(4, "sskdj@naver.com");
			
			int resultCount = ps.executeUpdate();
			System.out.println(resultCount + "건 입력 성공 ^^");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if(ps != null) {
				try {
					//닫다가 exception이 발생 할 수 있음
					ps.close();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
	}
}
