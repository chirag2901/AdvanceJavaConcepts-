package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Employee
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String employeeName = request.getParameter("txtEmployeeName");
		String employeeEmail = request.getParameter("txtEmployeeEmail");
		String employeePassword = request.getParameter("pwdEmployeePassword");
		System.out.println("In FirstServlet");
		request.setAttribute("eName", employeeName);
		request.setAttribute("eEmail", employeeEmail);
		request.setAttribute("ePassword", employeePassword);
		
		request.getRequestDispatcher("secondservlet").forward(request, response);;
	}

}
