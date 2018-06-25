package main.java.TP4.console;

public class Banque 
{
	private int id;
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
