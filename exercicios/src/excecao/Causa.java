package excecao;

public class Causa {

	public static void main(String[] args) {
		
		try {
			metodoA(null);
		} catch (Exception e) {
			if(e.getCause() != null) {
				System.out.println(e.getCause().getMessage());
			}
		}
	}
	
	static void metodoA(Aluno aluno) {
		 try {
			metodoB(aluno);
		} catch (Exception e) {
			throw new IllegalArgumentException(e);
		}
	}
	
	static void metodoB(Aluno aluno) {
		if (aluno == null) {
			throw new NullPointerException("O campo aluno é inválido");
		}
		System.out.println(aluno.nome);
	}

}
