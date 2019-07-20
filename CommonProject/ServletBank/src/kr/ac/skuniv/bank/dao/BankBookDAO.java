package kr.ac.skuniv.bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import kr.ac.skuniv.bank.dto.BankBook;
import kr.ac.skuniv.common.DBUtill;

public class BankBookDAO {
	//통장 추가
	public boolean insertBankBook(BankBook bankBook) {
		boolean result=false;
		Connection conn=null;
		PreparedStatement ps = null;
		try {
			conn = DBUtill.getConnection();
			String sql = "INSERT INTO bankbook (accountNumber, valance, password,  clientId)"
					+ " VALUES(?,?,?,?)";
			ps= conn.prepareStatement(sql);
			ps.setInt(1, bankBook.getAccountNumber());
			ps.setInt(2, bankBook.getValance());
			ps.setString(3, bankBook.getPassword());
			ps.setString(4, bankBook.getClientId());
			if(ps.executeUpdate()==1) {
				result= true;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtill.destroy(conn, ps);
		}
		return result;
	}

	//통장 삭제
	public boolean deleteBankBook(int accountNumber) {
		boolean result=false;
		Connection conn=null;
		PreparedStatement ps = null;
		try {
			conn = DBUtill.getConnection();
			String sql = "DELTE FROM bankbook WHERE accountNumber = ?";
			ps= conn.prepareStatement(sql);
			ps.setInt(1, accountNumber);
			if(ps.executeUpdate()==1) {
				result= true;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtill.destroy(conn, ps);
		}
		return result;
	}
	//통장 하나 리턴
	public BankBook selectBankBook(int accountNumber) {
		BankBook bb = null;
		Connection conn=null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBUtill.getConnection();
			String sql = "SELECT accountNumber, valance, password, clientId FROM "
					+ "bankbook WHERE accountNumber = ?";
			ps= conn.prepareStatement(sql);
			ps.setInt(1, accountNumber);
			rs = ps.executeQuery();
			while(rs.next()) {
				bb = new BankBook(rs.getInt("accountNumber"), rs.getInt("valance"), rs.getString("password"), rs.getString("clientId"));
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtill.destroy(conn, ps);
		}
		return bb;
	}

	//통장 여러개 리턴-관리자 입장.
	public ArrayList<BankBook> selectBankBook() {
		ArrayList<BankBook> bbArr = new ArrayList<BankBook>();
		Connection conn=null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBUtill.getConnection();
			String sql = "SELECT accountNumber, valance, password, clientId FROM bankbook";
			ps= conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				BankBook bb = new BankBook(rs.getInt("accountNumber"), rs.getInt("valance"), rs.getString("password"),  rs.getString("clientId"));
				bbArr.add(bb);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtill.destroy(conn, ps);
		}
		return bbArr;
	}
	//통장 여러개 리턴- 회원에 따라
	public ArrayList<BankBook> selectBankBook(String id) {
		ArrayList<BankBook> bbArr = new ArrayList<BankBook>();
		Connection conn=null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBUtill.getConnection();
			String sql = "SELECT accountNumber, valance, password, clientId FROM "
					+ "bankbook WHERE clientId = ?";
			ps= conn.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {
				BankBook bb = new BankBook(rs.getInt("accountNumber"), rs.getInt("valance"), rs.getString("password"),  rs.getString("clientId"));
				bbArr.add(bb);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtill.destroy(conn, ps);
		}
		return bbArr;
	}
	//통장 업데이트
	public boolean updateBankBook(BankBook bankBook) {
		boolean result=false;
		Connection conn=null;
		PreparedStatement ps = null;
		try {
			conn = DBUtill.getConnection();
			String sql = "UPDATE bankbook SET valance=?, password=?,  clientId=? WHERE accountNumber = ?";
			ps= conn.prepareStatement(sql);
			ps.setInt(1, bankBook.getValance());
			ps.setString(2, bankBook.getPassword());
			ps.setString(3, bankBook.getClientId());
			ps.setInt(4, bankBook.getAccountNumber());
			if(ps.executeUpdate()==1) {
				result= true;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtill.destroy(conn, ps);
		}
		return result;
	}
	//계좌번호 검사
	public boolean checkAccountExistance(int accountNumber) {
		Connection conn=null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean flag=false;
		try {
			conn = DBUtill.getConnection();
			String sql = "SELECT * FROM bankbook WHERE accountNumber = ?";
			ps= conn.prepareStatement(sql);
			ps.setInt(1, accountNumber);
			rs = ps.executeQuery();
			if(rs.next()) {
				flag= true;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtill.destroy(conn, ps);
		}
		return flag;
	}
	//계좌번호 검사
	public int countAccountNumber(String clientId) {
		Connection conn=null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int result= 0;
		try {
			conn = DBUtill.getConnection();
			String sql = "SELECT * FROM bankbook WHERE clientId = ?";
			ps= conn.prepareStatement(sql);
			ps.setString(1, clientId);
			rs = ps.executeQuery();
			while(rs.next()) {
				result++;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtill.destroy(conn, ps);
		}
		return result;
	}
}
