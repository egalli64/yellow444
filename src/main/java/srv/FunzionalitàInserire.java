package srv;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/azienda/funzionalità_inserire")
public class FunzionalitàInserire extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		request.setAttribute("nome", nome);
		String materiale = request.getParameter("materiale");
		request.setAttribute("materiale", materiale);
		String quantità = request.getParameter("quantità");
		request.setAttribute("quantità", quantità);
		
		request.getRequestDispatcher("/funzionalità/inserire.jsp").forward(request, response);
	}
	
}
