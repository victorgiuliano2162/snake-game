package jdbc;

public class DAOTeste {

	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		String sql = "insert into pessoas (codigo, nome) values (?, ?)";
		String sql1 = "update pessoas set codigo = ? where codigo = ?";
		
		System.out.println(dao.incluir(sql1, 12, 112));
		
		dao.close();

	}
}
