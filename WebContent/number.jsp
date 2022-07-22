<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!int i ,j,rows=5,cnt =1;%>
<%for(i=1;i<=rows;i++) {
	

		%>
	
	<%
		for(j=1;j<=i;j++){%>
		
<%if(i==1){
	
	%>
		
		<font color = 'red' ><%out.println(cnt);%></font>
		<%cnt++;}//if%>
		<%if(i==2){%>	
			<font color = 'green' ><%out.println(cnt);%></font>
		<%cnt++;}%>
		<%if(i==3){%>	
			<font color = 'blue' ><%out.println(cnt);%></font>
		<%cnt++;}%>
		<%if(i==4){%>	
			<font color = 'red' ><%out.println(cnt);%></font>
		<%cnt++;}%>
		<%if(i==5){%>	
			<font color = 'green' ><%out.println(cnt);%></font>
		<%cnt++;}%>
			
	<%}%>
		<br>
<%}%>
		
</body>
</html>