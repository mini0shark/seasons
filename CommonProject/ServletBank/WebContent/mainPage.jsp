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

			if (cookies != null)
				for (Cookie c : cookies)
					if (c.getName().equals("login")) {
						login = true;
						break;
					}
			
			String depositLink;
			String withDrawLink;
			String sendMoneyLink;
			String loginLink;
			String loginOut;

			if (login) {
				depositLink ="ProcessDepositServlet";
				withDrawLink = "ProcessWithdrawalServlet";
				sendMoneyLink = "ProcessSendMoneyServlet";
				loginLink = "BankLogoutServlet";
				loginOut ="로그아웃";
			}else{
				depositLink ="BankLoginServlet?task=deposit";
				withDrawLink = "BankLoginServlet?task=withdraw";
				sendMoneyLink = "BankLoginServlet?task=sendMoney";
				loginLink = "BankLoginServlet";
				loginOut ="로그인";
			}
		%>
		<table>
			<tr>
				<td><a href="<%=depositLink %>">입금</a></td>
				<td><a href="<%=withDrawLink %>">출금</a></td>
				<td><a href="<%=sendMoneyLink %>">송금</a></td>
			</tr>
			<tr>
				<td></td>
				<td colspan="2"><a href="<%=loginLink %>"><%=loginOut %></a></td>
			</tr>
		</table>
	</center>
</body>
</html>