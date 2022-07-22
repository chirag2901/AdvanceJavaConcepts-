package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserRegistrationController
 */
public class UserRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	boolean  b = false;
	int cnt=0;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String userName = request.getParameter("txtUserName");
		String userEmail = request.getParameter("txtUserEmail");
		String userPassword = request.getParameter("pwdUserPassword");
		String age = request.getParameter("txtUserAge");
		int userAge = 0;
		if(!age.equals("")) {
			userAge = Integer.parseInt(age);
		}
		String contact = request.getParameter("txtUserContact");
		if(!userName.trim().equals("")) {
			//true
			b = true;
//			cnt++;
			request.setAttribute("uname", userName);
//			request.getRequestDispatcher("Success.jsp").forward(request, response);
		}
		else {
			
			b = false;
			request.setAttribute("uname", "userName is required");
			//request.getRequestDispatcher("UserRegistration.jsp").forward(request, response);
		}
		if(!userEmail.trim().equals("")) {
			//true
			b = true;
//			cnt++;
			request.setAttribute("uemail", userEmail);
//			request.getRequestDispatcher("Success.jsp").forward(request, response);;
		}
		else {
			//false
			b = false;
			request.setAttribute("uemail", "useremail is required");
//			request.getRequestDispatcher("UserRegistration.jsp").forward(request, response);
		}
		if(b==true) {
			request.getRequestDispatcher("Success.jsp").forward(request, response);
		}
		else {
			request.getRequestDispatcher("UserRegistration.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
