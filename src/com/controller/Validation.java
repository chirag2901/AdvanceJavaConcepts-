package com.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.MyMethods;

/**
 * Servlet implementation class Validation
 */
public class Validation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	String userName = request.getParameter("txtUserName");
	String userEmail = request.getParameter("txtUserEmail");
	String userPassword = request.getParameter("pwdUserPassword");
	String userAge = request.getParameter("txtUserAge");
	int age;
//	if(!userAge.equals("")) {
//		age = Integer.parseInt(userAge);
//	}
	String userContact = request.getParameter("txtUserContact");
//	System.out.println(userName);
//	System.out.println(userEmail);
	boolean nameFlag;
	boolean emailFlag;
	boolean contactFlag;
	boolean ageFlag = false ;
	boolean pwdFlag;
	if(MyMethods.isEmpty(userName)) {
		 nameFlag = false;
		request.setAttribute("uNameError", "UserName required");
	}
	else {
		nameFlag = true;
		request.setAttribute("uName", userName);
	}
	if(MyMethods.isEmpty(userEmail) ) {//|| !MyMethods.isvalidEmail(userEmail)
		emailFlag = false;
		request.setAttribute("uEmailError", "UserEmail required and in valid form");
	}
	else {
		emailFlag = true;
		request.setAttribute("uEmail", userEmail);
	}
	if(MyMethods.isEmpty(userContact) ) {//|| !MyMethods.isvalidContact(userContact)
		contactFlag = false;
		request.setAttribute("uContactError", "UserContact required and in valid form also");
	}
	else {
		contactFlag = true;
		request.setAttribute("uContact", userContact);
	}
	if(MyMethods.isEmpty(userAge) ) {
		ageFlag = false;
		request.setAttribute("uAgeError", "UserAge required");
	}
	else {
		age=Integer.parseInt(userAge);
		if(MyMethods.isvalidAge(age)) {
			ageFlag = true;
			request.setAttribute("uAge", age);
		}
		else {
			request.setAttribute("uAgeError", "UserAge must be valid!");
		}
	}
	if(MyMethods.isEmpty(userPassword) ) {//|| !MyMethods.isCorrectPassword(userPassword)
		pwdFlag = false;
		request.setAttribute("uPasswordError", "UserPassword required and in valid form also!");
	}
	else {
		pwdFlag = true;
		request.setAttribute("uPassword", userPassword);
	}

	if(nameFlag == true && emailFlag == true && contactFlag == true && ageFlag == true && pwdFlag == true ) {
		request.getRequestDispatcher("Success.jsp").forward(request, response);
	}
	else {
		request.getRequestDispatcher("Validation.jsp").forward(request, response);
	}
}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
