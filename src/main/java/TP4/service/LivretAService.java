package TP4.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import TP4.console.Compte;
import TP4.console.LivretA;


public class LivretAService 
{
	public LivretA trouverUnLivretA(int pId, EntityManager pEm)
	{
		LivretA livretA = pEm.find(LivretA.class,pId);	
		return livretA;
	}
	
	public void insererUnLivretA(LivretA pLivretA, EntityManager pEm)
	{
		if(trouverUnLivretA(pLivretA.getId(),pEm) == null)
		{
			EntityTransaction et = pEm.getTransaction();
			et.begin();
			pEm.persist(pLivretA);
			et.commit();
		}
	}
	
	public void insererDesLivretsA(EntityManager pEm, LivretA... pLivretA)
	{
		for(LivretA la : pLivretA)
		{
			insererUnLivretA(la, pEm);
		}
	}
}
