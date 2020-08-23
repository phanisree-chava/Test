<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Item Form</title>
</head>
<body>

	
	<jsp:include page="header.jsp" />
	
	<h3>${item.id==null?"New Item":"Edit Item" }</h3>
	
		
	<form action='${item.id==null?"newuser":"insertuser" }' method="POST">
		<div>
			<label>Id: </label>
			<input type="number" value="${item.id }" name="id" required 
			 ${item.id==null?"":"readonly" } />
		</div>
		
		<div>
			<label>ProductName: </label>
			<input type="text" value="${item.personName }" name="ProductName" minlength="3" maxlength="20" required />
		</div>
		
		<div>
			<label>Email: </label>
			<input type="text" value="${item.email}" name="email" minlength="3" maxlength="20" required />
		</div>
		<div>
			<label>Contact number: </label>
			<input type="text" value="${item.contactNumber}" name="ContactNumber"  maxlength="10" required />
		</div>
		
	<div>
			<label>Total Amount: </label>
			<input type="decimal" value="${item.totalAmount }" name="totalAmount" required />
		</div>
				<div>
			<label>Address: </label>
			<input type="text" value="${item.deliveryAddress}" name="deliveryAddress"  maxlength="20" required />
		</div>
		<div>
			<label>Order Date: </label>
			<input type="date" value="${item.orderDate }" name="orderDate" required />
		</div>
		<div>
			<label>Fragile: 
				<input type="checkbox" value="${item.orderFinalized }" name="orderFinalized" />
			</label>
			</div>
				
		<button>SAVE</button>	
		 	
	</form>
</body>
</html>

