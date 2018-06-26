package TP2.console;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="Livre")
public class Livre
{
	@Id
	@Column(name = "ID", length = 10, nullable = false)
	private int id = 0;
	@Column(name = "TITRE", length = 255, nullable = false)
	private String titre = "";
	@Column(name = "AUTEUR", length = 50, nullable = false)
	private String auteur = "";
	
	@ManyToMany
	@JoinTable(name="Compo", joinColumns = @JoinColumn(name="ID_LIV", referencedColumnName="ID"), inverseJoinColumns= @JoinColumn(name="ID_EMP", referencedColumnName="ID"))
	private List<Emprunt> emprunt;
	
	public Livre()
	{
		
	}
	
	public String toString()
	{
		return "Je suis un livre : "
				+ "\nId : " + this.getId()
				+ "\nTitre : " + this.getTitre()
				+ "\nAuteur : " + this.getAuteur();
	}
	
	public void setId(int pId)
	{
		this.id = pId;
	}
	
	public void setTitre(String pTitre)
	{
		this.titre = pTitre;
	}
	
	public void setAuteur(String pAuteur)
	{
		this.auteur = pAuteur;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public String getTitre()
	{
		return this.titre;
	}
	
	public String getAuteur()
	{
		return this.auteur;
	}
}
