package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUsuarios {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
//		String jpql = "select u from Usuario u";
//		//jpql = java persistence query language
//		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
//		//Uma consulta tipada
//		query.setMaxResults(5);
//		List<Usuario> usuarios = query.getResultList();
		
		List<Usuario> usuarios = em.createQuery("select u from Usuario u", Usuario.class).setMaxResults(7).getResultList();
		
		for(Usuario usuario : usuarios) {
			System.out.println("Id: "+ usuario.getId());
			System.out.println("Nome: "+ usuario.getNome());
			System.out.println("Email: "+ usuario.getEmail());
			System.out.println();
		}
		
		em.close();
		emf.close();
	}
}
