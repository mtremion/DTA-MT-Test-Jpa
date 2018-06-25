package main.java.TP4.console;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Compte")
public class Compte 
{
	@Id
	private int id = 0;
	@Column(name = "NUMERO",length = 30, nullable = false)
	private int numero = 0;
	@Column(name = "SOLDE", nullable = false)
	private double solde = 0.0d;
	
	public Compte()
	{
		
	}
	
	public String toString()
	{
		return "Je suis un Compte : "
				+"\nId : "+this.getId()
				+"\nNuméro : "+this.getNumero()
				+"\nSolde : "+this.getSolde();
	}
	
	public void setId(int pId)
	{
		this.id = pId;
	}
	
	public void setNumero(int pNumero)
	{
		this.numero = pNumero;
	}
	
	public void setSolde(double pSolde)
	{
		this.solde = pSolde;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public int getNumero()
	{
		return this.numero;
	}
	
	public double getSolde()
	{
		return this.solde;
	}
	
	
}
