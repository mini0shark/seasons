package kr.ac.skuniv.bank.web.depositprocess;

import java.io.IOException;

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
 * Servlet implementation class ProcessShowDepositResultServlet
 */
@WebServlet("/ShowDepositResultServlet")
public class ShowDepositResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int accountNumber=0;
		String link =null;
		if(request.getParameter("accountNumber")!=null && request.getParameter("deopsit")!=null) {
			
			try {
				int deposit = Integer.parseInt(request.getParameter("deopsit"));
				accountNumber =Integer.parseInt(request.getParameter("accountNumber"));
				BankBookService bs =new BankBookService();
				int result = bs.depositMoney(accountNumber, deposit);
				System.out.println(bs.ERROR[result]+ result+"----");
				request.setAttribute("deposit", deposit);
				link = "/WEB-INF/deposit/showDepositResult.jsp";
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("제대로된 형식의 deposit 필요");
				e.printStackTrace();
				link = "ErrorPageServlet";
				request.setAttribute("error", "notProperDepositForm");
				request.setAttribute("url", "ShowDepositResultServlet");
			}
		}else {
			request.setAttribute("error", "nullAccountNumber");
			link = "ProcessDepositMoneyServlet";
		}
		RequestDispatcher rd =request.getRequestDispatcher(link);
		rd.forward(request, response);
	}

}
