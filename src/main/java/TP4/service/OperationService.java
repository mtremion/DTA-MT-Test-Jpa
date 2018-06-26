package TP4.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import TP4.console.LivretA;
import TP4.console.Operation;


public class OperationService 
{

	public Operation trouverUneOperation(int pId, EntityManager pEm)
	{
		Operation operation = pEm.find(Operation.class,pId);	
		return operation;
	}
	
	public void insererUneOperation(Operation pOperation, EntityManager pEm)
	{
		if(trouverUneOperation(pOperation.getId(),pEm) == null)
		{
			EntityTransaction et = pEm.getTransaction();
			et.begin();
			pEm.persist(pOperation);
			et.commit();
		}
	}
	
	public void insererDesOperations(EntityManager pEm, Operation... pOperation)
	{
		for(Operation o : pOperation)
		{
			insererUneOperation(o, pEm);
		}
	}
}
