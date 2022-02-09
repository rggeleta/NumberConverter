

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class getServletContext
 */
@WebServlet("/getServletContext")
public class getServletContext extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getServletContext() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		
		String userNumbers = request.getParameter("numbers");
		
		
		
		request.setAttribute("numberPouch", userNumbers);
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		PrintWriter writer = response.getWriter();
		
		writer.println(userNumbers.toString());
		writer.close();
		doGet(request, response);
	}

}
