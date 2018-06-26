package TP4.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import TP4.console.Banque;
import TP4.console.Client;


public class ClientService 
{
	public Client trouverUnClient(int pId, EntityManager pEm)
	{
		Client client = pEm.find(Client.class,pId);	
		return client;
	}
		
	public void insererUnClient(Client pClient, EntityManager pEm)
	{
		if(trouverUnClient(pClient.getId(),pEm) == null)
		{
			EntityTransaction et = pEm.getTransaction();
			et.begin();
			pEm.persist(pClient);
			et.commit();
		}
	}
	
	public void insererDesClients(EntityManager pEm, Client... pListClient)
	{
		for(Client c : pListClient)
		{
			insererUnClient(c, pEm);
		}
	}
}
