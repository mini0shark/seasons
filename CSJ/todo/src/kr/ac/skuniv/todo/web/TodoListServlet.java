package kr.ac.skuniv.todo.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.skuniv.todo.dto.Todo;
import kr.ac.skuniv.todo.service.TodoService;


@WebServlet("/TodoListServlet")
public class TodoListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//로직은 서블릿에서 수행하고,
		TodoService todoService = new TodoService();
		List<Todo> todoList = todoService.getTodoList();
		
		//보여주는 부분은 jsp로 함
		request.setAttribute("TodoList", todoList);
		//jsp에 memberList로 보냈는데 jsp에서 MemberList로 받음
		RequestDispatcher rd = request.getRequestDispatcher("TodoList.jsp");
		rd.forward(request, response); //
	}

}
