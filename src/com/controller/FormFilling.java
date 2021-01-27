package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormFilling
 */
public class FormFilling extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pName = request.getParameter("pName");
		int pPrice = Integer.parseInt(request.getParameter("pPrice"));
		int pQty = Integer.parseInt(request.getParameter("pQty"));
		String proper[] = request.getParameterValues("proper"); 
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<h1> Product Name = " + pName + "</h1>");
		out.print("<h1> Product Price = " + pPrice+ "</h1>");
		out.print("<h1> Product Qty = " + pQty+ "</h1>");
		for(String s : proper) {
			
			out.print("<h1> Properties: " + s +"</h1>");
		}
		int total = pPrice * pQty;
		out.print("<h1> Total = " + total+ "</h1>");
		out.print("</body></html>");
		out.close();
	}

}
