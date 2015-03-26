
import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class Context
 */
@WebServlet("/Context")
public class Context extends HttpServlet {
	private static final long serialVersionUID = 1L;

	int count = 0;
    /**
     * Default constructor. 
     */
    public Context() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ServletContext context = this.getServletContext();
		
		
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		synchronized(this){
			count++;
			out.println("Access to servelt since loading "+ count +" times.");
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

/*

*/
