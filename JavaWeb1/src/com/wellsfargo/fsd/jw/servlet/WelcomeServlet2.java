package com.wellsfargo.fsd.jw.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


	
	@WebServlet("/arth")
	public class WelcomeServlet2 extends HttpServlet {

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
		{
			/*
			 * String username = req.getParameter("unm"); if(username == null) { username =
			 * "somebody"; }
			 * 
			 * resp.setContentType("text/html"); PrintWriter out = resp.getWriter();
			 * out.println("<html>"); out.println("<body>");
			 * out.println("<h1>hello this is first<h1>"+username+"<h1> java app</h1>");
			 * out.println("</body>"); out.println("</html");
			 */
			
			
			  int a=Integer.parseInt(req.getParameter("n1"));
			   int b=Integer.parseInt(req.getParameter("n2"));
			   int sum = a+b;
			  resp.setContentType("text/html");
			  PrintWriter out = resp.getWriter();
			  out.println("<html>");
			  out.println("<body>");
			  out.println("<h1>"+sum+"</h1>"); 
			  out.println("</body>");
			  out.println("</html");
			 
			}
			
			

}
