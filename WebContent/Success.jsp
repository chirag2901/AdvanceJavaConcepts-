<%@page import="com.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><h1>User Details</h1>
<hr>
	<%-- userName:<%=request.getAttribute("uname") %>
	userEmail:<%=request.getAttribute("uemail") %> --%>
	<%-- <%UserBean userbean = (UserBean)request.getAttribute("userbean"); 
	%>
	<%=userbean.getuId() %>
<%=userbean.getuName() %> --%>	
	<%-- ${userbean.uName }
	${userbean.uId } --%>
	<%-- UserName: ${uname }
	UserEmail: ${uemail} --%>
	<%-- UserPassword:${upassword} --%>
	uNameSuccess:${uname }<br>
	uEmailSuccess:${uemail}<br>
	uPasswordSuccess:${upassword }<br>
	uContactNoSuccess:${ucontact }<br>
	uAgeSuccess:${uage }
</body>
</html>