<%@page import="kr.ac.skuniv.firstweb.dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=request.getParameter("name")%>님 안녕하세요^^

	<%
		Member member = (Member) request.getAttribute("memberInfo");
		boolean resultFlag = (boolean) request.getAttribute("resultFlag");
		if (resultFlag) {
	%>
	회원가입에 성공^^
	<br> 회원님이 입력하신 정보는
	<%=member%>
	입니다.
	<br>

	<%
		} else {
	%>
	회원가입에 실패--;
	<%
		}
	%>

	<a href="memberForm.html">회원가입하러가기~~!!</a>

</body>
</html>