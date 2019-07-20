package kr.ac.skuniv.bank.web.bankbook;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.skuniv.bank.service.BankBookService;
import kr.ac.skuniv.bank.service.ClientService;
import kr.ac.skuniv.common.CookieUtill;

/**
 * Servlet implementation class CheckCreateBankBookServlet
 */
@WebServlet("/CheckCreateBankBookServlet")
public class CheckCreateBankBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// TODO Auto-generated method stub
		BankBookService bs = new BankBookService();
		String nextLink = "";
		int accountNumber =0;
		int initialDeposit = 0;
		String password = null;
		//accountNumber나 passWord를 입력하지 않으면
		if(request.getParameter("accountNumber")!=null&&request.getParameter("password")!=null) {
			accountNumber= Integer.parseInt(request.getParameter("accountNumber"));
			password = request.getParameter("password");
			if(password.length()!=4 || request.getParameter("accountNumber").length()!=4) {
				nextLink ="CreateBankBookServlet?error=worngLength";
			}else {
				if(request.getParameter("initialDeposit")==null) {
					initialDeposit=0;
				}else {
					initialDeposit=Integer.parseInt(request.getParameter("initialDeposit"));
				}
				if(bs.checkIfAccountNumberExist(Integer.parseInt((String)request.getParameter("accountNumber")))) { 
					nextLink ="CreateBankBookServlet?error=alreayExist"; 
				}else { 
					CookieUtill cu = new CookieUtill();
					int errocode = bs.createBankBook(accountNumber, initialDeposit, password, cu.getCookieString(request, "id"));
					nextLink = "ProcessDepositChooseBankBookServlet";
				}
			}
		}else {
			nextLink ="CreateBankBookServlet?error=didntInsert";
		}
		response.sendRedirect(nextLink);

	}

}
