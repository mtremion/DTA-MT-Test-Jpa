package TP4.console;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Virement")
public class Virement extends Operation
{
	@Column(name = "BENEFICIAIRE",length = 100, nullable = false)
	private String beneficiaire = "";
	
	public Virement()
	{
		
	}
	
	public Virement(LocalDateTime pDate, double pMontant, String pMotif,String pBeneficiaire)
	{
		super(pDate,pMontant,pMotif);
		this.beneficiaire = pBeneficiaire;
	}
	
	public String toString()
	{
		return "Je suis un Virement :"
				+ "\nId : "+this.getId()
				+ "\nBénéficiaire : "+this.getBeneficiaire();
	}
	
	public void setBeneficiaire(String pBeneficiaire)
	{
		this.beneficiaire = pBeneficiaire;
	}

	
	public String getBeneficiaire()
	{
		return this.beneficiaire;
	}
}
