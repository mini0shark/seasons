package CMJ.특강_190711;

import java.sql.*;
import java.util.*;

public class MemberDAO {
	// 입력
	public boolean addMember(MemberDTO member) throws Exception {
		boolean resultFlag = false;
		
		// 선언
		Connection conn = null;
		PreparedStatement preStmt = null;
		
		try {
			conn = DBUtil.getConnection();
			
			String sql = "INSERT INTO members(memberNum, memberFirstName, memberLastName, memberAddr, memberPhone) values (?, ?, ?, ?, ?)";
			
			preStmt = conn.prepareStatement(sql);
			
			preStmt.setLong(1, member.getMemberNum());
			preStmt.setString(2, member.getMemberFirstName());
			preStmt.setString(3, member.getMemberLastName());
			preStmt.setString(4, member.getMemberAddr());
			preStmt.setString(5, member.getMemberPhone());
			
			int resultCount = preStmt.executeUpdate();
			if(resultCount != 1) {
				resultFlag = false;
			} else {
				resultFlag = true;
			}			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConnection(conn, preStmt);
		}
		
		return resultFlag;
	} // 입력
	
	// 수정
	public boolean updateMember(MemberDTO member) throws Exception {
		boolean resultFlag = false;
		
		Connection conn = null;
		PreparedStatement preStmt = null;
		
		try {
			conn = DBUtil.getConnection();
			
			String sql = "UPDATE TABLE members SET memberNum = ?, memberFirstName = ?, memberLastName = ?, memberAddr = ?, memberPhone = ?";
			
			preStmt = conn.prepareStatement(sql);
			
			preStmt.setLong(1, member.getMemberNum());
			preStmt.setString(2, member.getMemberFirstName());
			preStmt.setString(3, member.getMemberLastName());
			preStmt.setString(4, member.getMemberAddr());
			preStmt.setString(5, member.getMemberPhone());
			
			int resultCount = preStmt.executeUpdate();
			if(resultCount != 1) {
				resultFlag = false;
			} else {
				resultFlag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConnection(conn, preStmt);
		}
		
		return resultFlag;
	} // 수정
	
	// 삭제
	public boolean deleteMember(MemberDTO member) throws Exception {
		boolean resultFlag = false;
		
		Connection conn = null;
		PreparedStatement preStmt = null;
		
		try {
			conn = DBUtil.getConnection();
			
			String sql = "DELETE FROM members WHERE memberNum = ? OR memberFirstName = ? OR memberLastName = ? OR memberAddr = ? OR memberPhone = ?";
			
			preStmt = conn.prepareStatement(sql);
			
			preStmt.setLong(1, member.getMemberNum());
			preStmt.setString(2, member.getMemberFirstName());
			preStmt.setString(3, member.getMemberLastName());
			preStmt.setString(4, member.getMemberAddr());
			preStmt.setString(5, member.getMemberPhone());
			
			int resultCount = preStmt.executeUpdate();
			if(resultCount != 1) {
				resultFlag = false;
			} else {
				resultFlag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConnection(conn, preStmt);
		}
		
		return resultFlag;
	}
	
	// 조회 (한 명)
	public MemberDTO getMember(String searchFirstName) throws Exception {
		MemberDTO member = null;
		Connection conn = null;
		PreparedStatement preStmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection();
			
			String sql = "SELECT memberNum, memberFirstName, memberLastName, memberAddr, memberPhone FROM members WHERE memberFirstName = ?";
			
			preStmt = conn.prepareStatement(sql);
			
			preStmt.setString(1, searchFirstName);
			rs = preStmt.executeQuery();
			
			if(rs.next()) {
				member = new MemberDTO();
				member.setMemberNum(rs.getInt(1));
				member.setMemberFirstName(rs.getString(2));
				member.setMemberLastName(rs.getString(3));
				member.setMemberAddr(rs.getString(4));
				member.setMemberPhone(rs.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConnection(conn, preStmt);
		}
		
		return member;
	}
	
	// 조회 (여러 명)
	public List<MemberDTO> getMemberList(String searchFirstName) throws Exception {
		List<MemberDTO> memberList = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement preStmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection();
			
			String sql = "SELECT memberNum, memberFirstName, memberLastName, memberAddr, memberPhone FROM members WHERE memberFirstName = ?";
			
			preStmt = conn.prepareStatement(sql);
			
			preStmt.setString(1, searchFirstName);
			rs = preStmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConnection(conn, preStmt);
		}
		
		return memberList;
	}
}