package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {

	// 입력
	public boolean addMember(Member m) {
		boolean resultFlag=false;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DataBaseUtill.getConnection();
			String sql = "insert into member(id,name,password,email) values(?, ?, ?, ?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, m.getId());
			ps.setString(2, m.getName());
			ps.setString(3, m.getPassword());
			ps.setString(4, m.getEmail());
			int result = ps.executeUpdate();
			if(result == 1)
				resultFlag=true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DataBaseUtill.destroy(conn, ps);
		}
		return resultFlag;
	}
	//수정
	public boolean updateMember(Member m) {
		boolean resultFlag=false;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DataBaseUtill.getConnection();
			String sql = "UPDATE member SET id = ?, name = ?, password = ?, email = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, m.getId());
			ps.setString(2, m.getName());
			ps.setString(3, m.getPassword());
			ps.setString(4, m.getEmail());
			int result = ps.executeUpdate();
			if(result == 1)
				resultFlag=true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DataBaseUtill.destroy(conn, ps);
		}
		return resultFlag;
	}
	//삭제
	public boolean deleteMember(Member m) {
		boolean resultFlag=false;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DataBaseUtill.getConnection();
			String sql = "delete from member where id = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, m.getId());
			int result = ps.executeUpdate();
			if(result == 1)
				resultFlag=true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DataBaseUtill.destroy(conn, ps);
		}
		return resultFlag;
	}
	//조회 (한건)
	public Member selectMember(String id) {
		Member result = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DataBaseUtill.getConnection();
			String sql = "select id,name,password,email from member where id = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			while(rs.next()){
				result = new Member(rs.getString("id"), rs.getString("name"), rs.getString("password"), rs.getString("email"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DataBaseUtill.destroy(conn, ps);
		}
		return result;
	}
	//조회 (여러건)

	public ArrayList<Member> selectMember() {
		ArrayList<Member> arrayMember = new ArrayList<Member>();
		Member result = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DataBaseUtill.getConnection();
			String sql = "select id,name,password,email from member";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				arrayMember.add(new Member(rs.getString("id"), rs.getString("name"), rs.getString("password"), rs.getString("email")));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DataBaseUtill.destroy(conn, ps);
		}
		return arrayMember;
	}
}
