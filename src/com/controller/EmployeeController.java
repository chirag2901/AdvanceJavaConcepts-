package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeController
 */
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter Name");
		String name = sc.next();
		System.out.println("ENter Age");
		int age = sc.nextInt();
		System.out.println("ENter gender");
		String gender = sc.next();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<h1>name ="+name+"</h1>");
		out.print("<h2>age ="+age+"</h2>");
		out.print("<font color = 'red size = '4'>gender ="+gender+"</font>");
		out.print("</body></html>");
		out.close();
	}

}
