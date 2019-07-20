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
		<h1>계좌생성</h1>
		<h3>
		<%
			if (request.getParameter("error") != null) {
				if (request.getParameter("error").equals("alreayExist")) {
		%>
		동일 계좌가 이미 존재합니다.
		<%
			} else if (request.getParameter("error").equals("worngLength")) {
		%>
		비밀번호와 계좌번호는 4자리 입니다.
		<%
			} else if(request.getParameter("error").equals("didntInsert")){
				%>
				 필수 항목을 입력하세요
				<%
			}
		}
		%></h3>
		<table>
			<form action="CheckCreateBankBookServlet" method="post">
				<tr>
					<td>계좌번호 :</td>
					<td><input type="number" name="accountNumber" maxlength="4" /></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="password" maxlength="4" /></td>
				</tr>
				<tr>
					<td>초기 입금액</td>
					<td><input type="number" name="initialDeposit" /></td>
				</tr>
		</table>
		<input type="submit" value="계좌생성" />
		<button type="button" onclick="location.href='/ServletBank/' ">메인으로
			돌아가기</button>
		</form>
</body>
</html>