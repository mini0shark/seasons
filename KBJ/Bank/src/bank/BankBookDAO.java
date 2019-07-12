package bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BankBookDAO {


	//새 통장을 만든다. 
	public int addClientAndGetId(String clientName, int valance, int clientId) {
		int id=-1;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBUtill.getConnection();
			String sql = "insert into bankbook(accountnumber, valance, clientid, clientname) values(default,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, valance);
			ps.setInt(2, clientId);
			ps.setString(3, clientName);
			int result = ps.executeUpdate();
			DBUtill.destroy(ps);
			if(result == 1) {
				try {
					sql = "SELECT accountnumber FROM bankbook where clientid = ? ORDER BY clientid ASC";
					ps = conn.prepareStatement(sql);
					ps.setInt(1, clientId);
					rs = ps.executeQuery();
					if(rs.next()) {
						id = rs.getInt("clientid");
					}
				} catch (Exception e) {
					// TODO: handle exception
				}finally {
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DBUtill.destroy(conn, ps);
		}
		return id;
	}
	
	//입/출금 시에(이름 수정할 때만 사용)
	public boolean updateBankBook(BankBook bb) {
		boolean resultFlag=false;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtill.getConnection();
			String sql = "UPDATE bankbook SET accountnumber =?, valance = ?, clientid = ? ,clientname =? WHERE accountnumber = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, bb.getAccountNumber());
			ps.setInt(2, bb.getValance());
			ps.setInt(3,bb.getClientId());
			ps.setString(4, bb.getOwner());
			ps.setInt(5, bb.getAccountNumber());
			int result = ps.executeUpdate();
			if(result == 1)
				resultFlag=true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DBUtill.destroy(conn, ps);
		}
		return resultFlag;
	}
	
	//통장 삭제
	public boolean deleteBankBook(Client c) {
		boolean resultFlag=false;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtill.getConnection();
			String sql = "delete from bankbook where clientid = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, c.getId());
			int result = ps.executeUpdate();
			if(result == 1)
				resultFlag=true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DBUtill.destroy(conn, ps);
		}
		return resultFlag;
	}
	
	//조회 (한건)
//	public Client selectBankBook(String id) {
//		Client result = null;
//		Connection conn = null;
//		PreparedStatement ps = null;
//		ResultSet rs = null;
//		try {
//			conn = DBUtill.getConnection();
//			String sql = "select clientid,name from bankbook where accountnumber = ?";
//			ps = conn.prepareStatement(sql);
//			ps.setString(1, id);
//			rs = ps.executeQuery();
//			while(rs.next()){
//				result = new Client(rs.getInt("clientid"), rs.getString("name"));
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}finally {
//			DBUtill.destroy(conn, ps);
//		}
//		return result;
//	}
	//조회 (여러건)

	public ArrayList<BankBook> selectBankBook(Client client) {
		ArrayList<BankBook> arrayBankBook= new ArrayList<BankBook>();
		Client result = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBUtill.getConnection();
			String sql = "select valance,clientid,clientname from bankbook";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				arrayBankBook.add(new BankBook(rs.));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DBUtill.destroy(conn, ps);
		}
		return arrayBankBook;
	}
	
}