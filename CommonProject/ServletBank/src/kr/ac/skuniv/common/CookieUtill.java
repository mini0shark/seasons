package kr.ac.skuniv.common;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtill {
	public String getCookieString(HttpServletRequest request, String key) {
		Cookie[] cookies  = request.getCookies();
		String str = "";
		if(cookies!=null) {
			for(Cookie c : cookies)
				if(c.getName().equals(key)) {
					str=c.getValue();
				}
		}
		return str;
	}
	public void deleteCookie(HttpServletRequest request, HttpServletResponse response, String text) {
		Cookie[] cookies = request.getCookies(); 
		System.out.println("쿠키1");
		if(cookies!=null)
			for(Cookie c : cookies) { 
				System.out.println(c.getName());
				if(c.getName().equals(text)) { 
					c.setPath("/");
					c.setMaxAge(0);
					response.addCookie(c);
				}
			}
	}
	public void setCookie(HttpServletRequest request, HttpServletResponse response, String key, String value) {
		Cookie cookie = new Cookie(key, value);
		cookie.setPath("/");
		cookie.setMaxAge(-1);
		response.addCookie(cookie);
	}
	
	public boolean checkCookie(HttpServletRequest request, String text) {
		Cookie[] cookies = request.getCookies();
		boolean check= false;
		if (cookies != null)
			for (Cookie c : cookies) {
				if (c.getName().equals(text)) {
					check = true;
					break;
				}
			}
		return check;
	}
	

}
