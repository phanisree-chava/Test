<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
<%-- <%Double msg =(Double)request.getAttribute("msg"); %>
	<% if(msg!=null) {%>
		<h2><%=msg %></h2>
	<%} %> --%>
<c:choose>
<c:when test="${msg != null}">
<h2>${msg }</h2>
</c:when>
<c:otherwise>
<h2>Welcome</h2>
</c:otherwise>





</c:choose>

<form action="interestrate">
		
<h1>Rate of interest</h1>


<label>principle
<input type="number" name="princ" required />
</label> <br />

<label>annualrate
<input type="number" step=0.01 name="anr" required />
</label>

<label>no
<input type="number" name="emi" required />
</label>
<button>submit</button>
</form>
</body>
</html>