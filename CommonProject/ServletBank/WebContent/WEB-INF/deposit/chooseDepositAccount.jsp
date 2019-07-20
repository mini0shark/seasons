<%@page import="kr.ac.skuniv.bank.service.ClientService"%>
<%@page import="kr.ac.skuniv.bank.dto.BankBook"%>
<%@page import="java.util.ArrayList"%>
<%@page import="kr.ac.skuniv.bank.service.BankBookService"%>
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
		<h1>---입금---</h1>
		<%
			boolean login = false;
			String id = "";
			Cookie[] cookies = request.getCookies();
			int count = 2;
			if (cookies != null)
				for (Cookie c : cookies) {
					if (c.getName().equals("login")) {
						login = true;
						count--;
					}
					if (c.getName().equals("id")) {
						id = c.getValue();
						count--;
					}
					if (count < 1)
						break;
				}
			if (login) {
				ClientService cs = new ClientService();
		%><h3><%=cs.getClientNameWithId(id)%>님의 계좌 목록
		</h3>
		<%
			ArrayList<BankBook> bankBookArray = (ArrayList<BankBook>) request.getAttribute("bankBookArray");
				if (bankBookArray.size() > 0) {
		%>
		<table>
			<tr>
				<th>계좌번호</th>
				<th></th>
				<th></th>
				<th>잔&nbsp;&nbsp;&nbsp;액</th>
				<th></th>
			</tr>
				<%
					for (BankBook b : bankBookArray) {
				%>
			
			<tr>
				<td colspan="2"><%=b.getAccountNumber()%></td>
				<td colspan="2"><%=b.getValance()%></td>
				<td><button type="button"
						onclick="location.href='ProcessDepositMoneyServlet?accountNumber=<%=b.getAccountNumber() %>' ">입금하기</button></td>
			</tr>
			<%
				}
			%>

		</table>
		<%
			} else {
		%><h1>계좌가 존재하지 않습니다.</h1>

		<%
			}
		%><p>
			<button type="button"
				onclick="location.href='/ServletBank/CreateBankBookServlet' ">계좌
				생성</button>
		</p>
		<%
			} else {
		%><h2>로그인이 필요한 서비스 입니다.</h2>
		<h2>
			<a href="/ServletBank/">메인으로 돌아가기</a>
		</h2>
		<%
			}
		%>
	</center>
</body>
</html>