package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Browserprint
 */
public class Browserprint extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	int cnt = 0;
	ArrayList<String> list = new ArrayList<String>();
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		if(cnt<10) {
			
			list.add(name);
			
			System.out.println(name);
			
			cnt++;
			response.sendRedirect("browser.html");
			
		}
//		list.add(name);
		for(String s :list) {
			out.print("<h>"+s+"</h><br>");
		}
		
		
	}

}
