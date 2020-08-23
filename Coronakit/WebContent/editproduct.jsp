<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Corona Kit-Edit Product(Admin)</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<hr/>

		<div>
			<label>id
			 </label>
			<input type="number" value="${item.icode }" name="icode" >
			
		
		<a href="editproduct?icode=${item.icode }">EDIT</a> <span>|</span>
	
</div>
<hr/>	
	<jsp:include page="footer.jsp"/>
	

</body>
</html>