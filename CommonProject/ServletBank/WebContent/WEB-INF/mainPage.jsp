<%@page import="kr.ac.skuniv.bank.service.ClientService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>Main Page</h1>
		<%
			boolean login = false;
			Cookie[] cookies = request.getCookies();
			String welcome="사계절은행에 오신것을 환영합니다.";
			int count =2;
			if (cookies != null)
				for (Cookie c : cookies){
					if (c.getName().equals("login")) {
						login = true;
						count--;
					}
					if(c.getName().equals("id")){
						ClientService cs = new ClientService();
						welcome =cs.getClientNameWithId(c.getValue())+"님 환영합니다.";
						count--;
					}
					if(count<1){
						break;
					}
				}
			
			String depositLink;
			String withDrawLink;
			String sendMoneyLink;
			String loginLink;
			String loginOut;
			if (login) {
				depositLink ="ProcessDepositChooseBankBookServlet";
				withDrawLink = "ProcessWithdrawalServlet";
				sendMoneyLink = "ProcessSendMoneyServlet";
				loginLink = "BankLogoutServlet";
				loginOut ="로그아웃";
				ClientService cs = new ClientService();
			}else{
				depositLink ="BankLoginServlet?task=deposit";
				withDrawLink = "BankLoginServlet?task=withdraw";
				sendMoneyLink = "BankLoginServlet?task=sendMoney";
				loginLink = "BankLoginServlet";
				loginOut ="로그인";
			}
		%>
		<h2><%=welcome %></h2>
		<table>
			<tr>
				<td><a href="<%=depositLink %>">입금</a></td>
				<td><a href="<%=withDrawLink %>">출금</a></td>
				<td><a href="<%=sendMoneyLink %>">송금</a></td>
			</tr>
			<tr>
				<td></td>
				<td <%if(login){ %>colspan="2"<%} %>><a href="<%=loginLink %>"><%=loginOut %></a></td>
				<%if(!login){ %><td><a href="CreateClientServlet">회원가입</a></td><%} %>
			</tr>
		</table>
	</center>
</body>
</html>