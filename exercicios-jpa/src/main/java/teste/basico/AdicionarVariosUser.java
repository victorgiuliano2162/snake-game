package teste.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AdicionarVariosUser {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		String nome = leitor.nextLine();
		String email = leitor.nextLine();

		
		List<Object> usuarios = new ArrayList<>();
		Usuario[] user = new Usuario[10];
		
		int i = 1;
		while (i <= 10) {
			user[i] = new Usuario(nome, email);
			i++;
		}
		
		leitor.close();
		
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
//		for(Usuario usuario : usuarios) {
//			em.getTransaction().begin();	
//			System.out.println(usuario);
//			em.persist(usuario);
//			em.getTransaction().commit();
//		}
		
		em.close();
		emf.close();
		
	}
}