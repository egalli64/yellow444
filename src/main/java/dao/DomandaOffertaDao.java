package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

public class DomandaOffertaDao implements AutoCloseable {

	private static final String INSERT_NEW = "insert into domanda_offerta ( azienda_id, materiale_id, quantità, scarto) values (?, ?, ?, ?)";
	private Connection conn;

	public DomandaOffertaDao(DataSource ds) {

		try {
			this.conn = ds.getConnection();
		} catch (SQLException se) {
			throw new IllegalStateException("Database issue " + se.getMessage());
		}
	}

	public void create(DomandaOfferta dom) {
		try (PreparedStatement stmt = conn.prepareStatement(INSERT_NEW)) {
			stmt.setInt(1, dom.getAziendaId());
			stmt.setInt(2, dom.getMaterialeId());
			stmt.setInt(3, dom.getQuantità());
			stmt.setBoolean(4, dom.isScarto());
			stmt.executeUpdate();

		} catch (SQLException se) {
			throw new IllegalStateException(se);
		}
	}

	@Override
	public void close() throws Exception {
		try {
			conn.close();
		} catch (SQLException se) {
			throw new IllegalStateException("Database issue " + se.getMessage());
		}

	}

}
