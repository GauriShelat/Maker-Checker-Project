package com.nucleus;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class Session {

	public void CreateNewSession(NewObject NewObj,HttpServletRequest request, HttpServletResponse response) {
		HttpSession session=request.getSession();
		session.setAttribute("UNAME",NewObj.Username);
		session.setAttribute("PASS", NewObj.Password);
		
		session.setMaxInactiveInterval(20);
		Cookie c = new Cookie("name",NewObj.Username);
		Cookie c1 =new Cookie("passkey", NewObj.Password);  
		response.addCookie(c);
		response.addCookie(c1);
	}
}
