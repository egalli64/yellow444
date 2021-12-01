package srv;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dao.FirmDao;

@SuppressWarnings("serial")
@WebServlet("/firm/all")
public class DBExample extends HttpServlet {
    private static final Logger log = LogManager.getLogger(DBExample.class);

    @Resource(name = "jdbc/yellow")
    private DataSource ds;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        log.trace("enter");

        try (FirmDao dao = new FirmDao(ds)) {
            request.setAttribute("firms", dao.getAll());
            request.getRequestDispatcher("all.jsp").forward(request, response);
        }
    }
}
