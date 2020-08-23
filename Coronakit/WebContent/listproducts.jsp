 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Items List</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<h3>Items</h3>
	
	
			<table border="1" cellspacing="5px" cellpadding="5px">
				<tr>
					<th>Id</th>
					<th>productDescription</td>
					<th>productName</th>
						<th>Cost</th>
					
				</tr>
				<c:forEach items="${items }" var="item">
					<tr>
					<td>${item.id }</td>
					<td>${item.ProductDescription }</td>
					<td>${item.ProductName }</td>
					<td>${item.Cost }</td>
										<td>
										</td>
				</tr>				
				</c:forEach>
			<a href="deleteItem?id=${item.id }">DELETE</a> <span>|</span>
						<a href="editItem?icode=${item.id }">EDIT</a> <span>|</span>
</body>
</html>