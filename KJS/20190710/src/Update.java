import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
	

	public void update(String name, String passwd) {
		 Connection conn=null;
		 PreparedStatement ps=null;
		 
	 try {
		 //3. ����̹� �ε�
		 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			 
			
			 //4. ����(Connection ��ü ����)
			 String url = "jdbc:mysql://localhost:3306/skudb?characterEncoding=utf8&serverTimezone=UTC&useSSL=false&";
			 String user="sku";
			 String password="sku";
			 
		       conn=DriverManager.getConnection(url, user, password);
		       
		
		       //7. ���� ����
		       String sql = "update member set name = ? where password= ?";
		       ps=conn.prepareStatement(sql);
		       ps.setString(1, name);
		       ps.setString(2, passwd);
//		       ps.executeUpdate(sql);  ��� ��������...
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
	
	
	
 public static void main(String args[]) {
	  Update um=new Update();
	  um.update("ȣȣ���ܸ�","bb");
	 
 }}
 
	




/*8.���� ����
String sql="delete from member where password='bbb'";
ps=conn.prepareStatement(sql);*/

