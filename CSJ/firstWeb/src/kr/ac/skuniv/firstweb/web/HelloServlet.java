package kr.ac.skuniv.firstweb.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service 실행");
		request.setCharacterEncoding("utf-8");
		
//		System.out.println(request.getProtocol());
//		System.out.println(request.getPathInfo());
//		System.out.println(request.getLocalAddr());
//		System.out.println(request.getRemoteAddr());
//		System.out.println(request.getRequestURI());
//		System.out.println(request.getMethod());
//		System.out.println(request.getLocalName());
		
		System.out.println(request.getParameter("name"));
		String name = request.getParameter("name");
		
		String id = request.getParameter("id");
		//응답
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>helloServlet</title></head><body>");
		out.print("<h1>" +name +"님 안녕하세요!</h1>");
		out.print("<h1>" + id + "님 안녕!</h1>");
		out.print("</body></html>");
	}

	@Override
	public void destroy() {
		System.out.println("destroy 실행");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init 실행");
	}
	
}
 