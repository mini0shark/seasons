package CMJ.특강_190711;

public class MemberDAOTest {
	public static void main(String[] args) throws Exception {
		MemberDAO dao = new MemberDAO();
		MemberDTO member = new MemberDTO();
		
		member.setMemberNum(1);
		member.setMemberFirstName("Nick");
		member.setMemberLastName("River");
		member.setMemberAddr("New York City");
		member.setMemberPhone("010-1111-111");
		
		if(dao.addMember(member)) {
			System.out.println("성공");
		} else
			System.out.println("실패");
	}
}
