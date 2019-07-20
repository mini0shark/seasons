package kr.ac.skuniv.bank.web.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.skuniv.bank.dto.Client;
import kr.ac.skuniv.bank.service.BankBookService;
import kr.ac.skuniv.bank.service.ClientService;

/**
 * Servlet implementation class CheckLoginServlet
 */
@WebServlet("/CheckLoginServlet")
public class CheckLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String password = req.getParameter("password");
		ClientService clientService = new ClientService();
		Client client = clientService.getAccounts(id);
		String checkId = null;
		String checkPassword  = null;
		if(client != null) {
			checkId= client.getId();
			checkPassword = clientService.getAccounts(id).getPassword();
		}
		if(id.equals(checkId) && checkPassword.equals(password)) {
			Cookie cookie = new Cookie("login", "true");
			cookie.setPath("/");
			cookie.setMaxAge(-1);
			resp.addCookie(cookie);
			cookie = new Cookie("id", id);
			cookie.setPath("/");
			cookie.setMaxAge(-1);
			resp.addCookie(cookie);
			if(req.getParameter("task").equals("")) {
				resp.sendRedirect("/ServletBank/");
			}
			else{
				switch((String)req.getParameter("task")) {
				case "deposit":
					resp.sendRedirect("ProcessDepositChooseBankBookServlet");
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
			resp.sendRedirect("BankLoginServlet?id="+id);
//			RequestDispatcher rd = req.getRequestDispatcher("BankLoginServlet?id="+id);
//			rd.forward(req, resp);
		}
	}
}