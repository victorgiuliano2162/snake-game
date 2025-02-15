package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.basico.Usuario;

public class NovoUsuario {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		Usuario novoUsuario = new Usuario("Victor", "victor@gmail.com");
		
		em.getTransaction().begin(); //Inicia a transação
		em.persist(novoUsuario); //Indica a instância a ser transacionada no BD
		em.getTransaction().commit(); //Comita a transação com a instância
		
		System.out.println("O Id do usuário " + novoUsuario.getNome()+ " é " + novoUsuario.getId());
		
		em.close();
		emf.close();
	}
}
