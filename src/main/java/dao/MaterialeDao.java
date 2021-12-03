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

public class MaterialeDao implements AutoCloseable {

	private static final Logger log = LogManager.getLogger(FirmDao.class);
	private static final String GET_ALL = "SELECT  FROM ";
	private static final String INSERT_NEW = "insert into ";
	private Connection conn;

	public MaterialeDao(DataSource ds) {
		log.trace("called");

		try {
			this.conn = ds.getConnection();
		} catch (SQLException se) {
			throw new IllegalStateException("Database issue " + se.getMessage());
		}
	}

	 public void create (Materiale materiale) {
	   /* 	try (
	                PreparedStatement stmt = conn.prepareStatement(INSERT_NEW)) {
	               stmt.setString(1, 
	               stmt.setDouble(2, firm.getLongitudine());
	               stmt.setDouble(3, firm.getLatitudine());
	               stmt.setString(4, firm.getPassword());
	                stmt.executeUpdate();
	               
	           } catch (SQLException se) {
	               throw new IllegalStateException(se);
	          */ } 

	@Override
	public void close() throws IOException {
		try {
			conn.close();
		} catch (SQLException se) {
			throw new IllegalStateException("Database issue " + se.getMessage());
		}
	}
}
