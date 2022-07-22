<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="userregistrationcontroller">
	<table border="2px">
		<tr>
		<%-- <%String error = (String)request.getAttribute("userName");
		if(error==null || error.equals("")  ){
			out.print("");
		}
		else{
			out.print(error);
		}
		%> --%>
			<td>Username : </td>
			<td><input type="text" name="txtUserName">${uname}
			</td>
		</tr>
		
		<tr>
			<td>Email : </td>
			<td><input type="email" name="txtUserEmail">${uemail}</td>
		</tr>
		<tr>
			<td>Password : </td>
			<td><input type="pwd" name="pwdUserPassword"></td>
		</tr>
		<tr>
			<td>Age : </td>
			<td><input type="text" name="txtUserAge"></td>
		</tr>
		<tr>
			<td>Contact : </td>
			<td><input type="text" name="txtUserContact"></td>
		</tr>
		
		<tr>
			
			<td><input type="submit" value="SUBMIT"></td>
		</tr>
	</table>
</form>
</body>
</html>