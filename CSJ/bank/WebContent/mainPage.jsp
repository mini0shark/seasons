<%@page import="kr.ac.skuniv.bank.dto.Bank"%>
<%@page import="kr.ac.skuniv.bank.service.BankService"%>
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
		BankService service = new BankService();
		Bank bank = null;
		String str;
	%>
	<% 
		if(request.getParameter("id")== null){
	%>
		<h1>Main Page</h1>
		<form action="bankMainServlet" method="post">
			<a href="bankDepositServlet">입금</a>
	    	<a href="bankWithdrawalServlet">출금</a>
			<a href="bankSendMoneyServlet?">송금</a>
			<a href="bankLogin.jsp">로그인</a>
		</form>
			
		<% }else{
			str =request.getParameter("id");
			bank = service.getBank(str);
		%>
		<h1>Main Page</h1>
		<form action="bankMainServlet" method="post">
			<a href="bankDepositServlet?id=<%=bank.getId() %>">입금</a>
	  		<a href="bankWithdrawalServlet?id=<%=bank.getId() %>">출금</a>
			<a href="bankSendMoneyServlet?id=<%=bank.getId() %>">송금</a>
			<a href="bankLogoutServlet?id=<%=bank.getId() %>">로그아웃</a>
		</form>
			
		<% }%>
		


</body>
</html>