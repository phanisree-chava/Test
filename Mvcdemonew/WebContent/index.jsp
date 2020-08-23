<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.time.LocalDateTime" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<h1>this is to test </h1>
<h1><%=LocalDateTime.now() %></h1>
<nav>
		
	<jsp:include page="header.jsp"/>
	</nav>
</body>
</html>
</body>
</html>