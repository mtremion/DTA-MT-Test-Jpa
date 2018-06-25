package main.java.TP4.service;

import javax.persistence.EntityManager;

import TP4.console.Virement;


public class VirementService 
{

	public Virement trouverUnVirement(int pId, EntityManager pEm)
	{
		Virement virement = pEm.find(Virement.class,pId);	
		return virement;
	}
}
