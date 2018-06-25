package main.java.TP2.service;

import java.util.List;

import javax.persistence.EntityManager;

import main.java.TP2.console.Client;
import main.java.TP2.console.Emprunt;

public class ClientService 
{
	public Client trouverUnClient(int pId, EntityManager pEm)
	{
		Client client = pEm.find(Client.class,pId);	
		return client;
	}
	
	public List<Emprunt> trouverTousLesEmprunts(int pId, EntityManager pEm)
	{
		Client client = trouverUnClient(pId, pEm);
		List<Emprunt> listEmprunt = client.getListEmprunt();
		return listEmprunt;
	}
}
