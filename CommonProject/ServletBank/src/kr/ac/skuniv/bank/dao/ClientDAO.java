package kr.ac.skuniv.bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import kr.ac.skuniv.bank.dto.BankBook;
import kr.ac.skuniv.bank.dto.Client;
import kr.ac.skuniv.common.DBUtill;

public class ClientDAO {

	//고객 추가
	public boolean insertClient(String id, String name, String password, String birthday, int phoneNumber) {
		boolean resultFlag= false;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtill.getConnection();
			String sql = "INSERT INTO client (clientNumber,id,name, password, birthday,phoneNumber) VALUES(default,?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, name);
			ps.setString(3, password);
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
	//고객 삭제
	public boolean deleteClient(String id) {
		boolean resultFlag= false;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtill.getConnection();
			String sql = "DELETE FROM client WHERE id = ?";			
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
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
	//정보 수정
	public boolean updateClient(Client client) {
		boolean resultFlag= false;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtill.getConnection();
			String sql = "UPDATE client SET name =?, password = ?, birthday = ?,phoneNumber= ? WHERE id = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, client.getName());
			ps.setString(2, client.getPassword());
			ps.setString(3, client.getBirthday());
			ps.setInt(4, client.getPhoneNumber());
			ps.setString(5, client.getId());
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
	//고객정보 하나 리턴
	public Client selectClient(String id) {
		Client client = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBUtill.getConnection();
			String sql = "SELECT * FROM client WHERE id = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				client= new Client(rs.getString("id"), rs.getString("name"), rs.getString("birthday"), rs.getInt("phoneNumber"));
				client.setPassword(rs.getString("password"));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			DBUtill.destroy(conn, ps, rs);
		}
		return client;
	}
	//계정목록 반환
	public ArrayList<Client> selectClient() {
		ArrayList<Client> clients = new ArrayList<Client>();
		Connection conn=null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBUtill.getConnection();
			String sql = "SELECT accountNumber, valance, password, clientNumber, clientName FROM client";
			ps= conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Client bb = new Client(rs.getString("id"), rs.getString("name"), rs.getString("birthday"), rs.getInt("phoneNumber"));
				clients.add(bb);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtill.destroy(conn, ps);
		}
		return clients;
	}

	//계정검사
	public boolean checkAccountExistance(String id) {
		Connection conn=null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean resultFlag = false;
		try {
			conn = DBUtill.getConnection();
			String sql = "SELECT * FROM client WHERE id = ?";
			ps= conn.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				resultFlag =  true;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtill.destroy(conn, ps);
		}
		return resultFlag;
	}

	public String getClientNameWithId(String id) {
		Connection conn=null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String name= "";
		try {
			conn = DBUtill.getConnection();
			String sql = "SELECT Name FROM client WHERE id = ?";
			ps= conn.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				name = rs.getString("Name");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtill.destroy(conn, ps);
		}
		return name;
	}
}
