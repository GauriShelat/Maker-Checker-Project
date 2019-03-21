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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
public class VALIDATION {

	public boolean validate(Statement stmt, NewObject NewObj, PrintWriter writer) throws SQLException{
		boolean flag = false;
		String sql = "SELECT user_name,pass_word FROM Assignment4";
		ResultSet rs = stmt.executeQuery(sql);
		 while(rs.next()){
			  //Retrieve by column name
		      String UserName  = rs.getString("user_name");
		      String passkey = rs.getString("pass_word");
		      if((UserName.equals(NewObj.Username) && passkey.equals(NewObj.Password))){
		    	  flag = true;
		    	  break;
		       }
		         
		         //Display values
		         
		      }			 
		      rs.close();
		      return flag;
		  
	}
}
