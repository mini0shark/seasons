package kr.ac.skuniv.bank.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.skuniv.bank.service.BankBookService;

/**
 * Servlet implementation class CheckLoginServlet
 */
@WebServlet("/CheckLoginServlet")
public class CheckLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int accountNumber = Integer.parseInt(req.getParameter("accountNumber"));
		String password = req.getParameter("password");
		
		BankBookService bankBookService = new BankBookService();
		int tempId = bankBookService.getAccounts(accountNumber).getAccountNumber();
		String tempPassword =bankBookService.getAccounts(accountNumber).getPassword();
		if(accountNumber==tempId && tempPassword.equals(password)) {
			Cookie cookie = new Cookie("login", "true");
			cookie.setPath("/");
			cookie.setMaxAge(-1);
			resp.addCookie(cookie);
			cookie = new Cookie("accountNumber", Integer.toString(accountNumber));
			cookie.setPath("/");
			cookie.setMaxAge(-1);
			resp.addCookie(cookie);
			if(req.getParameter("task").equals("")) {
				resp.sendRedirect("mainPage.jsp");
			}
			else{
				switch((String)req.getParameter("task")) {
				case "deposit":
					resp.sendRedirect("ProcessDepositServlet");
					break;
				case "withdraw":
					resp.sendRedirect("ProcessWithdrawServlet");
					break;
				case "sendMoney":
					resp.sendRedirect("ProcessSendMoneyServlet");
					break;
				}
			}

		}else {
			RequestDispatcher rd = req.getRequestDispatcher("BankLoginServlet?accountNumber="+accountNumber);
			rd.forward(req, resp);
		}
	}


}