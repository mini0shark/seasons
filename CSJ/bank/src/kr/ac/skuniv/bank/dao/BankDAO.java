package kr.ac.skuniv.bank.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.ac.skuniv.bank.dto.Bank;
import kr.ac.skuniv.common.DBUtil;

public class BankDAO {

	public Bank getBank(String id) {
		Bank bank = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			String sql = "select id,password from bank where id =?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				bank = new Bank();
				bank.setId(rs.getString(1));
				bank.setPassword(rs.getString(2));
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(conn, ps, rs);
		}
		
		return bank;
	}
	
}
