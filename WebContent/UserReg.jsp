<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
/* td {
	text-align: center;
}

table {
	text-align: center;
	background: blue;
	margin-left: 30%;
	margin-right: 30%;
	margin-top: 150px;
	margin-bottom: 150px;
} */

</style>
</head>
<body>
	<form action="userreg">
		<table border="2px">
			<%-- <tr>
				<%
					String error = (String) request.getAttribute("userName");
				if (error == null || error.equals("")) {
					out.print("");
				} else {
					out.print(error);
				}
				%>--%>
				<td>User name :</td>
				<td><input type="text" name="txtUserName"> ${uNameError }</td>
			</tr>
 
			<tr>
				<td>User Email :</td>
				<td><input type="text" name="txtUserEmail"> ${uEmaiError } </td>

			</tr>

			<tr>
				<td>User password :</td>
				<td><input type="password" name="pwdUserPassword"> ${ uPasswordError}</td>
			</tr>

			<tr>
				<td>User Age :</td>
				<td><input type="text" name="txtUserAge"> ${uAgeError }</td>

			</tr>
			<tr>
				<td>User contact No :</td>
				<td><input type="text" name="txtUserContactNo"> ${uContactNoError  }</td>

			</tr>

			<tr>
				<td colspan="3"><input type="submit" value="SUBMIT">
			</tr>

		</table>

	</form>

</body>
</html>