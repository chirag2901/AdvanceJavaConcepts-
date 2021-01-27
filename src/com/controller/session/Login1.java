package com.controller.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login1
 */
public class Login1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	boolean b = false;
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Map<String, String> map = new TreeMap<String, String>();
		map.put("vijay", "vijay123");
		map.put("chirag", "chirag123");
		map.put("rohan", "rohan123");
		
//		String user1 = "chirag";
//		String user2 = "rohan";
//		String user3 = "devansh";
//		String pass1  = "chirag@123";
//		String pass2  = "rohan@123";
//		String pass3  = "devansh@123";
//		String username =(String) session.getAttribute("username");
//		String password = (String) session.getAttribute("password");
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
//		System.out.println("username"+username);
//		System.out.println("password"+password);
//		System.out.println("user"+user);
//		System.out.println("pass"+pass);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
	/*	if(user.equals("chirag") && pass.equals("chirag@123")){
			
			out.println("LoginSuccessful");
			out.println("chirag is logged in ");
//			request.getRequestDispatcher("invalidate.html").include(request, response);
			out.println("Session will be expired in 10 seconds");
			session.setMaxInactiveInterval(10);
//			session.invalidate();
		}
		else if(user.equals(user2) && pass.equals(pass2)){
			
			out.println("LoginSuccessful<br>");
			out.println("rohan is logged in <br>");
//			request.getRequestDispatcher("invalidate.html").include(request, response);
			out.println("Session will be expired in 10 seconds<br>");
			session.setMaxInactiveInterval(10);
//			session.invalidate();
		}
		else if(user.equals(user3) && pass.equals(pass3)){
			
			out.println("LoginSuccessful\n"+"<br>");
			out.println("<h>devansh is logged in </h><br>");
//			request.getRequestDispatcher("invalidate.html").include(request, response);
			out.println("Session will be expired in 10 seconds<br>");
//			session.setMaxInactiveInterval(10);
			session.invalidate();
		}
		*/
		for(Map.Entry m : map.entrySet())
		{
			if(user.equals(m.getKey())&& pass.equals(m.getValue())) {
				this.b =true;
			}
		}
		if(b) {
			out.println("LoginSuccessful\n"+"<br>");
			out.print(user+" is logged in...");
			System.out.println(user+"is logged in..");
			System.out.println(session.getId());
			session.setMaxInactiveInterval(10);
			session.invalidate();
			b = false;
		}
		else {
			out.print("<font color = 'red' size = '4' >INVALID CREDENTIALS</font><br><br>");
			out.print("LOGIN FAILED-TRY AGAIN");
			System.out.println("login Failed");
			request.getRequestDispatcher("login1.html").include(request, response);
				}
		out.print("</body></html>");
		out.close();
	}

}
