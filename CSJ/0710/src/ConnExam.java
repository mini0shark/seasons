import java.sql.Connection;
import java.sql.DriverManager;

public class ConnExam  {
 public static void main(String args[]) throws Exception{
    //0. ����̹� �ε�
    
      Class.forName("com.mysql.cj.jdbc.Driver");
   
    
    //1. ����(Connection ��ü ����)
    String url = "jdbc:mysql://localhost:3306/skudb?characterEncoding=utf8&serverTimezone=UTC&useSSL=false";
    String user="sku";
    String password="sku";
    
   Connection conn=DriverManager.getConnection(url, user, password);
   
    
    //Connection��ü�� �� ���Դٸ� ������ �ߵƴٰ� �Ǵ�!!
   if(conn!=null)
      System.out.println("^^");
   else
      System.out.println("-_-");
 }
}
