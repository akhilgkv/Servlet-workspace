package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet7
 */
public class Servlet7 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet7() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s1 = request.getParameter("firstName");
		String s2 = request.getParameter("lastName");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("First Name : " + s1 + "<br/>");
		out.println("Last Name : " + s2 + "<br/>");
		Cookie c1 = new Cookie("firstName", s1);
		c1.setMaxAge(6);
		response.addCookie(c1);
		Cookie c2 = new Cookie("lastName", s2);
		response.addCookie(c2);
		
		
		
		out.println("<form action=\"Servlet8\">");
		out.println("Age :<input type=\"text\" name=\"age\"/>" + " <br/>" );
		out.println("Email :<input type=\"text\" name=\"email\"/>" + " <br/>" );
		out.println("<input type=\"submit\" value=\"submit\"/>" + " <br/>" );
		out.println("</form>");
		

	}

}
