import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
	

	public void update(String name, String passwd) {
		 Connection conn=null;
		 PreparedStatement ps=null;
		 
	 try {
		 //3. 드라이버 로딩
		 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			 
			
			 //4. 접속(Connection 객체 얻어옴)
			 String url = "jdbc:mysql://localhost:3306/skudb?characterEncoding=utf8&serverTimezone=UTC&useSSL=false&";
			 String user="sku";
			 String password="sku";
			 
		       conn=DriverManager.getConnection(url, user, password);
		       
		
		       //7. 쿼리 수정
		       String sql = "update member set name = ? where password= ?";
		       ps=conn.prepareStatement(sql);
		       ps.setString(1, name);
		       ps.setString(2, passwd);
//		       ps.executeUpdate(sql);  요게 문제였음...
		       //6. 쿼리 실행
		     int resultCount=ps.executeUpdate();
		     
		     System.out.println(resultCount+"건 수정 성공^^");
		     
		       
		       
	 }catch(Exception e){
		 e.printStackTrace();
	 }finally {
		 //2. 선언한 객체를 닫는다!!!
		 if(ps!=null) {
			 try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		 }
		 if(conn!=null) {
			 try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		 }
	 }
	}
	
	
	
 public static void main(String args[]) {
	  Update um=new Update();
	  um.update("호호아줌마","bb");
	 
 }}
 
	




/*8.쿼리 삭제
String sql="delete from member where password='bbb'";
ps=conn.prepareStatement(sql);*/

