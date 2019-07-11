package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBase {
	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	public DataBase() {
	}
	public void setDatabase() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");

			String url = "jdbc:mariadb://localhost:3306/skudb";
			String id = "sku";
			String password = "sku";
			conn = DriverManager.getConnection(url, id, password);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void insertToDatabase(String id, String name, String password, String email) {
		setDatabase();
		String sql = "INSERT INTO member values(?,?,?,?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, name);
			ps.setString(3, password);
			ps.setString(4, email);

			int resultCount = ps.executeUpdate();
			System.out.println(resultCount + "건 입력 성공 ^^");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("입력 실패!");
		}	
		destroy();
	}

	public void updateDatabase(String id,  String email) {
		setDatabase();
		String sql = "UPDATE member SET name = ? where id=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, id);
			int rst = ps.executeUpdate();	
			System.out.println("입력 수정 완료 ^^");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("수정 실패!");
		}	
		destroy();
	}
	public void printSelectQuery(String what, String where) {
		setDatabase();
		String sql = "select "+what+" from member";
		if(where != null) {
			if(!where.equals(""))
				sql+=" where "+where;
		}
		System.out.println("Query : "+ sql);
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString(1)+"  "+rs.getString(2)+
						"  "+rs.getString(3)+"  "+rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//			ps.setString(1, "*");
		destroy();
	}
	public void destroy() {		
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

}
