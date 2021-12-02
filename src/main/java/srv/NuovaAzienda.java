package srv;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NuovaAzienda
 */
@WebServlet("/azienda/nuova")
public class NuovaAzienda extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		request.setAttribute("nome", nome);
		String password = request.getParameter("password");
		request.setAttribute("password", password);
		
		request.getRequestDispatcher("funzionalità.jsp").forward(request, response);
	} 

}
