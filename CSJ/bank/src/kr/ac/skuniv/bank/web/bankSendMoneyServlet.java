package kr.ac.skuniv.bank.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/bankSendMoneyServlet")
public class bankSendMoneyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		boolean loginFlag = false;
		
		Cookie[] cookies = request.getCookies();
		if(cookies != null){
			for(Cookie cookie : cookies){
				if("login".equals(cookie.getName())) {
					loginFlag = true;
					break;
				}
			}		
		}
			
		if(loginFlag) {
			response.sendRedirect("bankSendMoney.jsp");
		}else {
			response.sendRedirect("bankLogin.jsp");
		}
		
	}
}
