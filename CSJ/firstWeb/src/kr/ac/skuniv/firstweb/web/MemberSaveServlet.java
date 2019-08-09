package kr.ac.skuniv.firstweb.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.skuniv.firstweb.dao.MemberDAO;
import kr.ac.skuniv.firstweb.dto.Member;

public class MemberSaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		//입력받은 내용을 DB에 저장
		MemberDAO dao = new MemberDAO();
		Member member = new Member();
		member.setId(request.getParameter("id"));
		member.setName(request.getParameter("name"));
		member.setPassword(request.getParameter("password"));
		member.setEmail(request.getParameter("email"));

		boolean resultFlag = dao.addMember(member);
		request.setAttribute("resultFlag", resultFlag);
		request.setAttribute("memberInfo", member);
		RequestDispatcher rd = request.getRequestDispatcher("memberSave.jsp");
		rd.forward(request, response);
		

//		response.setContentType("text/html;charset=utf-8");
//		PrintWriter out=response.getWriter();
//
//		out.print("<html><head><title>helloServlet</title></head><body>");
//
//		if(resultFlag) {
//			out.print("회원가입에 성공했습니다.");
//		}else {
//			out.print("회원가입에 실패했습니다.");
//		}
//		out.print("<h1>" +request.getParameter("name") +"님 안녕하세요!</h1><br>");
//		out.print("<h1>입력한 정보는 <br>아이디: " + request.getParameter("id") +"</h1><br>");
//		out.print("<h1>입력한 정보는 <br>비밀번호: " + request.getParameter("password") +"</h1><br>");
//		out.print("<h1>입력한 정보는 <br>이메일: " + request.getParameter("email") +"</h1><br>");
//		out.print("</body></html>");
	}
}
