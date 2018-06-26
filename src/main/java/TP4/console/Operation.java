package TP4.console;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Operation")
@Inheritance(strategy = InheritanceType.JOINED)
public class Operation 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name = "DATE", nullable = false)
	private LocalDateTime date;
	@Column(name = "MONTANT", nullable = false)
	private double montant = 0.0d;
	@Column(name = "MOTIF",length = 255, nullable = false)
	private String motif = "";
	
	@ManyToOne
	@JoinColumn(name="ID_COMPTE")
	private Compte compte;
	
	public Operation()
	{
		
	}
	
	public Operation(LocalDateTime pDate, double pMontant, String pMotif)
	{
		this.date = pDate;
		this.montant = pMontant;
		this.motif = pMotif;
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
	
	public void setCompte(Compte pCompte)
	{
		this.compte = pCompte;
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
	
	public Compte getCompte()
	{
		return this.compte;
	}
	
}
