package srv;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/utente/nuovo")
public class UtenteNuovo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nome = request.getParameter("nome");
		request.setAttribute("nome", nome);
		String password = request.getParameter("password");
		request.setAttribute("password", password);
		String latitudine = request.getParameter("latitudine");
		request.setAttribute("latitudine", latitudine);
		String longitudine = request.getParameter("longitudine");
		request.setAttribute("longitudine", longitudine);
		String materiale = request.getParameter("materiale");
		request.setAttribute("materiale", materiale);
		
		request.getRequestDispatcher("nuovo.jsp").forward(request, response);
	}

}
