package kr.ac.skuniv.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.ac.skuniv.board.dto.Member;
import kr.ac.skuniv.common.DBUtil;

public class MemberDAO {
	// �Է�
	public boolean addMember(Member member) {
		boolean resultFlag = false;
		// ����
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtil.getConnection();
			
			conn.setAutoCommit(false);
			
			String sql = "insert into member(id,name,password,email) values(?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, member.getId());
			ps.setString(2, member.getName());
			ps.setString(3, member.getPassword());
			ps.setString(4, member.getEmail());

			int resultCount = ps.executeUpdate();
			if (resultCount == 1)
				resultFlag = true;
			
			conn.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// �ݴ´�.
			DBUtil.close(conn, ps);
		}

		return resultFlag;
	}

	// ����
	public int updateMember(Member member) {
		// ����
		int resultCount=0;
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtil.getConnection();
			String sql = "update member set name=?,password=?,email=? where id=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, member.getName());
			ps.setString(2, member.getPassword());
			ps.setString(3, member.getEmail());
			ps.setString(4, member.getId());			

			resultCount = ps.executeUpdate();
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// �ݴ´�.
			DBUtil.close(conn, ps);
		}
		return resultCount;
	}

	// ����
	public int deleteMember(String id) {
		// ����
				int resultCount=0;
				Connection conn = null;
				PreparedStatement ps = null;
				try {
					conn = DBUtil.getConnection();
					String sql = "delete from member where id=?";
					ps = conn.prepareStatement(sql);
					ps.setString(1, id);			

					resultCount = ps.executeUpdate();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					// �ݴ´�.
					DBUtil.close(conn, ps);
				}
				return resultCount;
	}

	// ��ȸ (�Ѱ�)
	public Member getMember(String id) {
		Member member = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			String sql = "select id,name,password,email from member where id =?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				member = new Member();
				member.setId(rs.getString(1));
				member.setName(rs.getString(2));
				member.setPassword(rs.getString(3));
				member.setEmail(rs.getString(4));
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(conn, ps, rs);
		}
		
		return member;
	}
	// ��ȸ (������)
	public List<Member> getMemberList(){
		List<Member> memberList = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			String sql = "select id,name,password,email from member";
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Member member = new Member();
				member.setId(rs.getString(1));
				member.setName(rs.getString(2));
				member.setPassword(rs.getString(3));
				member.setEmail(rs.getString(4));
				
				memberList.add(member);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(conn, ps, rs);
		}
		
		
		return memberList;
	}
	
	
}
