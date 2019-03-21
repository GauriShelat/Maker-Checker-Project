package com.nucleus;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class servletlogout
 */
@WebServlet("/servletlogout")
public class servletlogout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletlogout() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String str = (String)session.getAttribute("UNAME");
		System.out.println("2"+str);
	
		//System.out.println("1"+str);
		session.invalidate();
		PrintWriter writer = response.getWriter();
		
			//String str = (String)session.getAttribute("UNAME");
			//System.out.println("2"+str);	
		Cookie ck[]=request.getCookies();
		String Uname = ck[1].getValue();
		String Pass = ck[2].getValue();
		
		//writer.print("SESSION TIME OUTT");
		//CREATING NEW PAGE
		//writer.print("<p><a href=\"http://localhost:8081/assignment3/Login2.html\">Redirect to login page</a></p>");
		writer.print("<h1>Sign In/Sign Up Page</h1>");
		writer.print("<p>Log In.</p>");
		writer.print("<form name=\"loginForm\" method=\"post\" action=\"servlet1\">");
		writer.print("User name:<br>");
		writer.print("<input type='text' name='Username' value = " +Uname+ "><br>");
		writer.print("Password:<br>");
		writer.print("<input type='text' name='Password' value =" +Pass+ "><br>");
		writer.print("<input type='submit' value='Login'>");
		writer.print("</form>");
		writer.print("<form action=\"http://localhost:8081/assignment3/signupform.html\">");
		writer.print("<input type=\"submit\" value=\"Sign Up\">");
		writer.print("</form>");
		
		
		// TODO Auto-generated method stub
	}

}
