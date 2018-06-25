package main.java.TP4.console;

import java.time.LocalDate;

public class Client 
{
	private int id;
	private String nom = "";
	private String prenom = "";
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
