


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Corona Kit-My Kit(user)</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<hr/>

<h3>Products</h3>
<p>All products Available for users to select</p>




<form action="showkit" id="carform">
  <hr/>
             <label>Select product:</label>
             <select id = "myList">
               <option value = "1">Face mask</option>
               <option value = "2">Sanitizers</option>
               <option value = "3">immunity boosters</option>
               <option value = "4">gloves</option>
                <option value = "5">medicines</option>
             </select>
	<label for="quantity">Choose a quantity</label>
<select id="quantity" name="q" form="showkit">
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
</select>

<button onClick="submit">Add</button>

	</form>
</body>
</html>