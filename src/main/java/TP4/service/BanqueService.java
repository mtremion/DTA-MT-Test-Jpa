package TP4.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import TP4.console.AssuranceVie;
import TP4.console.Banque;



public class BanqueService 
{
	public Banque trouverUneBanque(int pId, EntityManager pEm)
	{
		Banque banque = pEm.find(Banque.class,pId);	
		return banque;
	}
	
	public void insererUneBanque(Banque pBanque, EntityManager pEm)
	{
		if(trouverUneBanque(pBanque.getId(),pEm) == null)
		{
			EntityTransaction et = pEm.getTransaction();
			et.begin();
			pEm.persist(pBanque);
			et.commit();
		}
	}
	
	public void insererDesBanque(EntityManager pEm, Banque... pListBanque)
	{
		for(Banque b : pListBanque)
		{
			insererUneBanque(b, pEm);
		}
	}
}
