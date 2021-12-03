package srv;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/azienda/funzionalitàChiedere")
public class FunzionalitàChiedere extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	
		String materiale = request.getParameter("materiale");
		request.setAttribute("materiale", materiale);
		
		request.setAttribute("messagethree", "Gentile utente, di seguito troverai le Aziende che mettono a disposizione il materiale da te richiesto! Continua a scoprire nuove funzionalità!");
		request.getRequestDispatcher("/azienda/funzionalità.jsp").forward(request, response);
	}

}
