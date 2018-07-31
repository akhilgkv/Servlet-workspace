package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet10
 */
public class Servlet10 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet10() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		HttpSession session = request.getSession();
		out.println("sessioon id " + session.getId()+ "<br/>" );
		
		String s1 = (String)session.getAttribute("firstName");
		String s2 = (String)session.getAttribute("lastName");
		out.println("First Name : " + s1 + "<br/>" );
		out.println("Last Name : " + s2 + "<br/>" );
		String s3 = request.getParameter("age");
		String s4 = request.getParameter("email");
		out.println("Age : " + s3 + "<br/>" );
		out.println("Email : " + s4 + "<br/>" );
		
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for(Cookie cookie : cookies) {
				out.println(cookie.getName()+ ":" + cookie.getValue()+ "<br/>");
			}
		}
		else 
		{
			out.println("Please enable cookies in your browser");
		}
	}

}
