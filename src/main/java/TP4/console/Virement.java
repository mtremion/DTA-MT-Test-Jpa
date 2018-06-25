package main.java.TP4.console;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Virement")
public class Virement extends Operation
{
	@Id
	private int id = 0;
	@Column(name = "BENEFICIAIRE",length = 100, nullable = false)
	private String beneficiaire = "";
	
	public Virement()
	{
		
	}
	
	public String toString()
	{
		return "Je suis un Virement :"
				+ "\nId : "+this.getId()
				+ "\nBénéficiaire : "+this.getBeneficiaire();
	}
	
	public void setId(int pId)
	{
		this.id = pId;
	}
	
	public void setBeneficiaire(String pBeneficiaire)
	{
		this.beneficiaire = pBeneficiaire;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public String getBeneficiaire()
	{
		return this.beneficiaire;
	}
}
