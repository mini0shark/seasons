package kr.ac.skuniv.bank.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ErrorPageServlet
 */
@WebServlet("/ErrorPageServlet")
public class ErrorPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String error = "";
		String prePage = request.getParameter("url");
		if(request.getParameter("error")!=null ) {
			error=request.getParameter("error");
		}else if(request.getAttribute("error")!=null ) {
			error=(String)request.getAttribute("error");
		}
		if(request.getAttribute("url")!=null ) {
			prePage=(String)request.getAttribute("url");
		}else {
			prePage = "/ServletBank/";
		}
		request.setAttribute("error", error);
		request.setAttribute("url", prePage);
		RequestDispatcher  rd = request.getRequestDispatcher("WEB-INF/errorPage.jsp");
		rd.forward(request, response);
	}

}
