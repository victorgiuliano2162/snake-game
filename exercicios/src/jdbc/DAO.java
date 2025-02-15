package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	
	//DAO = data acesses object
	
		 private Connection conexao;
		 
		 public int incluir(String sql, Object... atributos) {
			 //Object... premite passar uma lista de vários itens do tipo, então caso seja necessário poder-se-ia enviar: id, nome, numero, cep, rg, cpf, data de nascimento etc.
			 try {
				 PreparedStatement stmt = getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
				 adicionarAtributos(stmt, atributos);
				 
				 if(stmt.executeUpdate() > 0) {
					 ResultSet resultado = stmt.getGeneratedKeys();
					 
					 if(resultado.next()) {
						 return resultado.getInt(1);
					 }
				 }
				 return -1;
			 }catch(SQLException e){
				 throw new RuntimeException(e);
			 }
		 }
		 
		 private void adicionarAtributos(PreparedStatement stmt, Object[] atributos) throws SQLException {
			 int indice = 1;
			 //Por algum motivo essa variável precisa ser local, quando declarada globalmente o valor não é incrementado e torna impossível a adição mais de um dado por vez no banco
			 for(Object atributo: atributos) {
				 if(atributo instanceof String) {
					 stmt.setString(indice, (String) atributo);
				 } else if (atributo instanceof Integer) {
					 stmt.setInt(indice, (Integer) atributo);
				 }
				 indice++;
			 }
		 }
		 
		 private Connection getConexao() {
			 try {
				 if(conexao != null && !conexao.isClosed()) {
					 //O método isClosed() exige ser tratado com o SQLException
					 return conexao;
				 }
			 } catch (SQLException e){
			 }
			 conexao = FabricaConexao.getConexao();
			 return conexao;
		 }
		 
		 public void close() {
			 	try {
					getConexao().close();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					conexao = null;
				}
		 }
		 //Excelente exemplo de como matar um objecto. Conexão fechada e objecto anulado
			 
		 
}
