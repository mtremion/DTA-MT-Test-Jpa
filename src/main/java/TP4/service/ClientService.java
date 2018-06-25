package main.java.TP4.service;

import javax.persistence.EntityManager;

import TP4.console.Client;


public class ClientService 
{
	public Client trouverUnClient(int pId, EntityManager pEm)
	{
		Client client = pEm.find(Client.class,pId);	
		return client;
	}
}
