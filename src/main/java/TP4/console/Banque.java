package TP4.console;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Banque")
public class Banque 
{
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name = "NOM", length = 50, nullable = false)
	private String nom ="";
	
	@OneToMany(mappedBy="banque")
	private List<Client> clients = new ArrayList<Client>();
	
	public Banque()
	{
		
	}
	
	public Banque(String pNom)
	{
		this.nom = pNom;
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
	
	public void setListClient(List<Client> pListClient)
	{
		this.clients = pListClient;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public List<Client> getListClient()
	{
		return this.clients;
	}
}
