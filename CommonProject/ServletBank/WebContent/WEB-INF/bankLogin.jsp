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
		String id = "";
		String msg = "로그인";
		if (request.getParameter("id") != null) {
			id = request.getParameter("id");
	%>====아이디 혹은 비밀번호가 틀렸습니다====<%
		}
		String task = "";
		if (request.getParameter("task") != null) {
			task = (String) request.getParameter("task");
			msg = "로그인이 필요한 서비스 입니다.";
		} else {
			task = "";
		}
	%>
	<center>
		<h1><%=msg%></h1>
		<table>
			<form action="CheckLoginServlet" method="post">
				<input type="hidden" name="task" value="<%=task%>" />
				<tr>
					<td>아이디 :</td>
					<td><input type="text" name="id" value="<%=id%>"></td>
				</tr>
				<tr>
					<td>비밀번호 :</td>
					<td><input type="password" name="password"></td>
				<tr>
					<td></td>
					<td><input type="submit" value="로그인"></td>
				</tr>
			</form>
		</table>
	</center>
</body>
</html>