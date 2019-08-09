package kr.ac.skuniv.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloAction {
	public void execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//수행할 로직이 있다면 수행, service의 메소드를 호출할 수도 있고
		RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/view/hello.jsp");
		rd.forward(req, res);
	}
}
