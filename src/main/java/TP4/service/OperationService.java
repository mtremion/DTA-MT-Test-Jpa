package main.java.TP4.service;

import javax.persistence.EntityManager;

import TP4.console.Operation;


public class OperationService 
{

	public Operation trouverUneOperation(int pId, EntityManager pEm)
	{
		Operation operation = pEm.find(Operation.class,pId);	
		return operation;
	}
}
