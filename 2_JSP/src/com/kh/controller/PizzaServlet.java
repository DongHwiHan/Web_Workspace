package com.kh.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PizzaServlet
 */
@WebServlet("/pizza")
public class PizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public PizzaServlet() {
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String pizza = request.getParameter("pizza");
		//int price1 = Integer.parseInt(request.getParameter("price"));

		String[] foods = request.getParameterValues("food");
		String[] foods1 = request.getParameterValues("food1");

		request.setAttribute("pizza", pizza);
		request.setAttribute("foods", foods);
		request.setAttribute("foods1", foods1);
		

		int price = 0;

		switch (pizza) {
		case "콤비네이션피자":
			price += 5000;
			break;
		case "치즈피자":
			price += 6000;
			break;
		case "포테이토피자":
		case "고구마피자":
			price += 7000;
			break;
		case "불고기피자":
			price += 8000;
			break;
		}

		if (foods != null) {
			for (String food : foods) {

				switch (food) {
				case "고구마무스":
					price += 1000;
					break;
				case "콘크림무스":
					price += 1500;
					break;
				case "파인애플토핑":
				case "치즈토핑":
				case "치즈바이트":
					price += 2000;
					break;
				case "치즈크러스트":
					price += 3000;
					break;
				}
			}
		}

		if (foods1 != null) {
			for (String food1 : foods1) {
				price += 5000;

			}
		}
		request.setAttribute("price", price);
		request.getRequestDispatcher("/views/pizzaorder.jsp").forward(request, response);
	}

}
