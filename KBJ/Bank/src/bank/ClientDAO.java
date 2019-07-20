package bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class ClientDAO {

	public boolean insertClient(String birthday, int phoneNumber, String name) {
		boolean resultFlag= false;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtill.getConnection();
			String sql = "INSERT INTO client (clientNumber,birthday,phoneNumber,name) VALUES(default,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, birthday);
			ps.setInt(2, phoneNumber);
			ps.setString(3, name);
			int result = ps.executeUpdate();
			if(result == 1) 
				resultFlag = true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("client DataBase 접근에 실패했습니다.");
		}finally {
			DBUtill.destroy(conn, ps);
			return resultFlag;	
		}
	}
	public boolean deleteClient(String birthday, int phoneNumber) {
		boolean resultFlag= false;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtill.getConnection();
			String sql = "DELETE FROM client WHERE birthday = ? AND phoneNumber = ?";			
			ps = conn.prepareStatement(sql);
			ps.setString(1, birthday);
			ps.setInt(2, phoneNumber);
			int result = ps.executeUpdate();
			if(result == 1) 
				resultFlag = true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("client DataBase 접근에 실패했습니다.");
		}finally {
			DBUtill.destroy(conn, ps);
			return resultFlag;	
		}
	}
	public boolean updateClient(String birthday,int phoneNumber, String name) {
		boolean resultFlag= false;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtill.getConnection();
			String sql = "UPDATE client SET birthday = ?,phoneNumber= ?,name =? WHERE birthday = ?, phoneNumber =?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, birthday);
			ps.setInt(2, phoneNumber);
			ps.setString(3, name);
			ps.setString(4, birthday);
			ps.setInt(5, phoneNumber);
			int result = ps.executeUpdate();
			if(result == 1) 
				resultFlag = true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("client DataBase 접근에 실패했습니다.");
		}finally {
			DBUtill.destroy(conn, ps);
			return resultFlag;	
		}
	}
	//통장 하나 리턴
	public BankBook selectClient(int accountNumber, int clientNumber) {
		BankBook bb = null;
		return bb;
	}
	//통장 여러개 리턴
	public ArrayList<Client> selectClient(int accountNumber) {
		ArrayList<Client> bbArr = new ArrayList<Client>();
		return bbArr;
	}
}
