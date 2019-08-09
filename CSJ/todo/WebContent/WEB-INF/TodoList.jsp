<%@page import="kr.ac.skuniv.todo.dto.Todo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% List<Todo> todoList = (List<Todo>)request.getAttribute("TodoList"); %>
	<center>
		<h1>회원목록</h1>
		<table>
			<tr>
				<th>아이디</th>
				<th>할것</th>
				<th>한일</th>
				<th>수정</th>
				<th>삭제</th>
			</tr>
			<%if(todoList != null){ 
      for(Todo todo:todoList){
   %>
			<tr>
				<td><%=todo.getId() %></td>
				<td><%=todo.getTodo() %></td>
				<td><%=todo.getDone() %></td>
				
				<td><a href="todoUpdateForm.jsp?id=<%=todo.getId() %>">수정</a>
				
				<td><a href="todoDel?id=<%=todo.getId() %>">삭제</a></td>
				
			</tr>
			<%
         }//forend
      }// if end%>
		</table>
	</center>
</body>
</html>