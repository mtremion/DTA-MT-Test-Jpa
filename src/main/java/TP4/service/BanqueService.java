package main.java.TP4.service;

import javax.persistence.EntityManager;

import TP4.console.Banque;



public class BanqueService 
{
	public Banque trouverUneBanque(int pId, EntityManager pEm)
	{
		Banque banque = pEm.find(Banque.class,pId);	
		return banque;
	}
}
