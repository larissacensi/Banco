/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Larissa Censi
 */
public class Banco {
    	private static final String URL = "jdbc:sqlite:agenda.db";
	private static final String TABLE = "cliente";
	private Connection conn; // gerencia a conexã o
	
	private PreparedStatement selectTodosOsClientes;
        
        public Banco() {
		try {
			conn = DriverManager.getConnection(URL);
                        
                        selectTodosOsClientes = conn.prepareStatement(
					"SELECT * FROM cliente");
                        
                        
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		}
        }
        
        private void createTable() throws SQLException {
	    String sqlCreate = "CREATE TABLE IF NOT EXISTS " + TABLE
	            + "  (nome                VARCHAR,"
	            + "   endereco            VARCHAR(50),"
	            + "   CPF                 INTEGER(100),"
	            + "   telefone            INTEGER(100),"
	            + "   rendaMensal         INTEGER(20),"
	            + "   PRIMARY KEY (CPF))";

	    Statement stmt = conn.createStatement();
	    stmt.execute(sqlCreate);
	}
        
        private Pessoa getClienteFromRs(ResultSet rs) throws SQLException {
		return new Cliente(
				rs.getString("nome"),
				rs.getString("endereco"),
				rs.getLong("CPF"),
				rs.getLong("telefone"),
                                rs.getDouble("rendaMensal")
				);
	}
        
        // obtém todas as pessoas, retorna todas as pessoas do banco de dados
	public List<Pessoa> getCliente() {
		List<Pessoa> resultado = null;
		ResultSet rs = null;
		
		try {
			rs = selectTodosOsClientes.executeQuery();
			resultado = new ArrayList<>();
			
			while (rs.next()) {
				resultado.add(getClienteFromRs(rs));
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
				close();
			}
		}
		return resultado;
	}
        
        
        public void close() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

 
}
