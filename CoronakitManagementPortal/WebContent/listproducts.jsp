 
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
	
	<form action="listproducts">
		<table>
				<tr>
					<th>Id</th>
					<th>productDescription</th>
					<th>productName</th>
						<th>Cost</th>
					
				</tr>
				<c:forEach items="${items}" var="item">
					<tr>
					<td>${item.id}</td>
					<td>${item.ProductDescription}</td>
					<td>${item.ProductName}</td>
					<td>${item.Cost}</td>
						</tr>	
							
				</c:forEach>
			</table>
			</form>
</body>
</html>