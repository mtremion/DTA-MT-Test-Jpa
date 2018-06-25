package main.java.TP4.console;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Operation")
public class Operation 
{
	@Id
	private int id = 0;
	@Column(name = "DATE", nullable = false)
	private LocalDateTime date;
	@Column(name = "MONTANT", nullable = false)
	private double montant = 0.0d;
	@Column(name = "MOTIF",length = 255, nullable = false)
	private String motif = "";
	
	public Operation()
	{
		
	}
	
	public String toString()
	{
		return "Je suis une Opération :"
				+ "\nId : "+this.getId()
				+ "\nDate : "+this.getDate()
				+ "\nMontant : "+this.getMontant()
				+ "\nMotif : "+this.getMotif();
	}
	
	public void setId(int pId)
	{
		this.id = pId;
	}
	
	public void setDate(LocalDateTime pDate)
	{
		this.date = pDate;
	}
	
	public void setMontant(double pMontant)
	{
		this.montant = pMontant;
	}
	
	public void setMotif(String pMotif)
	{
		this.motif = pMotif;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public LocalDateTime getDate()
	{
		return this.date;
	}
	
	public double getMontant()
	{
		return this.montant;
	}
	
	public String getMotif()
	{
		return this.motif;
	}
	
}
