package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet9
 */
public class Servlet9 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet9() {
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
		
		HttpSession session = request.getSession();
		session.setAttribute("firstName", s1);
		session.setAttribute("lastName", s2);
		
		//out.println("<form action=\"Servlet10;jsessionid="+session.getId()+"\">");
		String path = response.encodeURL("Servlet10");
		out.println("<form action=\""+path+"\">");
		out.println("Age :<input type=\"text\" name=\"age\"/>" + " <br/>" );
		out.println("Email :<input type=\"text\" name=\"email\"/>" + " <br/>" );
		out.println("<input type=\"submit\" value=\"submit\"/>" + " <br/>" );
		out.println("</form>");
		
	}

}
