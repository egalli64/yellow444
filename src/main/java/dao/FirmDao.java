package dao;



import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FirmDao implements AutoCloseable {
    private static final Logger log = LogManager.getLogger(FirmDao.class);
    private static final String GET_ALL = "SELECT azienda_id, nome FROM aziende";
    private static final String INSERT_NEW = "insert into aziende (nome, longitudine, latitudine, password) values (? , ?, ? , ?)"; 
    private Connection conn;

    public FirmDao(DataSource ds) {
        log.trace("called");

        try {
            this.conn = ds.getConnection();
        } catch (SQLException se) {
            throw new IllegalStateException("Database issue " + se.getMessage());
        }
    }

    public List<Firm> getAll() {
        log.trace("called");
        List<Firm> results = new ArrayList<>();

        try (Statement stmt = conn.createStatement(); //
                ResultSet rs = stmt.executeQuery(GET_ALL)) {
            while (rs.next()) {
                Firm cur = new Firm(rs.getInt(1), rs.getString(2));
                results.add(cur);
            }
        } catch (SQLException se) {
            log.error("Can't get coders: " + se.getMessage());
            throw new IllegalStateException("Database issue " + se.getMessage());
        }

        return results;
    }

    public void create (Firm firm) {
    	try (
                PreparedStatement stmt = conn.prepareStatement(INSERT_NEW)) {
               stmt.setString(1, firm.getName());
               stmt.setDouble(2, firm.getLongitudine());
               stmt.setDouble(3, firm.getLatitudine());
               stmt.setString(4, firm.getPassword());
                stmt.executeUpdate();
               
           } catch (SQLException se) {
               throw new IllegalStateException(se);
           }
    
    
    
    
    }
    
   
    
    
    @Override
    public void close() throws IOException {
        try {
            conn.close();
        } catch (SQLException se) {
            throw new IllegalStateException("Database issue " + se.getMessage());
        }
    }
}
