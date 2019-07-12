package jdbc;

import junit.framework.TestCase;

public class MemberDAOTest2 extends TestCase {
	MemberDAO dao;
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		dao = new MemberDAO();
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		dao = null;
	}
	public void testAddMember() throws Exception{
		Member mem = new Member("123","name","ppsss", "email@google.com");
		
		assertTrue(dao.addMember(mem));
		assertEquals("name", dao.selectMember("123").getName());
	}
	
}
