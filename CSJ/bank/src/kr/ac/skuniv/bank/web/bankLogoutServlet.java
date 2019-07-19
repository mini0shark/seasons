package kr.ac.skuniv.bank.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/bankLogoutServlet")
public class bankLogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cookieName = request.getParameter("id");
		
		Cookie cookie = new Cookie("login", "");
		cookie.setPath("/");
		cookie.setMaxAge(0);
		
		response.addCookie(cookie); 
		response.sendRedirect("mainPage.jsp");
	}

}






	
