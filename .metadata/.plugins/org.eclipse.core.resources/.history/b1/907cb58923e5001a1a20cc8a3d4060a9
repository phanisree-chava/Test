<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Corona Kit-Home</title>
</head>
<body>
<div>
<jsp:include page="header.jsp"/>
<hr/>
	<h2>Admin Login</h2>
	<form action="admin?action=login" method="post">
		<div>
			<div><label for="loginid">Enter login Id</label> </div>
			<div><input type="text" id="loginid" name="loginid"> </div>
		</div>
		<div>
			<div><label for="password">Enter password</label> </div>
			<div><input type="text" id="password" name="password"> </div>
		</div>
		<div>
			<div><input type="submit" value="Login"> </div>
		</div>
	</form>
</div>
<hr/>
<div>
	<a href="user?action=newuser"><button>NewUser</button></a>
</div>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
    
<html>
	<head>
		<title>IMS - Home</title>
	</head>
	<body>
		<jsp:include page="header.jsp" />
		
		<c:if test="${msg != null}">
			<p><strong>${msg }</strong>
		</c:if>
	</body>
</html>


<hr/>	
	<jsp:include page="footer.jsp"/>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<html>
<head>
<meta charset="utf-8">
<title>Bookshop Website</title>
</head>
<body>
    <div style="text-align: center">
        <h1>Admin Login</h1>
        <form action="login" method="post">
            <label for="email">Email:</label>
            <input name="email" size="30" />
            <br><br>
            <label for="password">Password:</label>
            <input type="password" name="password" size="30" />
            <br>${message}
            <br><br>           
            <button type="submit">Login</button>
        </form>
    </div>
</body>
</html>