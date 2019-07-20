<%@page import="kr.ac.skuniv.bank.dto.BankBook"%>
<%@page import="kr.ac.skuniv.bank.service.ClientService"%>
<%@page import="kr.ac.skuniv.bank.service.BankBookService"%>
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
			int deposit = 0;
			if (request.getAttribute("deposit") != null)
				deposit = (Integer) request.getAttribute("deposit");
		%>
		<h1><%=deposit%><font size="1">원이 성공적으로 입급되었습니다.</font>
		</h1>
		<%=cs.getClientNameWithId(bb.getClientId())%>님의 계좌
		<%=bb.getAccountNumber()%>의 현재 잔액
		<h4><%=bb.getValance()%>
			원
		</h4>
		<table>
			<tr>
				<td>
					<button type="button" onclick="location.href='/ServletBank/ ' ">HOME</button></td>
			</tr>
		</table>
	</center>
</body>
</html>