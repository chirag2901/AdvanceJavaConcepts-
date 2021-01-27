package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Task extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ArrayList<String> list;
	public void init() {
		list=new ArrayList<String>();
		list.add("yellow");
		list.add("red");
		list.add("green");
		
	}
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("Login Failed");
		for(String s : list) {
			if(s.equals(name)) {
				request.getRequestDispatcher("task2").forward(request, response);
			}
			else {
				out.print("login Fail");
				request.getRequestDispatcher("task12.html").include(request, response);
			}
			out.print("</body></html>");
			out.close();
		}
	}

}   
