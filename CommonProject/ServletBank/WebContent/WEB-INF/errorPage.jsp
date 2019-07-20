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
	<h1>에러가 났습니다.</h1>
	error내용 : <%=(String)request.getAttribute("error") %><br>
	<button type="button" onclick="<%=(String)request.getAttribute("url") %> ' ">이전</button><br>
	<button type="button" onclick="location.href='/ServletBank/ ' ">HOME</button><br>
	</center>
</body>
</html>