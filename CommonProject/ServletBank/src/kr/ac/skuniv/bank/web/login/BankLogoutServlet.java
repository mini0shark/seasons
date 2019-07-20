package kr.ac.skuniv.bank.web.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BankLogoutServlet
 */
@WebServlet("/BankLogoutServlet")
public class BankLogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie[] cookies = request.getCookies(); 
		System.out.println("쿠키1");
		if(cookies!=null)
			for(Cookie c : cookies) { 
				System.out.println(c.getName());
				if(c.getName().equals("login") || c.getName().equals("id")) { 
					System.out.println("쿠키 삭제");
					c.setPath("/");
					c.setMaxAge(0);
					response.addCookie(c);
				}
			}
		response.sendRedirect("/ServletBank/");
	}

}
