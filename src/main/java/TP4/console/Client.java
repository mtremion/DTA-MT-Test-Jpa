package main.java.TP4.console;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Client")
public class Client 
{
	@Id
	private int id;
	@Column(name = "NOM",length = 50, nullable = false)
	private String nom = "";
	@Column(name = "PRENOM",length = 50, nullable = false)
	private String prenom = "";
	@Column(name = "DATE_DE_NAISSANCE", nullable = false)
	private LocalDate dateDeNaissance;
	
	public Client()
	{
		
	}
	
	public String toString()
	{
		return "Je suis un Client :"
				+ "\nId : "+this.getId()
				+ "\nNom : "+this.getNom()
				+ "\nPrénom : "+this.getPrenom()
				+ "\nDate de naissance : "+this.getDateDeNaissance();
	}	
	
	public void setId(int pId)
	{
		this.id = pId;
	}
	
	public void setNom(String pNom)
	{
		this.nom = pNom;
	}
	
	public void setPrenom(String pPrenom)
	{
		this.prenom = pPrenom;
	}
	
	public void setDateDeNaissance(LocalDate pDateDeNaissance)
	{
		this.dateDeNaissance = pDateDeNaissance;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public String getPrenom()
	{
		return this.prenom;
	}
	
	public LocalDate getDateDeNaissance()
	{
		return this.dateDeNaissance;
	}
	
	
}
