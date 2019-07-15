import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class deleteMember {
	public static void main(String args[]) {
	    //1. 필요한 객체를 선언!!
	    //입력을 위해서는 접속,쿼리작성
	    Connection conn=null;
	    PreparedStatement ps=null;
	    
	 try {
	    //3. 드라이버 로딩
	    
	      Class.forName("com.mysql.cj.jdbc.Driver");
	      
	       
	       //4. 접속(Connection 객체 얻어옴)
	       String url = "jdbc:mysql://localhost:3306/skudb?characterEncoding=utf8&serverTimezone=UTC&useSSL=false";
	       String user="sku";
	       String password="sku";
	       
	          conn=DriverManager.getConnection(url, user, password);
	          
	          //5. 쿼리 작성
	          String sql="delete from member where password='aaa'";
	          ps=conn.prepareStatement(sql);

	    	          
	          //6. 쿼리 실행
	        int resultCount=ps.executeUpdate();
	        
	        System.out.println(resultCount+"건 삭제 성공^^");
	          
	          
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
}
