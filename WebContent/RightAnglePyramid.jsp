<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!int i ,j,rows=5; %>
<%for(i=1;i<=rows;i++) {
	%>
	
	<%
	for(j=1;j<=i;j++){
	if(j==1){
	%>
		
		<font color = 'red' ><%=j%></font>
		<%}//if%>
		<%if(j==2){%>	
			<font color = 'green' ><%=j%></font>
		<%}%>
		<%if(j==3){%>	
			<font color = 'blue' ><%=j%></font>
		<%}%>
		<%if(j==4){%>	
			<font color = 'red' ><%=j%></font>
		<%}%>
		<%if(j==5){%>	
			<font color = 'green' ><%=j%></font>
		<%}%>
		
		
		
	<%}//j loop%>
	<br>
		<%
}//..i for loop
%>
</body>
</html>