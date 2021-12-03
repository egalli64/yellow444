package srv;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import dao.DomandaOfferta;
import dao.DomandaOffertaDao;



@WebServlet("/azienda/funzionalitàInserire")
public class FunzionalitàInserire extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource(name = "jdbc/yellow")
	private DataSource ds;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
	
		String scarto = request.getParameter("scarto");
		request.setAttribute("scarto", scarto);
		String quantità = request.getParameter("quant");
		request.setAttribute("quant", quantità);
		String materiale = request.getParameter("materiale");
		
		
		
		request.setAttribute("message", "Gentile utente, il nostro database è stato agiornato in base ai dati forniti. Continua a scoprire nuove funzionalità!");
		DomandaOfferta dom = new DomandaOfferta (Integer.parseInt(quantità), true ,2,Integer.parseInt(materiale));
		 try ( DomandaOffertaDao dao = new DomandaOffertaDao (ds)) {
	          
			 	dao.create(dom);
		 } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		 	
			 	
		request.getRequestDispatcher("/azienda/funzionalità.jsp").forward(request, response);
	}
	
}

