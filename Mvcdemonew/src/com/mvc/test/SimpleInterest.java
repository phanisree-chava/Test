package com.mvc.test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleInterest
 */
@WebServlet("/interestrate")
public class SimpleInterest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		InstModel ist = new InstModel();
		
		Double princ=Double.parseDouble(request.getParameter("princ"));
	  float anr =Float.parseFloat(request.getParameter("anr"));
		int emi=Integer.parseInt(request.getParameter("emi"));
		ist.setAnr(anr);
		ist.setEmi(emi);
		ist.setPrincipal(princ);
		
		 instService ists = new instService();
		  Double total = ists.cal(princ, anr, emi);
		  
		  request.setAttribute("msg", total);
		 
		
		RequestDispatcher rd = request.getRequestDispatcher("Interestrate.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	*/
	  
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
 
		doGet(request, response);
	

}
}
