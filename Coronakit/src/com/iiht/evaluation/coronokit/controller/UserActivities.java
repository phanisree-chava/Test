package com.iiht.evaluation.coronokit.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iiht.evaluation.corona.Exception.CMSException;

import com.iiht.evaluation.coronokit.dao.ProductMasterDao;
import com.iiht.evaluation.coronokit.dao.VisitorDaoImpl;
import com.iiht.evaluation.coronokit.dao.visitiorDao;
import com.iiht.evaluation.coronokit.model.KitDetail;
import com.iiht.evaluation.coronokit.model.ProductMaster;
import com.iiht.evaluation.coronokit.model.VisitorKit;
import com.iiht.evalution.coronakit.service.Userservice;
import com.iiht.evalution.coronakit.service.UserserviceImpl;

/**
 * Servlet implementation class UserActivities
 */
@WebServlet({"/newuser", "/insertuser", "/showproducts","/addnewitem","/deleteitem","/showkit","/placeorder","/saveroder","/ordersummary"})


public class UserActivities extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Userservice userservice;
	private visitiorDao vdao;
	@Override
	public void init() throws ServletException {
		userservice = new UserserviceImpl();
		vdao = new VisitorDaoImpl();
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String url = request.getServletPath();
		String viewName="";
		
		switch(url) {
		
			case "/newuser":
				viewName = showNewUserForm(request, response);
				break;
			case "/insertuser":
				viewName = insertNewUser(request, response);
				break;
			case "/showproducts":
				viewName = showAllProducts(request, response);
				break;	
			case "/addnewitem":
				viewName = addNewItemToKit(request, response);
				break;
			case "/deleteitem":
				viewName = deleteItemFromKit(request, response);
				break;
			case "/showkit":
				viewName = showKitDetails(request, response);
				break;
			case "/placeorder":
				viewName = showPlaceOrderForm(request, response);
				break;
			case "/saveorder":
				viewName = saveOrderForDelivery(request, response);
				break;	
			case "/ordersummary":
				viewName = showOrderSummary(request, response);
				break;	
			default : viewName = "notfound.jsp"; break;	
			}
		
			request.getRequestDispatcher(viewName).forward(request, response);
		}
	
	

	private String showOrderSummary(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return "";
	}

	private String saveOrderForDelivery(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return "";
	}

	private String showPlaceOrderForm(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return "";
	}

	private String showKitDetails(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException, NamingException {
			
			String view="";
			
			
			try {
				List<KitDetail> items = vdao.ShowAll();
				request.setAttribute("items", items);
				view="showkit.jsp";
			} catch (CMSException e) {
				request.setAttribute("errMsg", e.getMessage());
				view="errPage.jsp";
			}
			
			return view;
		
	}

	private String deleteItemFromKit(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return "";
	}

	private String addNewItemToKit(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return "";
	}

	private String showAllProducts(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return "";
	}

	private String insertNewUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		VisitorKit item = new VisitorKit();
		request.setAttribute("item", item);
		
		return "newuser.jsp";
	}

	private String showNewUserForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
VisitorKit item = new VisitorKit();

		item.setId(Integer.parseInt(request.getParameter("id")));
		item.setPersonName(request.getParameter("ProductName"));
		item.setEmail(request.getParameter("email"));
		item.setContactNumber(request.getParameter("ContactNumber"));
		item.setTotalAmount(Double.parseDouble(request.getParameter("totalAmount")));
		item.setDeliveryAddress(request.getParameter("deliveryAddress"));
		item.setOrderDate(LocalDate.parse(request.getParameter("orderDate")));
		item.setOrderFinalized(Boolean.parseBoolean(request.getParameter("orderFinalized")));
		
		String view="";
		try {
				userservice.validateAndAdd(item);			
			request.setAttribute("msg", "Item Got Added!");
			view="index.jsp";
			}
		 catch (CMSException e) {
			request.setAttribute("errMsg", e.getMessage());
			view="errPage.jsp";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return view;
			}
	private String doSaveItem(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {	
	VisitorKit item = new VisitorKit();

	item.setId(Integer.parseInt(request.getParameter("id")));
	item.setPersonName(request.getParameter("ProductName"));
	item.setEmail(request.getParameter("email"));
	item.setContactNumber(request.getParameter("ContactNumber"));
	item.setTotalAmount(Double.parseDouble(request.getParameter("totalAmount")));
	item.setDeliveryAddress(request.getParameter("deliveryAddress"));
	item.setOrderDate(LocalDate.parse(request.getParameter("orderDate")));
	item.setOrderFinalized(Boolean.parseBoolean(request.getParameter("orderFinalized")));
		
		String view="";
		try {
			userservice.validateAndSave(item);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("msg", "Item Got Saved!");
view="newuser.jsp";
	return view;
}
	
}
