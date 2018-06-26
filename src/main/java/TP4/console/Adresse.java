package TP4.console;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Adresse 
{
	
	@Column(name = "NUMERO", nullable = false)
	private int numero = 0;
	@Column(name = "RUE", length = 50, nullable = false)
	private String rue = "";
	@Column(name = "CODE_POSTAL", nullable = false)
	private int codePostal = 0;
	@Column(name = "VILLE", length = 50, nullable = false)
	private String ville = "";
	
	public Adresse()
	{
		
	}
	
	public Adresse(int pNumero, String pRue, int pCodePostal, String pVille)
	{
		this.numero = pNumero;
		this.rue = pRue;
		this.codePostal = pCodePostal;
		this.ville = pVille;
	}
	
	public String toString()
	{
		return "Je suis une Adresse :"
				+ "\nNuméro : "+this.getNumero()
				+ "\nRue : "+this.getRue()
				+ "\nCode Postal : "+this.getCodePostal()
				+ "\nVille : "+this.getVille();
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
