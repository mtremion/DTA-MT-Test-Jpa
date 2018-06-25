package main.java.TP4.service;

import javax.persistence.EntityManager;

import TP4.console.AssuranceVie;



public class AssuranceVieService 
{
	public AssuranceVie trouverUneAssuranceVie(int pId, EntityManager pEm)
	{
		AssuranceVie assuranceVie = pEm.find(AssuranceVie.class,pId);	
		return assuranceVie;
	}
}
