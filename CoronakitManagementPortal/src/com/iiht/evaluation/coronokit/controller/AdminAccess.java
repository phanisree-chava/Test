package com.iiht.evaluation.coronokit.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iiht.evaluation.corona.Exception.CMSException;
import com.iiht.evaluation.coronokit.model.ProductMaster;
import com.iiht.evalution.coronakit.service.AdminService;
import com.iiht.evalution.coronakit.service.AdminServiceImpl;


/**
 * Servlet implementation class AdminAccess

@WebServlet({ "/login", "/newproduct", "/insertproduct", "/deleteproduct", "/editproduct", "/list" })
 */
@WebServlet(urlPatterns = {"/newproduct", "/insertproduct", "/deleteproduct","/editproduct", "/listproducts"})

public class AdminAccess extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private AdminService adminservice;

	@Override
	public void init() throws ServletException {
		adminservice= new AdminServiceImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		String url = request.getServletPath();
		String viewName="";
		switch (url) {
		/*
		 * case "/login" :viewName = adminLogin(request, response); break;
		 */
		
		 case "/newproduct": viewName = newProduct(request, response); break;
		   case "/insertproduct":viewName = insertProduct(request, response); break;
		  case "/deleteproduct": viewName = deleteProduct(request, response); break;
		  case "editproduct": viewName = showEditProductForm(request, response);
		  break;
		  
		/*
		 * // case "/updateproduct": viewName = showEditProductForm(request, response);
		 * break;
		 */
		  case "/listproducts":viewName = listAllProducts(request, response);
				break;	
			/*
			 * case "/logout": viewName = adminLogout(request, response); break;
			 */
			default : viewName = "notfound.jsp";
			break;		
			}
			
		
		request.getRequestDispatcher(viewName).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	private String listAllProducts(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String view="";
		try {
			List<ProductMaster> items = adminservice.getAllItems();
			request.setAttribute("items", items);
			view="listproducts.jsp";
		} catch (CMSException e) {
			request.setAttribute("errMsg", e.getMessage());
			view="errPage.jsp";
		}
		
		return view;
	}

	private String newProduct(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ProductMaster item = new ProductMaster();
		request.setAttribute("item", item);
		
		return "newproduct.jsp";
	}

	private String insertProduct(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				
		ProductMaster item = new ProductMaster();
		
		item.setId(Integer.parseInt(request.getParameter("id")));
		item.setProductDescription(request.getParameter("ProductDescription"));
		item.setProductName(request.getParameter("ProductName"));		
		item.setCost(Double.parseDouble(request.getParameter("cost")));
		
		String view="";
		
		try {
			adminservice.validateAndAdd(item);
			request.setAttribute("msg", "Item Got Added!");
			view="index.jsp";
		} catch (CMSException e) {
			request.setAttribute("errMsg", e.getMessage());
			view="errPage.jsp";
		}
		return view;
	}

	private String deleteProduct(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int icode = Integer.parseInt(request.getParameter("id"));
		String view="";
		
		try {
			adminservice.deleteById(icode);
			request.setAttribute("msg", "Item Got Deleted!");
			view="index.jsp";
		} catch (CMSException e) {
			request.setAttribute("errMsg", e.getMessage());
			view="errPage.jsp";
		}
		return view;
	}

	private String showEditProductForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		
		String view="";
						
		try {
			ProductMaster item = adminservice.getItemById(id);
			request.setAttribute("icode", item);
			view="editproduct.jsp";
		} catch (CMSException e) {
			request.setAttribute("errMsg", e.getMessage());
			view="errPage.jsp";
		}
		return view;
	}

	private String doSaveItem(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProductMaster item = new ProductMaster();
		item.setId(Integer.parseInt(request.getParameter("id")));
		item.setProductDescription(request.getParameter("ProductDescription"));
		item.setProductName(request.getParameter("ProductName"));		
		item.setCost(Double.parseDouble(request.getParameter("cost")));
		
				
		String view="";
		
		try {
			adminservice.validateAndSave(item);
			request.setAttribute("msg", "Item Got Saved!");
			view="index.jsp";
		} catch (CMSException e) {
			request.setAttribute("errMsg", e.getMessage());
			view="errPage.jsp";
		}
		return view;
	}
}