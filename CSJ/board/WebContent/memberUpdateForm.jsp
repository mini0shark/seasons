<%@page import="kr.ac.skuniv.board.dto.Member"%>
<%@page import="kr.ac.skuniv.board.service.MemberService"%>
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
		MemberService service = new MemberService();
		Member member = service.getMember(request.getParameter("id"));
	%>

	<h1>회원수정 폼</h1>
	<form action="MemberUpdateServlet" method="post">
		이름 : <input type="text" name="name" value="<%=member.getName()%>" /><br>
		아이디 : <input type="text" name="id" value="<%=member.getId()%>" readonly="readonly" /><br> 
		비밀번호 : <input type="password" name="password" value="<%=member.getPassword()%>" /><br> 
		이메일 : <input type="email" name="email" value="<%=member.getEmail()%>" /><br>
		<input type="submit" value="회원수정" /> 
		<input type="reset" value="취소" />
	</form>

</body>
</html>