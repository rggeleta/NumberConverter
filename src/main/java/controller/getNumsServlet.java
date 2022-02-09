package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.NumberConverter;

/**
 * Servlet implementation class getNumsServlet
 */
@WebServlet("/getNumsServlet")
public class getNumsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public getNumsServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		String num3 = request.getParameter("num3");
		
		//String numbers = request.getParameter("numbers");
		//NumberConverter userNumbers = new NumberConverter(Integer.parseInt(numbers));
		
		
		//NumberConverter avge = new NumberConverter(Integer.parseInt(avg));

		NumberConverter converter1 = new NumberConverter(Integer.parseInt(num1));
		NumberConverter converter2 = new NumberConverter(Integer.parseInt(num2));
		NumberConverter converter3 = new NumberConverter(Integer.parseInt(num3));

		PrintWriter writer = response.getWriter();
		

		writer.println("The first number you entered: " +  num1);
		writer.println("The second number you entered: "  + num2);
		writer.println("The third number you entered: "  + num3);
		//writer.println("The third number you entered: "  + userNumbers.numsToAverage(55,40,20, 0, 0));

		

		writer.close();

	}

}
