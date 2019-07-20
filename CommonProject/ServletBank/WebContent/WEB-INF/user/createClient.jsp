<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	String id = "";
	String name = "";
	String birthday="";
	String msg = "회원가입";
	int phoneNumber=0;
	if(request.getParameter("id")!=null){
		id=request.getParameter("id");
	}if(request.getParameter("name")!=null){
		name=request.getParameter("name");
	}
	if(request.getAttribute("passCheckFail")!=null){
		msg="비밀번호를 확인하고 같은 비밀번호를 입력하세요";
	}
	if(request.getAttribute("notEnoughInformation")!=null){
		msg="정보를 모두 입력하지 않으셨습니다.";
	}
	if(request.getAttribute("sameIdFound")!=null){
		msg="동일한 ID가 있습니다. 다른 ID로 계정을 생성하세요";
	}
%>
<center>
	<h1><%=msg %></h1>
	<table>
		<form action="CheckCreateClientServlet" method="post">
			<tr>
				<td>I D :</td>
				<td><input type="text" name="id" value="<%=id%>"/></td>
			</tr>
			<tr>
				<td>name</td>
				<td><input type="text" name="name" value="<%=name%>"/></td>
			</tr>
			<tr>
				<td>password</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td>check password</td>
				<td><input type="password" name="passwordCheck" /></td>
			</tr>
			<tr>
				<td>birthday</td>
				<td><input type="date" name="birthday" /></td>
			</tr>
			<tr>
				<td>phoneNumber</td>
				<td><input type="number" maxlength="4" name="phoneNumber" value=<% if(request.getParameter("phonNumber")!=null){%>
				<%=Integer.parseInt(request.getParameter("phoneNumber"))%><%}%>/></td>
			</tr>
	</table>
	<input type="submit" value="회원가입" />
	<button type="button" onclick="location.href='/ServletBank/' ">취소</button>
	</form>
</center>
</html>