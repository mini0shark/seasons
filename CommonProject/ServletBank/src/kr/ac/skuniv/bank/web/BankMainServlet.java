package kr.ac.skuniv.bank.web;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/bankMainServlet")
public class BankMainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean loginFlag = false;
		
		Cookie[] cookies = request.getCookies();
		if(cookies != null)
			for(Cookie cookie : cookies)
				if(cookie.getName().equals("login")) {
					loginFlag = true;
					break;
					}
			
		if(loginFlag) {
			request.setAttribute("login", true);
			RequestDispatcher rd = request.getRequestDispatcher("mainPage.jsp");
			rd.forward(request, response);
		}else {
			response.sendRedirect("BankLoginServlet?id=");
			//안나올 수 도
		}

	}	
	
}
