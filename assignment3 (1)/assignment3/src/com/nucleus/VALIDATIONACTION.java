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
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


public class VALIDATIONACTION {
	public void valaction(Statement stmt,PrintWriter writer,HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
	
		
		RequestDispatcher rd= request.getRequestDispatcher("DispatcherServlet");  
		request.setAttribute("statementobj", stmt);
		request.setAttribute("printwriterobj", writer);
		rd.include(request, response);
		
		
	}
	
}
