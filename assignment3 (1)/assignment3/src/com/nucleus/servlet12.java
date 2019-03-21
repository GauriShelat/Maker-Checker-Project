package com.nucleus;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet12
 */
@WebServlet("/servlet12")
public class servlet12 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public servlet12() {
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
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		int num1 =Integer.parseInt(request.getParameter("Number1"));
		int num2 = Integer.parseInt(request.getParameter("Number2"));
		
        String Colour1 = request.getParameter("Colour1");
        String Colour2 = request.getParameter("Colour2");
 
        //writer.print("<tr><th>Number</th><th>Square</th></tr>");
        //writer.print
     // return response
        writer.print("<html>");
        writer.print("<body>");
        
        
		writer.print("<table style=\"width:100%\">");
		writer.print("<tr>");
		for(int a= num1;a <= num2;a++) {
			writer.print("<th>"+"Table:"+a+"</th>");
		}
		writer.print("</tr>");
		for(int j=1; j<=10; j++){
			writer.print("<tr>");
			if(j%2 == 0){
				writer.print("<font color:"+Colour1+ " >");
			}
			else {
				writer.print("<font color:"+Colour2+" >");
			}
			for(int i = num1; i<=num2; i++){
				
				writer.print("<td>" + (i*j) + " \t " +"</td>");
				
			}
		//	writer.print("</font></p>");
			writer.print("</tr>");
			writer.print("</font>");
			
			writer.print("<br>"); 
		}
		writer.print("</table>");
		writer.print("</body>");
		writer.print("</html>");
      
		// TODO Auto-generated method stub
	}

}
