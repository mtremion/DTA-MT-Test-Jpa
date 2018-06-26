package TP2.console;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Client")
public class Client 
{
	@Id
	private int id = 0;
	@Column(name = "NOM", length = 50, nullable = false)
	private String nom = "";
	@Column(name = "PRENOM", length = 50, nullable = false)
	private String prenom = "";
	
	@OneToMany(mappedBy="client")
	private List<Emprunt> listEmprunt;
	
	
	
	public Client()
	{
		
	}
	
	public String toString()
	{
		return "Je suis un client : "
				+ "\nId : " + this.getId()
				+ "\nNom : " + this.getNom()
				+ "\nPrenom : " + this.getPrenom();
	}
	
	public void setId(int pId)
	{
		this.id = pId;
	}
	
	public void setPrenom(String pNom)
	{
		this.nom = pNom;
	}
	
	public void setNom(String pPrenom)
	{
		this.prenom = pPrenom;
	}
	
	public void setListEmprunt(List<Emprunt> pListEmprunt)
	{
		this.listEmprunt = pListEmprunt;
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
	
	public List<Emprunt> getListEmprunt()
	{
		return this.listEmprunt;
	}
}
