<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!int i ,j,rows=5,cnt =0;%>
<%for(i=1;i<=rows;i++) {
		%>
	
	<%
		for(j=1;j<=i;j++){%>
		
	
			 <%cnt ++;
		 	if(cnt ==1 || cnt == 4 || cnt == 7 || cnt == 10 || cnt ==13){
				 %>
				 <font color = "red" ><%out.println("*");%></font>
			 <% }//if%>
			<%  if(cnt ==2 || cnt == 5|| cnt == 8 || cnt == 11 || cnt ==14){
				%>
			 <font color = "blue" ><%out.println("*");%></font>
		 <% }//if%>
		 <%if(cnt ==3 || cnt == 6 || cnt == 9 || cnt == 12|| cnt ==15){
			 %>
			 <font color = "green" ><%out.println("*");%></font>
		 <% }//if%>
		 
		
	<%}%>
	<br>
<%}%>
</body>
</html>