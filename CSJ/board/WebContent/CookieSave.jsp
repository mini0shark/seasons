<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	//상태정보에 유지할 값이 있다면...  쿠키를 생성한다. 
	String cookieName = request.getParameter("cookieName");
	String cookieValue = request.getParameter("cookieValue");
	Cookie cookie = new Cookie(cookieName,cookieValue);
	cookie.setPath("/");
	cookie.setMaxAge(-1);
	
	response.addCookie(cookie);
	
	response.sendRedirect("CookieView.jsp");
	
%>