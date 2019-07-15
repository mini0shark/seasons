import java.sql.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnExam2 {

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
	
	
	public void deleteMember() {
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
	
	public void updateMember() {
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
	          String sql="update member set password='ccc' where name='kang'";
	          ps=conn.prepareStatement(sql);
	        
	          ps.executeUpdate(sql);



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
	
	public void selectMember() {
			//1.�ʿ��� ��ü ����
			Connection conn = null;
			PreparedStatement ps = null;
			ResultSet rs = null; 
			
			try {
				//3.����̹� �ε�
				 Class.forName("com.mysql.cj.jdbc.Driver");
			       
			     //4. ����(Connection ��ü ����)
			     String url = "jdbc:mysql://localhost:3306/skudb?characterEncoding=utf8&serverTimezone=UTC&useSSL=false";
			     String user="sku";
			     String password="sku";
			      
			     conn=DriverManager.getConnection(url, user, password);
			     
			     //5. �����ۼ�
			     String sql = "select * from member where id = ?";
			     ps = conn.prepareStatement(sql);
			     ps.setString(1, "carami");
			     
			     rs = ps.executeQuery();
			     
			     if(rs.next()) {
			    	 System.out.println(rs.getString(1)); //1 => field ��ȣ(�ε���)�� ���ְų� �ʵ��̸� ����
			    	 System.out.println(rs.getString("name"));
			    	 System.out.println(rs.getString(3));
			    	 System.out.println(rs.getString(4));
			     }
			     
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				if(rs != null) {
					try {
						rs.close();
					}catch(SQLException e) {
						e.printStackTrace();
					}
				
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


	public static void main(String args[]) {
		ConnExam2 im=new ConnExam2();
		im.addMember("soojin1","cha","aaa","sjsj@nate.com");
		im.deleteMember();
		im.updateMember();
		im.selectMember();
	}
	
}
