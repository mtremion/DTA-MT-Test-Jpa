package TP4.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import TP4.console.AssuranceVie;
import TP4.console.Client;



public class AssuranceVieService 
{
	public AssuranceVie trouverUneAssuranceVie(int pId, EntityManager pEm)
	{
		AssuranceVie assuranceVie = pEm.find(AssuranceVie.class,pId);	
		return assuranceVie;
	}
	
	public void insererUneAssuranceVie(AssuranceVie pAssuranceVie, EntityManager pEm)
	{
		if(trouverUneAssuranceVie(pAssuranceVie.getId(),pEm) == null)
		{
			EntityTransaction et = pEm.getTransaction();
			et.begin();
			pEm.persist(pAssuranceVie);
			et.commit();
		}
	}
	
	public void insererDesAssurancesVie(EntityManager pEm, AssuranceVie... pListAssuranceVie)
	{
		for(AssuranceVie av : pListAssuranceVie)
		{
			insererUneAssuranceVie(av, pEm);
		}
	}
}
