package com.nucleus;
import java.io.IOException;
import java.io.PrintWriter;

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
public class UserObject {

	String FirstName;
	String LastName;
	String UserName;
	String EmailId;
	String Password;
	public void CreateNewObject(String a, String b, String c, String d, String f) {
		this.FirstName =a;
		this.LastName  =b;
		this.UserName  =c;
		this.EmailId   =d;
		this.Password  =f; 
		return;
	}
}

