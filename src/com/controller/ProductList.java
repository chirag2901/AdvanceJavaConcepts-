package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductList
 */
public class ProductList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	
	@Override
//	public void init(ServletConfig config) throws ServletException {
//		ArrayList<String> list = new ArrayList<String>();
//		
//	}
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pName = request.getParameter("pName");
		System.out.println(pName);
//		ArrayList<String> list = null;
//		list.add(pName);
		
//		System.out.println("");
		response.sendRedirect("Products");
	}

}
