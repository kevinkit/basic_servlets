
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

	int c = 0;
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
		response.setContentType("text/plain");
		
		ServletContext context = this.getServletContext();
		
		PrintWriter out = response.getWriter();
		synchronized(this){
			Counter counter = (Counter) context.getAttribute("Servlet.count");
			if(counter == null)
			{
				counter = new Counter();
				context.setAttribute("Servlet.count", counter);
				
			}
			c = counter.count++;
			out.println("Access to servelt since loading "+ c +" times.");
			
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
