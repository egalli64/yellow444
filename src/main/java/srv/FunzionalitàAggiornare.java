package srv;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/azienda/funzionalitàAggiornare")
public class FunzionalitàAggiornare extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		

		String quantità = request.getParameter("quantità");
		request.setAttribute("quantità", quantità);
		
		request.setAttribute("messagetwo", "Gentile utente, il nostro database è stato agiornato in base ai dati forniti. Continua a scoprire nuove funzionalità!");
		request.getRequestDispatcher("/azienda/funzionalità.jsp").forward(request, response);
	
	}

}
