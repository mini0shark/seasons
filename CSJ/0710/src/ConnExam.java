import java.sql.Connection;
import java.sql.DriverManager;

public class ConnExam  {
 public static void main(String args[]) throws Exception{
    //0. 드라이버 로딩
    
      Class.forName("com.mysql.cj.jdbc.Driver");
   
    
    //1. 접속(Connection 객체 얻어옴)
    String url = "jdbc:mysql://localhost:3306/skudb?characterEncoding=utf8&serverTimezone=UTC&useSSL=false";
    String user="sku";
    String password="sku";
    
   Connection conn=DriverManager.getConnection(url, user, password);
   
    
    //Connection객체를 잘 얻어왔다면 접속이 잘됐다고 판단!!
   if(conn!=null)
      System.out.println("^^");
   else
      System.out.println("-_-");
 }
}
