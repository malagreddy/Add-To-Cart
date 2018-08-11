package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bookService.bookService;
import com.bookService.bookServiceInterface;

/**
 * Servlet implementation class bookController
 */
@WebServlet("*.shop")
public class bookController extends HttpServlet {
	private bookServiceInterface service = new bookService();
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public bookController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String action = request.getServletPath();
		System.out.println(action);
		switch (action) {
		case "/addToCart.shop":
			int id = Integer.parseInt(request.getParameter("id"));
			service.addBook(id);
			session.setAttribute("cart", service.viewCart());
			session.setAttribute("totalCnt", service.getTotalQuantity());
			session.setAttribute("totalPrc", service.getTotalPrice());

			System.out.println(service.getTotalQuantity());
			response.sendRedirect("home.jsp");

			break;

		case "/viewCart.shop":

			// Collection<Cart> cart=service.viewCart();
			session = request.getSession();
			session.setAttribute("cart", service.viewCart());
			// System.out.println(service.viewCart());
			session.setAttribute("totalCnt", service.getTotalQuantity());
			session.setAttribute("totalPrc", service.getTotalPrice());
			System.out.println(service.getTotalQuantity());
			response.sendRedirect("cart.jsp");
			break;

		case "/viewAllBooks.shop":
			System.out.println("inside viewalBOOks----------------");
			session = request.getSession();
			session.setAttribute("book", service.viewAllBooks());
			// sSystem.out.println(service.viewAllBooks());
			session.setAttribute("totalCnt", service.getTotalQuantity());
			response.sendRedirect("home.jsp");
			break;

		case "/delete.shop":
			id = Integer.parseInt(request.getParameter("id"));
			service.delete(id);

			// response.sendRedirect("viewCart.shop");
			response.sendRedirect("viewCart.shop");

			break;

		default:
			System.out.println("Default one");

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
