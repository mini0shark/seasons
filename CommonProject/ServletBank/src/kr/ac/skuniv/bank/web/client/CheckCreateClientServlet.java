package kr.ac.skuniv.bank.web.client;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.skuniv.bank.service.ClientService;

/**
 * Servlet implementation class CheckCreateClientServlet
 */
@WebServlet("/CheckCreateClientServlet")
public class CheckCreateClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ClientService cs = new ClientService();
		String nextLink = "WEB-INF/user/accountCreated.jsp";
		if(!request.getParameter("id").equals("")&&!request.getParameter("password").equals("") && !request.getParameter("phoneNumber").equals("")
				&&!request.getParameter("name").equals("")) {
			//같은 id가 존재하지 않으면
			if(!cs.checkClientExist(request.getParameter("id"))) {
				if(request.getParameter("password").equals(request.getParameter("passwordCheck"))) {
					int resultCode=0;
					int phone=0;
					if(!request.getParameter("phoneNumber").equals("")) {
						phone= Integer.parseInt(request.getParameter("phoneNumber"));
					}
					resultCode = cs.createClient(request.getParameter("id"), request.getParameter("name"), request.getParameter("password"), 
							request.getParameter("birthday"), phone);
					System.out.println(resultCode);
				}else{
					request.setAttribute("passCheckFail", "true");
					nextLink = "WEB-INF/user/createClient.jsp";
				}
			}else {
				request.setAttribute("sameIdFound", "true");
				nextLink = "WEB-INF/user/createClient.jsp";
			}
		}else {
			request.setAttribute("notEnoughInformation", "true");
			nextLink = "WEB-INF/user/createClient.jsp";
		}
		RequestDispatcher rd = request.getRequestDispatcher(nextLink);
		rd.forward(request, response);
	}

}
