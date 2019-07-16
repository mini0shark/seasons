package CMJ.특강_190712;

import junit.framework.TestCase;

public class MemberDAOTest extends TestCase {
	MemberDAO memberDao;
	
	protected void setUp() throws Exception {
		memberDao = new MemberDAO();
	}
	
	protected void tearDown() throws Exception {
		memberDao = null;
	}
	
	public void testAddMember() throws Exception {
		MemberDTO member = new MemberDTO();
		member.setMemberNum(1234);
		member.setMemberFirstName("hihi");
		member.setMemberLastName("heyhey");
		member.setMemberAddr("Where");
		member.setMemberPhone("010010010");
		
		assertTrue(memberDao.addMember(member));
		assertEquals("hihi", memberDao.getMember("hihi").getMemberFirstName());
	}
}