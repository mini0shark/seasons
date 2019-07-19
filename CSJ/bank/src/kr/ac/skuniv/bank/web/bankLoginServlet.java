package kr.ac.skuniv.bank.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.skuniv.bank.service.BankService;


@WebServlet("/bankLoginServlet")
public class bankLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		BankService service = new BankService();
		boolean loginFlag = service.login(id, password);
		
		if(loginFlag) {
			Cookie cookie = new Cookie("login", id);
			cookie.setPath("/");
			cookie.setMaxAge(-1);
			response.addCookie(cookie);
			response.sendRedirect("mainPage.jsp?id="+id);
		}else {
			response.sendRedirect("bankLogin.jsp");
		}
	}

}

