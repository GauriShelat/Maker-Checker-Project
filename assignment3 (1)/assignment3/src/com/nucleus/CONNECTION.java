package com.nucleus;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;	
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
public class CONNECTION {
	//Connection to jdbc
	public void Connection(UserObject UObj) {
	Statement stmt = null;
	Connection con= null;
    try{   
		//step1 load the driver class   
		Class.forName("oracle.jdbc.driver.OracleDriver");   
		 
		//step2 create  the connection object   
		con=DriverManager.getConnection(   
		"jdbc:oracle:thin:@finn:1521:orcl","hr","hr");
								
		 // stmt=con.createStatement();
		  System.out.println("Servlet signup");
		//  stmt.executeUpdate("insert into Assignment4  values(a, b, c, d, f)");
		  String query = "INSERT INTO Assignment4 VALUES(?,?,?,?,?)";	  
		  PreparedStatement ps = con.prepareStatement(query);
		  ps.setString(1, UObj.FirstName);
		  ps.setString(2, UObj.LastName);
		  ps.setString(3, UObj.UserName);
		  ps.setString(4, UObj.EmailId);
		  ps.setString(5, UObj.Password);
		  ps.executeUpdate();
	}catch(Exception e){ System.out.println(e);} 
	}

}
