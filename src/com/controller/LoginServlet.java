package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = "chirag";
		String username = request.getParameter("txtUserName");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print(username);
		if(username.equals(name)) {
			request.getRequestDispatcher("success").include(request, response);
		}
	}

}
