package srv;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/azienda/funzionalità_chiedere")
public class FunzionalitàChiedere extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	
		String materiale = request.getParameter("materiale");
		request.setAttribute("materiale", materiale);
		
		
		request.getRequestDispatcher("/funzionalità/chiedere.jsp").forward(request, response);
	}

}
