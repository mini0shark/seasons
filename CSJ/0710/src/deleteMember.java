import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class deleteMember {
	public static void main(String args[]) {
	    //1. �ʿ��� ��ü�� ����!!
	    //�Է��� ���ؼ��� ����,�����ۼ�
	    Connection conn=null;
	    PreparedStatement ps=null;
	    
	 try {
	    //3. ����̹� �ε�
	    
	      Class.forName("com.mysql.cj.jdbc.Driver");
	      
	       
	       //4. ����(Connection ��ü ����)
	       String url = "jdbc:mysql://localhost:3306/skudb?characterEncoding=utf8&serverTimezone=UTC&useSSL=false";
	       String user="sku";
	       String password="sku";
	       
	          conn=DriverManager.getConnection(url, user, password);
	          
	          //5. ���� �ۼ�
	          String sql="delete from member where password='aaa'";
	          ps=conn.prepareStatement(sql);

	    	          
	          //6. ���� ����
	        int resultCount=ps.executeUpdate();
	        
	        System.out.println(resultCount+"�� ���� ����^^");
	          
	          
	 		}catch(Exception e){
	 			e.printStackTrace();
	 		}finally {
	 			//2. ������ ��ü�� �ݴ´�!!!
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
