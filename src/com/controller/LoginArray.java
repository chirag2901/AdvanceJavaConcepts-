package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginArray
 */
public class LoginArray extends HttpServlet {
	private static final long serialVersionUID = 1L;

	List<String> list = Arrays.asList("Chirag","Himang","Ajayraj");
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("txtUserName");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		if(list.contains(username)) {
			request.setAttribute("username",username);
			request.getRequestDispatcher("lf").forward(request, response);
		}
		else {
			out.print("Login Failed");
			request.getRequestDispatcher("LoginArray.html").include(request, response);
		}
 	}

}
