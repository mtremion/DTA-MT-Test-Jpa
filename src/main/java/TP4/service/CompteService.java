package main.java.TP4.service;

import javax.persistence.EntityManager;

import TP4.console.Compte;


public class CompteService 
{
	public Compte trouverUnCompte(int pId, EntityManager pEm)
	{
		Compte compte = pEm.find(Compte.class,pId);	
		return compte;
	}
}
