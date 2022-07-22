package com.controller;

import java.awt.List;
import java.awt.print.Book;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.BookBean;

/**
 * Servlet implementation class BookController
 */
public class BookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	static ArrayList<BookBean> booklist = new ArrayList<BookBean>();
	public static ArrayList<BookBean> getList(){
		return booklist;
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String bName = request.getParameter("txtBookName");
		String price = request.getParameter("txtBookPrice");
		String qty = request.getParameter("txtBookQty");
		int bPrice = 0;
				if(!price.equals("") && price != null) {
					bPrice = Integer.parseInt(price);
				}
				int bQty =0;
				if(!qty.equals("") && qty != null ) {
					bQty = Integer.parseInt(qty);
				}
				BookBean bookbean = new BookBean();
				bookbean.setbName(bName);
				bookbean.setbPrice(bPrice);
				bookbean.setbQty(bQty);
				booklist.add(bookbean);
				request.setAttribute("booklist", booklist);
				request.getRequestDispatcher("BookList.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
