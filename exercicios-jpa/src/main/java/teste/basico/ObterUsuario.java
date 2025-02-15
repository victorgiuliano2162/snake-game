package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class ObterUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = em.find(Usuario.class, 10l); 
		//Atentar para o tipo do segundo parâmetro
		System.out.println(usuario.getNome());
		System.out.println(usuario.getEmail());
		
		em.close();
		emf.close();
	}
}
