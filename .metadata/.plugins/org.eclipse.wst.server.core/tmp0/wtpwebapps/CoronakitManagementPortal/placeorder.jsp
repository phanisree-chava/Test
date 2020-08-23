<head>
<meta charset="ISO-8859-1">
<title>Corona Kit-All Products(user)</title>
</head>
<body>
<jsp:include page="header.jsp"/>

	<form action="placeorder" id="usrform">
  Address: <input type="text" name="usradd">
  <input type="submit">
</form>

<textarea name="comment" form="usrform">Enter text here...</textarea>
	<a href="showproductstoadd?icode=${item.id }">DELETE</a> <span>|</span>					
					
</body>
</html>

