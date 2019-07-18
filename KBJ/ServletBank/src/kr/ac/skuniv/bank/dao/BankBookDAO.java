package kr.ac.skuniv.bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import kr.ac.skuniv.bank.dto.BankBook;
import kr.ac.skuniv.common.DBUtill;

public class BankBookDAO {
	public boolean insertBankBook(BankBook bankBook) {
		boolean result=false;
		Connection conn=null;
		PreparedStatement ps = null;
		try {
			conn = DBUtill.getConnection();
			String sql = "INSERT INTO bankbook (accountNumber, valance, password, clientNumber, clientName)"
					+ " VALUES(?,?,?,?,?)";
			ps= conn.prepareStatement(sql);
			ps.setInt(1, bankBook.getAccountNumber());
			ps.setInt(2, bankBook.getValance());
			ps.setString(3, bankBook.getPassword());
			ps.setInt(4, bankBook.getClientNumber());
			ps.setString(5, bankBook.getClientName());
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
	public boolean deleteBankBook(int accountNumber) {
		boolean result=false;
		Connection conn=null;
		PreparedStatement ps = null;
		try {
			conn = DBUtill.getConnection();
			String sql = "DELTE FROM bankbook WHERE ID = ?";
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
			String sql = "SELECT accountNumber, valance, password, clientNumber, clientName FROM "
					+ "bankbook WHERE ID = ?";
			ps= conn.prepareStatement(sql);
			ps.setInt(1, accountNumber);
			rs = ps.executeQuery();
			while(rs.next()) {
				bb = new BankBook(rs.getInt("accountNumber"), rs.getInt("valance"), rs.getString("password"), rs.getInt("clientNumber"), rs.getString("clientName"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtill.destroy(conn, ps);
		}
		return bb;
	}
	//통장 여러개 리턴
	public ArrayList<BankBook> selectBankBook(int clientNumber, String clientName) {
		ArrayList<BankBook> bbArr = new ArrayList<BankBook>();
		Connection conn=null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBUtill.getConnection();
			String sql = "SELECT accountNumber, valance, password, clientNumber, clientName FROM "
					+ "bankbook WHERE clientNumber = ?";
			ps= conn.prepareStatement(sql);
			ps.setInt(1, clientNumber);
			rs = ps.executeQuery();
			while(rs.next()) {
				BankBook bb = new BankBook(rs.getInt("accountNumber"), rs.getInt("valance"), rs.getString("password"), rs.getInt("clientNumber"), rs.getString("clientName"));
				bbArr.add(bb);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtill.destroy(conn, ps);
		}
		return bbArr;
	}
	public boolean updateBankBook(BankBook bankBook) {
		boolean result=false;
		Connection conn=null;
		PreparedStatement ps = null;
		try {
			conn = DBUtill.getConnection();
			String sql = "UPDATE bankbook (valance, password, clientNumber, clientName)"
					+ " VALUES(?,?,?,?) WHERE accountNumber = ?";
			ps= conn.prepareStatement(sql);
			ps.setInt(1, bankBook.getValance());
			ps.setString(2, bankBook.getPassword());
			ps.setInt(3, bankBook.getClientNumber());
			ps.setString(4, bankBook.getClientName());
			ps.setInt(5, bankBook.getAccountNumber());
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
}
