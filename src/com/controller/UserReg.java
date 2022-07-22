package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.util.Methods;

@WebServlet("/UserRegistration")
public class UserReg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());

		String uName = request.getParameter("txtUserName");
		String uEmail = request.getParameter("txtUserEmail");
//		System.out.println(uEmail);
		String uPassword = request.getParameter("pwdUserPassword");
		String age = request.getParameter("txtUserAge");
		String uContactNo = request.getParameter("txtUserContactNo");
		int uAge;
		boolean uNameFlag;
		boolean uEmailFlag;
		boolean uPasswordFlag;
		boolean uAgeFlag = false;
		boolean uContactNoFlag = false;
		
		if (Methods.isEmpty(uName)) {
			uNameFlag = false;
			request.setAttribute("uNameError", "User Name Must Required..!!");
//			request.getRequestDispatcher("UserRegistration.jsp").forward(request, response);
		} else {
			uNameFlag = true;
			request.setAttribute("uNameSuccess", uName);
		}
		
		if (Methods.isEmpty(uEmail) || !Methods.isValidEmail(uEmail)) {
			uEmailFlag = false;
			System.out.println("wrong email...!!!");
			request.setAttribute("uEmaiError", "User Email Must Required...!!! or Please Enter Valid Email Address..!!");
		} else {
			uEmailFlag = true;
			request.setAttribute("uEmailSuccess", uEmail);
		}
		if (Methods.isEmpty(uPassword) || !Methods.isCorrectPassword(uPassword)) {
			uPasswordFlag = false;
			request.setAttribute("uPasswordError", "Your Password is Empty !! or Please Enter Stronger Password!!");
		} else {
			uPasswordFlag = true;
			request.setAttribute("uPasswordSuccess", uPassword);
		}
		if (Methods.isEmpty(age)) {
			uAgeFlag=false;
			request.setAttribute("uAgeError","Age Must Required..!!");
		}
		else
		{
			uAge=Integer.parseInt(age);
			if(Methods.isvalidAge(uAge))
			{
				uAgeFlag=true;
				request.setAttribute("uAgeSuccess",uAge);
			}
			else
			{
				request.setAttribute("uAgeError","please Enter Valid Age..!!");
			}
		}
		if(Methods.isEmpty(uContactNo) || !Methods.isCorrectContactNo(uContactNo))
		{
			uContactNoFlag=false;
			request.setAttribute("uContactNoError","User Contact No Must Required !! or Please Insert Correct Contact No..!!");
		}
		else
		{
			uContactNoFlag=true;
			request.setAttribute("uContactNoSuccess",uContactNo);
		}
		
		if(uNameFlag==true && uEmailFlag==true && uPasswordFlag==true && uAgeFlag==true && uContactNoFlag==true)
		{
			System.out.println("Before success");
			
			request.getRequestDispatcher("Success.jsp").forward(request, response);
		
			System.out.println("After Success");
		}
		else
		{
			request.getRequestDispatcher("UserReg.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
