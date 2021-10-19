<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="EditSellerServlet" method="post">
	<label for="fName">Enter first name:</label>
	<input type="text" name="fName" value="${sellerToEdit.firstName}">
	</form>

</body>
</html>

	<form action = "editHouseServlet" method="post">
	Address: <input type="text" name="address" value="${houseToEdit.address}">
	Zipcode: <input type="text" name="zipcode" value="${houseToEdit.zipcode}">
	Selling Price: $<input type="text" name="sellingPrice" value="${houseToEdit.sellingPrice}">
	Market Date: <input type="text" name="marketDate" placeholder="YYYY-MM-DD" value="${houseToEdit.marketDate}">
	<input type="hidden" name="id" value="${houseToEdit.houseId}">
	<input type="submit" value="Save Edited Item">
	</form>