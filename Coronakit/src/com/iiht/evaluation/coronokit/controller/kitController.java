package com.iiht.evaluation.coronokit.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iiht.evalution.coronakit.service.OperationService;
import com.mvc.test.InstModel;
import com.mvc.test.RequestDispatcher;
import com.mvc.test.instService;

/**
 * Servlet implementation class kitController
 */
@WebServlet("/kitController")
public class kitController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public kitController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	OperationService ist = new OperationService();
		
		Double princ=Double.parseDouble(request.getParameter("princ"));
	  Double anr =Double.parseDouble(request.getParameter("anr"));
		int emi=Integer.parseInt(request.getParameter("emi"));
		ist.setAnr(princ);
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
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
