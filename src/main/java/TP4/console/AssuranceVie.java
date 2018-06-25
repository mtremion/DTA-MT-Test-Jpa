package main.java.TP4.console;

import java.time.LocalDate;

public class AssuranceVie extends Compte
{
	private int id = 0;
	private LocalDate dateFin;
	private int taux = 0;
	
	public AssuranceVie()
	{
		
	}
	
	public String toString()
	{
		return "Je suis une Assurance Vie :"
				+ "\nId : "+this.getId()
				+ "\nDate de fin : "+this.getDateFin()
				+ "\nTaux : "+this.getTaux();
	}
	
	public void setId(int pId)
	{
		this.id = pId;
	}
	
	public void setDateFin(LocalDate pDateFin)
	{
		this.dateFin = pDateFin;
	}
	
	public void setTaux(int pTaux)
	{
		this.taux = pTaux;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public LocalDate getDateFin()
	{
		return this.dateFin;
	}
	
	public int getTaux()
	{
		return this.taux;
	}
}
