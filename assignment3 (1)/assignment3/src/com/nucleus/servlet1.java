package com.nucleus;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet1
 */
@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public servlet1() {
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
		boolean flag = false;
		String a = request.getParameter("Username");
        String b = request.getParameter("Password");
        PrintWriter writer = response.getWriter();
        
        //CREATING NEW OBJECT
        NewObject NewObj = new NewObject();
        NewObj.CreateInstance(a,b);
        
        //CREATING A SESSION 
        Session session = new Session();
        session.CreateNewSession(NewObj,request,response);        
        
        //CREATING CONNECTION OBJECT
        Statement stmt = null;
        JDBCCONN jdbccon = new JDBCCONN();
        stmt = jdbccon.CreateConnection();
		
        System.out.println("Servlet1");  
         
         //CREATING VALIDATION OBJECT
         VALIDATION validation = new VALIDATION();
         try {
			flag = validation.validate(stmt, NewObj, writer);
			if(flag == true){
				//CREATE AFTER VALIDATION OBJECT
				VALIDATIONACTION validaction = new VALIDATIONACTION();
				validaction.valaction(stmt,writer, request, response );				
			}
			else {
				writer.print("<p>Username/password is not valid</p>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        writer.print("Servlet1"); 
	
		// TODO Auto-generated method stub
	}

}
