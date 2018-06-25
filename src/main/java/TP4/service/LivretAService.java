package main.java.TP4.service;

import javax.persistence.EntityManager;

import TP4.console.LivretA;


public class LivretAService 
{
	public LivretA trouverUnLivretA(int pId, EntityManager pEm)
	{
		LivretA livretA = pEm.find(LivretA.class,pId);	
		return livretA;
	}
}
