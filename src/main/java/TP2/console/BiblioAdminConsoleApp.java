package main.java.TP2.console;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import main.java.TP2.service.ClientService;
import main.java.TP2.service.EmpruntService;
import main.java.TP2.service.LivreService;

public class BiblioAdminConsoleApp
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test_jpa");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		LivreService service = new LivreService();
		Livre book = service.trouverUnLivre(2,em);
		
		System.out.println(book.toString());
		
		EmpruntService service2 = new EmpruntService();
		List<Livre> listLivre = service2.trouverTousLesLivres(1, em);
		
		for(Livre l : listLivre)
		{
			System.out.println(l.toString());
		}
		
		ClientService service3 = new ClientService();
		List<Emprunt> listEmprunt = service3.trouverTousLesEmprunts(1,em);
		
		for(Emprunt e : listEmprunt)
		{
			System.out.println(e.toString());
		}
		
		em.close();
		entityManagerFactory.close();
	}

}
