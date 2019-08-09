package kr.ac.skuniv.board.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.skuniv.board.dto.Member;
import kr.ac.skuniv.board.service.MemberService;

@WebServlet("/MemberUpdateServlet")
public class MemberUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws  IOException {
		MemberService service=new MemberService();
		request.setCharacterEncoding("utf-8");
		
		Member member=new Member();
		member.setId(request.getParameter("id"));
		member.setName(request.getParameter("name"));
		member.setPassword(request.getParameter("password"));
		member.setEmail(request.getParameter("email"));
		
		service.updateMember(member);
		response.sendRedirect("MemberList");
	}
}