package main.java.TP4.console;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LivretA")
public class LivretA extends Compte
{
	@Id
	private int id = 0;
	@Column(name = "TAUX", nullable = false)
	private double taux = 0.0d;
	
	public LivretA()
	{
		
	}
	
	public String toString()
	{
		return "Je suis un Livret A :"
				+ "\nId : "+this.getId()
				+ "\nTaux : "+this.getTaux();
	}
	
	public void setId(int pId)
	{
		this.id = pId;
	}
	
	public void setTaux(double pTaux)
	{
		this.taux = pTaux;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public double getTaux()
	{
		return this.taux;
	}
	
}
