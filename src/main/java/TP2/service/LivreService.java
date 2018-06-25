package main.java.TP2.service;

import javax.persistence.EntityManager;

import main.java.TP2.console.Livre;

public class LivreService 
{
	public Livre trouverUnLivre(int pId, EntityManager pEm)
	{
		Livre book = pEm.find(Livre.class,pId);	
		return book;
	}
}
