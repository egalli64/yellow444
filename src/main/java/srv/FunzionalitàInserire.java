package srv;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import dao.Materiale;

@WebServlet("/azienda/funzionalitàInserire")
public class FunzionalitàInserire extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
	
		String materiale = request.getParameter("materiale");
		request.setAttribute("materiale", materiale);
		String quantità = request.getParameter("quantità");
		request.setAttribute("quantità", quantità);
		
		request.setAttribute("message", "Gentile utente, il nostro database è stato agiornato in base ai dati forniti. Continua a scoprire nuove funzionalità!");
		//Materiale materiale = new Materiale (tipo,Integer.parseInt(quantità));
		// try (Materiale dao = new Materiale(ds)) {
	           // request.setAttribute("firms", dao.getAll());
			 	//dao.create(materiale);
			 	
			 	
		request.getRequestDispatcher("/azienda/funzionalità.jsp").forward(request, response);
	}
	
}
