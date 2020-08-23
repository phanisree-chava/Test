 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Corona Kit-All Products(user)</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<hr/>
             <label>Select product:</label>
             <select id = "myList">
               <option value = "1">Face mask</option>
               <option value = "2">Sanitizers</option>
               <option value = "3">immunity boosters</option>
               <option value = "4">gloves</option>
                <option value = "5">medicines</option>
             </select>
		<button>SAVE</button>		
	<c:choose>
		<c:when test="${items==null || items.isEmpty() }">
			<p>No Items Found</p>
		</c:when>
		<c:otherwise>
			<table border="1" cellspacing="5px" cellpadding="5px">
				<tr>
					<th>Id</th>
					<th>personName</th>
					<th>email</th>
					<th>contactNumbere</th>
					<th>totalAmount</th>
					<th>deliveryAddress</th>
					<th>orderDate</th>
					<th>orderFinalized</th>
				</tr>
				
				<c:forEach items="${items }" var="item">
					<tr>
					<td>${item.id}</td>
					<td>${item.personName}</td>
					<td>${item.email}</td>
					<td>${item.contactNumber}</td>
					<td>${item.totalAmount}</td>
					<td>${item.deliveryAddress}</td>
					<td>${item.orderDate}</td>
					<td>${item.orderFinalized}</td>
					<td>
						<a href="deleteItem?icode=${item.id}">DELETE</a> <span>|</span>
						<a href="editItem?icode=${item.id}">EDIT</a> <span>|</span>
						<a href="addItem?icode=${item.id}">ADD</a> <span>|</span>
					</td>
				</tr>	
							
				</c:forEach>
				</table>
				</c:otherwise>
				</c:choose>
						
	</body>
</html>
	
