package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentController
 */
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("sName");
		String email = request.getParameter("sEmail");
//		String pass = request.getParameter("sPass");
		String age = request.getParameter("sAge");
		int sAge = 0;
		if(age!=null && !age.equals("")) {
			sAge = Integer.parseInt(age);
		}
//		int age = Integer.parseInt(request.getParameter("sAge"));
		String gender = request.getParameter("gender");
		String[] hobbies =request.getParameterValues("Hobbies");
		System.out.println(name);
		System.out.println(email);
		System.out.println(age);
		System.out.println(gender);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		System.out.println();
		out.println("<hr> Name="+name+"</hr><br>");
		out.println("<hr1> Email="+email+"</hr1><br>");
		out.println("<hr2> Age="+age+"</hr2><br>");
		out.print("<font color = red size = '4'>gender ="+gender+"</font><br>");
		for(String s:hobbies) {
			out.print("<h2>"+s+"</h2><br>");
		}
		out.println("</body></html>");
		out.close();
	}

}
