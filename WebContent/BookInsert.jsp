<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="bookcontroller">
<table border="14px">

	<tr>
	<td>Enter BookName: </td>
	<td><input type="text" name = "txtBookName"></td>
	</tr>
	
	<tr>
	<td>Enter BookPrice: </td>
	<td><input type="text" name = "txtBookPrice"></td>
	</tr>
	
	<tr>
	<td>Enter BookQty: </td>
	<td><input type="text" name = "txtBookQty"></td>
	</tr>
	
	<tr>
	<td><input type="submit" value="Submit"></td>
	</tr>
</table>
</form>
</body>
</html>