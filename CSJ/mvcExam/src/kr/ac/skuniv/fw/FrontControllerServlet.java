package kr.ac.skuniv.fw;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.sku")
public class FrontControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getRequestURI().substring(request.getContextPath().length());
		try {
			ActionFactory factory = ActionFactory.getInstance();
			Action action = factory.getAction(path);
			action.execute(request, response);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
