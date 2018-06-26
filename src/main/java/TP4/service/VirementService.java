package TP4.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import TP4.console.Operation;
import TP4.console.Virement;


public class VirementService 
{

	public Virement trouverUnVirement(int pId, EntityManager pEm)
	{
		Virement virement = pEm.find(Virement.class,pId);	
		return virement;
	}
	
	public void insererUnVirement(Virement pVirement, EntityManager pEm)
	{
		if(trouverUnVirement(pVirement.getId(),pEm) == null)
		{
			EntityTransaction et = pEm.getTransaction();
			et.begin();
			pEm.persist(pVirement);
			et.commit();
		}
	}
	
	public void insererDesVirements(EntityManager pEm, Virement... pVirement)
	{
		for(Virement v : pVirement)
		{
			insererUnVirement(v,pEm);
		}
	}
}
