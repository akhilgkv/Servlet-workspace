package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s1 = request.getParameter("firstName");
		String s2 = request.getParameter("lastName");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("First Name : " + s1 + "<br/>");
		out.println("Last Name : " + s2 + "<br/>");
		out.println("<form action=\"Servlet2\">");
		out.println("Age :<input type=\"text\" name=\"age\"/>" + " <br/>" );
		out.println("Email :<input type=\"text\" name=\"email\"/>" + " <br/>" );
		out.println("<input type=\"submit\" value=\"submit\"/>" + " <br/>" );
		out.println("</form>");
		
		
	}

}


/*
 * to manage session 4 diff techniques are available
 * 
 * */
