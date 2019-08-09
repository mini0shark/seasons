<%@page import="kr.ac.skuniv.todo.dto.Todo"%>
<%@page import="kr.ac.skuniv.todo.service.TodoService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		TodoService service = new TodoService();
		Todo todo = service.getTodo(Integer.parseInt(request.getParameter("id")));
	%>

	<h1>회원수정 폼</h1>
	<form action="TodoUpdateServlet" method="post">
		아이디 : <input type="text" name="id" value="<%=todo.getId()%>"
			readonly="readonly" /><br> 할것 : <input type="text" name="todo"
			value="<%=todo.getTodo()%>" /><br> 한것 : <input type="text"
			name="done" value="<%=todo.getDone()%>" /><br> <input
			type="submit" value="회원수정" /> <input type="reset" value="취소" />
	</form>

</body>
</html>