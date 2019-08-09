package kr.ac.skuniv.board.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;

import kr.ac.skuniv.board.service.MemberService;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		MemberService service = new MemberService();
		boolean loginFlag = service.login(id, password);
		HttpSession session = request.getSession();
		
		if(loginFlag) {
			//아이디 패스워드 동일할 경우
			//상태정보 유지시켜줌
			//쿠키 이용한 상태정보 유지
//			Cookie cookie = new Cookie("login", id);
//			cookie.setPath("/");
//			cookie.setMaxAge(-1);
//
//			response.addCookie(cookie);
			
			
			//세션을 이용한 상태정보 유지
			//클라이언트 당 서버 하나
			
			session.setAttribute("login", id);
			
			response.sendRedirect("memberList.jsp");
		}
		else {
			//아이디 패스워드 다를경우
			session.setAttribute("msg", "login정보가 다릅니다. 다시 로그인하세요");
			response.sendRedirect("CookieInputForm.jsp");
		}
	
	}
}
