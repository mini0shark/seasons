<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 해당 페이지를 요청 했을때 carami라는 이름의 쿠키를 가진 사용자에게만 보여주고 싶음 -->
	<!-- 만약 carami 쿠키가 없는 사용자라면 CookieInputForm.jsp로 리다이렉트 시킴  -->
	
	<% 
		Cookie[] cookies = request.getCookies();
		boolean checkFlag = false;
		String value = null;
		
		if(cookies != null){
			for(Cookie cookie : cookies){
				if(cookie.getName().equals("carami")){
					checkFlag = true;
					value = cookie.getValue();
					break;
				}
			}
		}
		if(checkFlag){
	%>
	
	<h1>입력한 값은 <%=value %>입니다. 이 페이지는 carami 쿠키를 가진 사용자에게만 보여짐.</h1>
	<%}else {
			response.sendRedirect("CookieInputForm.jsp");
		}%>
	}
</body>
</html>