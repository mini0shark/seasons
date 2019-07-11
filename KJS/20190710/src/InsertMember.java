import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertMember {
	

	public void addMember(String id,String name, String passwd, String email) {
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
		       String sql="insert into member values(?,?,?,?)";
		       ps=conn.prepareStatement(sql);
		       ps.setString(1, id);
		       ps.setString(2, name);
		       ps.setString(3, passwd);
		       ps.setString(4, email);
		       
		       
			
		     

		       
		       
		 //6. ���� ����
		     int resultCount=ps.executeUpdate();
		     
		     System.out.println(resultCount+"�� �Է� ����^^");
		     
		       
		       
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
	  InsertMember im=new InsertMember();
	  im.addMember("m1", "dd", "bb", "cc");
	 
 }}
 
	