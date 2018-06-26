package TP2.service;

import java.util.List;

import javax.persistence.EntityManager;

import TP2.console.Emprunt;
import TP2.console.Livre;

public class EmpruntService 
{
	public Emprunt trouverUnEmprunt(int pId, EntityManager pEm)
	{
		Emprunt emprunt = pEm.find(Emprunt.class,pId);	
		return emprunt;
	}
	
	public List<Livre> trouverTousLesLivres(int pId, EntityManager pEm)
	{
		Emprunt emp = trouverUnEmprunt(pId,pEm);
		List<Livre> listLivre = emp.getListLivre();
		return listLivre;
	}
}
