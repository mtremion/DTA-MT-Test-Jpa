package main.java.TP1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestJpa 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test_jpa");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		em.close();
		entityManagerFactory.close();
	}

}
