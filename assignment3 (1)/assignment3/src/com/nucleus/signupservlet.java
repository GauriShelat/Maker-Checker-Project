package com.nucleus;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class signupservlet
 */
@WebServlet("/signupservlet")
public class signupservlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signupservlet() {
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
		PrintWriter writer = response.getWriter();
		String a = request.getParameter("First Name");
        String b = request.getParameter("Last Name");
        String c = request.getParameter("User Name");
        String d = request.getParameter("Email Id");
        String f = request.getParameter("Set Password");
		RequestDispatcher rd=request.getRequestDispatcher("UserObject");
 		
		
		//CREATING NEW OBJECT
 		UserObject UObj = new UserObject();
 		UObj.CreateNewObject(a,b,c,d,f);
 		
 		//CREATING CONNECTION OBJECT
 		CONNECTION conn = new CONNECTION();
 		conn.Connection(UObj);
        
        
		// TODO Auto-generated method stub
	}

}
