package kr.ac.skuniv.board.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.ac.skuniv.board.dto.Member;
import kr.ac.skuniv.board.service.MemberService;


@WebServlet("/MemberList")
public class MemberListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//로그인한 사용자가 요청했다면 리스트 보여주고, 로그인 하지 않은 사용자가 해당 페이지를 요청하면 로그인 폼으로 redirect
		
		boolean loginFlag = false;
		String s = "login";
		//로그인 유무 체크
		//상태정보를 쿠키를 통해 유지했을 때 확인하는 방법
		
//		Cookie[] cookies = request.getCookies();
//		if(cookies != null){
//			for(Cookie cookie : cookies){
//				if("login".equals(cookie.getName())) {
//					loginFlag = true;
//					break;
//				}
//			}		
//		}
		
		
		//상태정보를 세션을 통해서 유지했을 때 확인하는 방법
		HttpSession session = request.getSession();
		if(session.getAttribute("login") != null) {
			loginFlag = true;
		}
		
		if(loginFlag) {
			//로직은 서블릿에서 수행하고,
			MemberService memberService = new MemberService();
			List<Member> memberList = memberService.getMemberList();
		
			//보여주는 부분은 jsp로 함
			request.setAttribute("MemberList", memberList);
			//jsp에 memberList로 보냈는데 jsp에서 MemberList로 받음
			RequestDispatcher rd = request.getRequestDispatcher("memberList.jsp");
			rd.forward(request, response);
		}else {
			//로그인이 안된 사용자
			response.sendRedirect("CookieInputForm.jsp");
		}
 
	}

}
