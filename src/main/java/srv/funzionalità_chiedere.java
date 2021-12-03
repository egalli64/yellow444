package srv;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/funzionalità_chiedere")
public class funzionalità_chiedere extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	
		String materiale = request.getParameter("materiale");
		request.setAttribute("materiale", materiale);
		
		
		request.getRequestDispatcher("/funzionalità/chiedere").forward(request, response);
	}

}
