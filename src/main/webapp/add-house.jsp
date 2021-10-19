<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addHouseServlet" method="post">
		Address: <input type="text" name="address"> Zipcode: <input
			type="text" name="zipcode"> Selling Price: $<input
			type="text" name="sellingPrice"> Market Date: <input
			type="text" name="marketDate" placeholder="YYYY-MM-DD"> <input
			type="submit" value="Add House">
	</form>
	<a href="index.html">Go back home instead</a>
</body>
</html>