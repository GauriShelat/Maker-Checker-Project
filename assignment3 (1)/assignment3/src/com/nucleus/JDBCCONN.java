package com.nucleus;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JDBCCONN {
	Statement stmt=null;
	Connection con=null;
	public Statement CreateConnection() {
		try{   
			//step1 load the driver class   
			Class.forName("oracle.jdbc.driver.OracleDriver");   
			 
			//step2 create  the connection object   
			con=DriverManager.getConnection(   
			"jdbc:oracle:thin:@finn:1521:orcl","hr","hr");
									
			 stmt=con.createStatement();
			  System.out.println("Servlet1");

		      //String sql = "SELECT user_name,pass_word FROM Assignment4";
		        
			   
			 
		}catch(Exception e){ System.out.println(e);} 
		return stmt;
	}
	

}
