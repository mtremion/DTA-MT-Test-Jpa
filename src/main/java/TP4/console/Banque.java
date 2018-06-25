package main.java.TP4.console;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Banque")
public class Banque 
{
	@Id
	private int id;
	@Column(name = "NOM", length = 50, nullable = false)
	private String nom ="";
	
	public Banque()
	{
		
	}
	
	public String toString()
	{
		return "Je suis une Banque : "
				+ "\nId : "+this.getId()
				+ "\nNom : "+this.getNom();				
	}
	
	public void setId(int pId)
	{
		this.id = pId;
	}
	
	public void setNom(String pNom)
	{
		this.nom = pNom;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public String getNom()
	{
		return this.nom;
	}
}
