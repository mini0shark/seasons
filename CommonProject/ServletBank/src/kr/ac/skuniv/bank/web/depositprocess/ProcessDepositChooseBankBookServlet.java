package kr.ac.skuniv.bank.web.depositprocess;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.skuniv.bank.dto.BankBook;
import kr.ac.skuniv.bank.service.BankBookService;

/**
 * Servlet implementation class ProcessDepositServlet
 */
@WebServlet("/ProcessDepositChooseBankBookServlet")
public class ProcessDepositChooseBankBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		BankBookService bs = new BankBookService();
		Cookie[] cookies  = req.getCookies();
		String id = "";
		if(cookies!=null) {
			for(Cookie c : cookies)
				if(c.getName().equals("id")) {
					id=c.getValue();
				}
		}
		ArrayList<BankBook> bbArr = bs.getAccounts(id);
		req.setAttribute("bankBookArray", bbArr);
		RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/deposit/chooseDepositAccount.jsp");
		rd.forward(req, resp);
	}
}
