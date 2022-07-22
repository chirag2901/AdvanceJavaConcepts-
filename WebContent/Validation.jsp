<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table {
	text-align: center;
	background: white;
	margin-left: 30%;
	margin-right: 30%;
	margin-top: 150px;
	margin-bottom: 150px;
}</style>
</head>
<body>
<form action="validation">
<table border="14px">
<h1>Registration...</h1>
	<tr>
	<td>Enter UserName: </td>
	<td><input type="text" name = "txtUserName">${uNameError }</td>
	</tr>
	
	<tr>
	<td>Enter UserEmail: </td>
	<td><input type="text" name = "txtUserEmail">${uEmailError }</td>
	</tr>
	
	<tr>
	<td>Enter UserPassword: </td>
	<td><input type="pwd" name = "pwdUserPassword">${uPasswordError }</td>
	</tr>
	
	<tr>
	<td>Enter UserAge: </td>
	<td><input type="text" name = "txtUserAge">${uAgeError }</td>
	</tr>
	
	<tr>
	<td>Enter UserContact: </td>
	<td><input type="text" name = "txtUserContact">${uContactError }</td>
	</tr>
	<tr>
	<td><input type="submit" value="Submit"></td>
	</tr>
</table>
</form>
</body>
</html>