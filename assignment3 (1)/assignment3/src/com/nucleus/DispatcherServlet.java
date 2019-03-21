package com.nucleus;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.*;
import java.io.PrintWriter;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * Servlet implementation class DispatcherServlet
 */
@WebServlet("/DispatcherServlet")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DispatcherServlet() {
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
		// TODO Auto-generated method stub
		Statement stmt = null;
		stmt = (Statement)request.getAttribute("statementobj");
		PrintWriter writer = (PrintWriter)request.getAttribute("printwriterobj");
		String sql = "SELECT user_name,pass_word FROM Assignment4";
		ResultSet rs=null;
		writer.println("printing from dispatcherservlet");
		HttpSession session=request.getSession(false);
		if(session == null) {
			writer.println("Session invalid ");
		}
		else{		
			try {
				rs = stmt.executeQuery(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				while(rs.next()){
					//Retrieve by column name
					String UserName  = rs.getString("user_name");
					writer.print(UserName);
					writer.print("<br>");
			         //Display values
			      }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			 
		     try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    //CREATING LOGOUT OPTION
		    writer.print("<form name=\"loginForm\" method=\"post\" action=\"servletlogout\">");
		    writer.print("<input type=\"submit\" value=\"LogOut\">");
		    writer.print("</form>");    
		   
		    String str = (String)session.getAttribute("UNAME");
			System.out.println("1"+str);
		}		    
		    //CREATING NEW PAGE	    
	}
}
