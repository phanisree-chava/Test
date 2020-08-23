package com.iiht.evaluation.coronokit.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iiht.evaluation.coronokit.dao.ProductMasterDao;
import com.iiht.evaluation.coronokit.dao.UserDao;
import com.iiht.evaluation.coronokit.dao.UserDetailsDAO;
import com.iiht.evaluation.coronokit.model.UserDetails;


/*@WebServlet("/user")
package net.codejava;

import java.io.*;
import java.sql.SQLException;
 
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;*/
 
@WebServlet("/login")
public class UserController extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    public UserController() {
        super();
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
         
        UserDao userDao = new UserDetailsDAO();
         
        try {
        	
            userDao.checkLogin(email,password);
            String destPage = "login.jsp";
             
            if (userDao != null) {
                HttpSession session = request.getSession();
                session.setAttribute("user", userDao);
                destPage = "home.jsp";
            } else {
                String message = "Invalid email/password";
                request.setAttribute("message", message);
            }
             
            RequestDispatcher dispatcher = request.getRequestDispatcher(destPage);
            dispatcher.forward(request, response);
             
        } catch (SQLException | ClassNotFoundException ex) {
            throw new ServletException(ex);
        }
    }
}
/*public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ProductMasterDao productMasterDao;

	

	public void setProductMasterDao(ProductMasterDao productMasterDao) {
		this.productMasterDao = productMasterDao;
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)  
	        throws ServletException, IOException {  
	  
	        response.setContentType("text/html");  
	        PrintWriter out = response.getWriter();  
	          
	        out.print("welcome User");  
	        out.close();  
	    }  
	
	private String adminLogin(HttpServletRequest request, HttpServletResponse response) {
		return "";
	}

*/
	
}