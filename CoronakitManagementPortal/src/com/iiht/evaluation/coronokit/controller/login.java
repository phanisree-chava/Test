package com.iiht.evaluation.coronokit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;

import java.io.*;
import java.sql.SQLException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.iiht.evaluation.corona.Exception.CMSException;
import com.iiht.evaluation.coronokit.dao.UserDetailsDAO;
import com.iiht.evaluation.coronokit.model.UserDetails;
public class login  extends HttpServlet {
    private static final long serialVersionUID = 1L;
	/*
	 * public UserLoginServlet() { super(); }
	 */
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
         
        UserDetailsDAO userDao = new UserDetailsDAO();
         
        try {
            UserDetails user = userDao.checkLogin(email, password);
            String destPage = "login.jsp";
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String destPage = ".jsp";
		 
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
    
}
private String adminLogin(HttpServletRequest request, HttpServletResponse response) {
	return "";
}
}

