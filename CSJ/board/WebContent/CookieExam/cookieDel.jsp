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
	String cookieName = request.getParameter("cookieName");
	//쿠키를 삭제하기 위해서는 똑같은 이름의 쿠키객체를 만들어서 유지시간을 0으로 바꿔서 client에게 넘긴다.
	Cookie cookie = new Cookie(cookieName, "");
	cookie.setPath("/");
	cookie.setMaxAge(0);
	
	response.addCookie(cookie); //똑같은 이름의 쿠키는 두개 가질 수 없어서 교체해버림.
	response.sendRedirect("CookieView.jsp");
	
	session.removeAttribute("login");
	session.invalidate(); //
	%>
</body>
</html>