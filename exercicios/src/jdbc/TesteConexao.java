package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	
	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306";
		//driver : servidor :// nome do servidor : portal do servidor
		String usuario = "root";
		String senha = "153769";
		
		Connection conexão = DriverManager.getConnection(url, usuario, senha);
		
		System.out.println("Conexão efetuada com sucesso");
		conexão.close();
	}
}
