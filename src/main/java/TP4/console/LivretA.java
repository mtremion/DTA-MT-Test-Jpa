package TP4.console;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LivretA")
public class LivretA extends Compte
{
	@Column(name = "TAUX", nullable = false)
	private double taux = 0.0d;
	
	public LivretA()
	{
		
	}
	
	LivretA(int pNumero, double pSolde,double pTaux)
	{
		super(pNumero, pSolde);
		this.taux = pTaux;
	}
	
	public String toString()
	{
		return "Je suis un Livret A :"
				+ "\nId : "+this.getId()
				+ "\nTaux : "+this.getTaux();
	}

	public void setTaux(double pTaux)
	{
		this.taux = pTaux;
	}
	
	public double getTaux()
	{
		return this.taux;
	}
	
}
