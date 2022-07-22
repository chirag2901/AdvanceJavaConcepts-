<%@page import="java.util.List"%>
<%@page import="com.bean.BookBean"%>
<%@page import="java.awt.print.Book"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2px" bordercolor = "BLUE">
<tr>
<th>BOOK NAME</th>
<th>BOOK PRICE</th>
<th>BOOK QTY</th>
<th>ACTION</th>
</tr>
<%List<BookBean> booklist = (List<BookBean>)request.getAttribute("booklist");
for(int i=0;i<booklist.size();i++){
	BookBean bookBean = booklist.get(i);
%>
	<tr>
	<td><%=bookBean.getbName() %></td>
	
	<td><%=bookBean.getbPrice() %></td>
	
	<td><%=bookBean.getbQty()%></td>
	
	<td><a href="bookdeletecontroller?bookname=<%=bookBean.getbName()%>&bookqty=<%=bookBean.getbQty()%>">DELETE</a></td>
	</tr>
<%} %>
</table>
</body>
</html>