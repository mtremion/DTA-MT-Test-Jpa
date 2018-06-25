package main.java.TP4.console;

public class Adresse 
{
	private int id;
	private int numero = 0;
	private String rue = "";
	private int codePostal = 0;
	private String ville = "";
	
	public Adresse()
	{
		
	}
	
	public String toString()
	{
		return "Je suis une Adresse :"
				+ "\nId : "+this.getId()
				+ "\nNuméro : "+this.getNumero()
				+ "\nRue : "+this.getRue()
				+ "\nCode Postal : "+this.getCodePostal()
				+ "\nVille : "+this.getVille();
	}	
	
	public void setId(int pId)
	{
		this.id = pId;
	}

	public void setNumero(int pNumero) 
	{
		this.numero = pNumero;
	}

	public void setRue(String pRue) 
	{
		this.rue =pRue;
	}

	public void setCodePostal(int pCodePostal) 
	{
		this.codePostal = pCodePostal;
	}
	public void setVille(String pVille) 
	{
		this.ville = pVille;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public int getNumero() 
	{
		return numero;
	}
	
	public String getRue() 
	{
		return rue;
	}
	
	public int getCodePostal() 
	{
		return codePostal;
	}

	public String getVille() 
	{
		return ville;
	}
	
}
