package kr.ac.skuniv.mvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/")
public class FrontServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("FrontServlet 실행!!!");
		System.out.println(request.getRequestURI());
		System.out.println(request.getContextPath());
		
		String path = 
				request.getRequestURI().substring
				(request.getContextPath().length());
		System.out.println(path);
		if("/test.sku".equals(path)) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/test.jsp");
			rd.forward(request, response);
		}else if("/hello.sku".equals(path)) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/hello.jsp");
			rd.forward(request, response);
		}else if("/a.sku".equals(path)) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/a.jsp");
			rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/all.jsp");
			rd.forward(request, response);
		}
	}

}
