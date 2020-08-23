<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Corona Kit-Add New Product(Admin)</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<hr/>


	
	<form action='${item.id==null?"insertproduct":"saveItem" }' method="POST">
		<div>
			<label>Id: </label>
			<input type="number" value="${item.id }" name="id" required />
		</div>
		
		<div>
			<label>ProductDescription: </label>
			<input type="text" value="${item.productDescription }" name="ProductDescription"  maxlength="20" required />
		</div>
			<div>
			<label>ProductName: </label>
			<input type="text" value="${item.productName }" name="ProductName"  maxlength="20" required />
		</div>
			<div>
			<label>Cost Price: </label>
			<input type="number" value="${item.cost }" name="cost" required />
		</div>
		<button>SAVE</button>		
	</form>
	

</body>
</html>

