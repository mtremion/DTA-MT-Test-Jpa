package main.java.TP4.service;

import javax.persistence.EntityManager;

import TP4.console.Adresse;

public class AdresseService 
{
	public Adresse trouverUneAdresse(int pId, EntityManager pEm)
	{
		Adresse adresse = pEm.find(Adresse.class,pId);	
		return adresse;
	}
}
