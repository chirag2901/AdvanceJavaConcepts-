package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.BookBean;

/**
 * Servlet implementation class BookDeleteController
 */
public class BookDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	static ArrayList<BookBean> booklist = new ArrayList<BookBean>();
	BookBean bb;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		booklist = BookController.getList();
//		for(int i =0;i<booklist.size();i++) {
//			BookBean bean = booklist.get(i);
//			System.out.println(bean.getbName());
//		}
		String bookName = request.getParameter("bookname");
		String bQty = request.getParameter("bookqty");
		
		System.out.println("delete book "+bookName);
		int bookqty = Integer.parseInt(bQty);
		System.out.println(bookqty);
		bb = new BookBean();
		for(int i =0;i<booklist.size();i++) {
			bb=booklist.get(i);
			if(bookName.equals(bb.getbName())){
				booklist.remove(i);
				//response.sendRedirect("BookList.jsp");
				System.out.println("delete book "+bookName);
				break;
			}
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
