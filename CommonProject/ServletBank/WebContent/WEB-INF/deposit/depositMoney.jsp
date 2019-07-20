<%@page import="kr.ac.skuniv.bank.dto.BankBook"%>
<%@page import="kr.ac.skuniv.bank.service.BankBookService"%>
<%@page import="kr.ac.skuniv.bank.service.ClientService"%>
<%@page import="kr.ac.skuniv.common.CookieUtill"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<%
			CookieUtill cu = new CookieUtill();
			String id = cu.getCookieString(request, "id");
			BankBookService bs = new BankBookService();
			BankBook bb = bs.getAccounts(Integer.parseInt(request.getParameter("accountNumber")));
			ClientService cs = new ClientService();
			if (request.getParameter("error") != null)
				if (request.getParameter("error").equals("nullAccountNumber")) {
						%><p>계좌번호 오류</p>
						<%
			}
		%>
		<%=cs.getClientNameWithId(bb.getClientId())%>님의 계좌
		<%=bb.getAccountNumber()%>의 현재 잔액
		<h4><%=bb.getValance()%>
			원
		</h4>
		<table>
			<form action="ShowDepositResultServlet" method="post">
				<input type="hidden" name="accountNumber"
					value="<%=bb.getAccountNumber()%>" />
				<tr>
					<td>입금할 금액</td>
					<td><input type="number" name="deopsit" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="입금하기" /></td>
				</tr>
			</form>
		</table>
	</center>
</body>
</html>