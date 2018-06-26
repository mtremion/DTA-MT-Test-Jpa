package TP4.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import TP4.console.Banque;
import TP4.console.Client;
import TP4.console.Compte;


public class CompteService 
{
	public Compte trouverUnCompte(int pId, EntityManager pEm)
	{
		Compte compte = pEm.find(Compte.class,pId);	
		return compte;
	}
	
	public void insererUnCompte(Compte pCompte, EntityManager pEm)
	{
		if(trouverUnCompte(pCompte.getId(),pEm) == null)
		{
			EntityTransaction et = pEm.getTransaction();
			et.begin();
			pEm.persist(pCompte);
			et.commit();
		}
	}
	
	public void insererDesComptes(EntityManager pEm, Compte... pListCompte)
	{
		for(Compte c : pListCompte)
		{
			insererUnCompte(c, pEm);
		}
	}
}
