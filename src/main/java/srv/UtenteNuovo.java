package srv;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import dao.Firm;
import dao.FirmDao;

@WebServlet("/utente/nuovo")
public class UtenteNuovo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource(name = "jdbc/yellow")
	private DataSource ds;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nome = request.getParameter("nome");
		request.setAttribute("nome", nome);
		String password = request.getParameter("password");
		request.setAttribute("password", password);
		String latitudine = request.getParameter("latitudine");
		request.setAttribute("latitudine", latitudine);
		String longitudine = request.getParameter("longitudine");
		request.setAttribute("longitudine", longitudine);
	
		Firm firm = new Firm (nome,Double.parseDouble(latitudine), Double.parseDouble(longitudine), password);
		 try (FirmDao dao = new FirmDao(ds)) {
	           // request.setAttribute("firms", dao.getAll());
			 	dao.create(firm);
	            
	        }
		
		
		request.getRequestDispatcher("/azienda/funzionalità.jsp").forward(request, response);
	}

}
