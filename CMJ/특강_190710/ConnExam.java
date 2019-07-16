package CMJ.특강_190710;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ConnExam {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/skudb?useSSL=false&allowPublicKeyRetrieval=true";
		String user = "root";
		String password = "minji1106";
		
		Connection conn = DriverManager.getConnection(url, user, password);
		
		if(conn != null)
			System.out.println("접속 성공");
		else
			System.out.println("접속 실패");
		
		PreparedStatement ps = conn.prepareStatement("insert into members values(?, ?, ?)");
		
		ps.setString(1, "ㅇ");
		ps.setString(2, "ㅇ@nate.com");
		ps.setString(3, "ㅁㄴㅇㄹ");
		System.out.println(ps.executeUpdate() + "번 성공");
		
		ps.close();
		conn.close();
	}
}
