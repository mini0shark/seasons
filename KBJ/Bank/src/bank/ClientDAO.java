package bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ClientDAO {

	//�� ���� DB�� �߰��ϰ� �� ID���� ��ȯ�Ѵ�. 
	public int addClientAndGetId(String name) {
		int id=-1;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBUtill.getConnection();
			String sql = "insert into client(clientid,name) values(default, ?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			int result = ps.executeUpdate();
			DBUtill.destroy(ps);
			if(result == 1) {
				try {
					sql = "SELECT clientid FROM client where name = ? ORDER BY clientid ASC";
					ps = conn.prepareStatement(sql);
					ps.setString(1, name);
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
	
	//����(�̸� ������ ���� ���)
	public boolean updateClient(Client c) {
		boolean resultFlag=false;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtill.getConnection();
			String sql = "UPDATE client SET clientid = ?, name = ? WHERE clientid = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, c.getId());
			ps.setString(2, c.getName());
			ps.setInt(3, c.getId());
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
	//����
	public boolean deleteClient(Client c) {
		boolean resultFlag=false;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtill.getConnection();
			String sql = "delete from client where clientid = ?";
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
	//��ȸ (�Ѱ�)
//	public BankBook selectClient(String id) {
//		Client result = null;
//		Connection conn = null;
//		PreparedStatement ps = null;
//		ResultSet rs = null;
//		try {
//			conn = DBUtill.getConnection();
//			String sql = "select clientid,name from bankbook where clientid = ?";
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
	//��ȸ (������)

	public ArrayList<BankBook> selectClient() {
		ArrayList<Client> arrayClient= new ArrayList<Client>();
		Client result = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBUtill.getConnection();
			String sql = "select client,name from client";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				arrayClient.add(new Client(rs.getInt("clientid"), rs.getString("name")));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DBUtill.destroy(conn, ps);
		}
		return arrayClient;
	}
}
