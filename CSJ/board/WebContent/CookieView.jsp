<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>쿠키이름</th>
			<th>쿠키값</th>
			<th>삭제</th>
		</tr>
		<%
		Cookie[] cookies = request.getCookies();
		if(cookies != null){
		for(Cookie cookie : cookies){
	%>
		<tr>
			<td><%=cookie.getName() %></td>
			<td><%=cookie.getValue() %></td>
			<td><a href = "cookieDel.jsp?cookieName=<%=cookie.getName() %>" %>삭제</td>
		</tr>

		<% }}%>
	</table>

	<a href="CookieInputForm.jsp">쿠키등록</a>
</body>
</html>