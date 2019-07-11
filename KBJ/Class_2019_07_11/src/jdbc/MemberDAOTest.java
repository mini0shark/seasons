package jdbc;

import java.util.ArrayList;

public class MemberDAOTest {
	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		Member m = new Member("gororong", "dao", "password", "gorong@google.com");
		System.out.println(dao.selectMember("gororong"));
		for(Member mem : dao.selectMember()) {
			System.out.println(mem);
		}
	}
}
