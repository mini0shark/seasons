package kr.ac.skuniv.bank.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/bankWithdrawalServlet")
public class bankWithdrawalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		boolean loginFlag = false;
		
		Cookie[] cookies = request.getCookies();
		if(cookies != null){
			System.out.println("-=================");
			for(Cookie cookie : cookies){
				System.out.println(cookie.getName());
				if("login".equals(cookie.getName())) {
					loginFlag = true;
					break;
				}
			}		
		}
			
		if(loginFlag) {
			response.sendRedirect("bankWithdrawal.jsp");
		}else {
			response.sendRedirect("bankLogin.jsp");
		}
		
	}
}


