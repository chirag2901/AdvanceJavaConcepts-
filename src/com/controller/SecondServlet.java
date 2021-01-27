package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ScondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empName = (String) request.getAttribute("eName");
		String eEmail = (String) request.getAttribute("eEmail");
		String ePassword = (String) request.getAttribute("ePassword");
		System.out.println("In SecondServlet");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body><title>SECONDSERVLET</title>");
		out.print("<h1>" +empName+ "</h1>");
		out.print("<h2>" +eEmail+ "</h2>");
		out.print("<h3>" +ePassword+ "</h3>");
		out.print("</html></body>");
		out.close();
	}

}
