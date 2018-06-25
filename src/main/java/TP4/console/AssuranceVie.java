package main.java.TP4.console;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AssuranceVie")
public class AssuranceVie extends Compte
{
	@Id
	private int id = 0;
	@Column(name = "DATE_FIN", nullable = false)
	private LocalDate dateFin;
	@Column(name = "TAUX", nullable = false)
	private double taux = 0.0d;
	
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
	
	public void setTaux(double pTaux)
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
	
	public double getTaux()
	{
		return this.taux;
	}
}
