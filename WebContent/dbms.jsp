<%@page import="java.sql.DriverManager"%>
<%@page import = "java.sql.Connection" %>
<%@page import = "java.sql.SQLException" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String username = "root123" ;
String password = "root";
String connectionURL = "jdbc:mysql://localhost:3306/mydata";
String driverClass = "com.mysql.jdbc.Driver";

Connection conn = null;
try {
	Class.forName(driverClass); // loaded..
	// getting connection...

	//conn = DriverManager.getConnection(connectionURL, username, password); //
	conn = DriverManager.getConnection(connectionURL, username, password);
	// conn --
	if (conn != null) {

		out.println("Connected with database...mysql");
	} else {

		out.println("not connected with database..");
	}

} catch (Exception e){
	// TODO Auto-generated catch block
	e.printStackTrace();
}


%>
</body>
</html>