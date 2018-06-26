package TP4.console;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Client")
public class Client 
{
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name = "NOM",length = 50, nullable = false)
	private String nom = "";
	@Column(name = "PRENOM",length = 50, nullable = false)
	private String prenom = "";
	@Column(name = "DATE_DE_NAISSANCE", nullable = false)
	private LocalDate dateDeNaissance;
	
	@Embedded
	private Adresse adresse;
	
	@ManyToOne
	@JoinColumn(name="ID_BANQUE")
	private Banque banque;
	
	@ManyToMany
	@JoinTable(name="CLI_COM",joinColumns= @JoinColumn(name="ID_CLI", referencedColumnName="ID"),
	inverseJoinColumns= @JoinColumn(name="ID_COM", referencedColumnName="ID"))
	private List<Compte> comptes = new ArrayList<Compte>();
	
	public Client()
	{
		
	}
	
	public Client(String pNom, String pPrenom, LocalDate pDateDeNaissance)
	{
		this.nom = pNom;
		this.prenom = pPrenom;
		this.dateDeNaissance = pDateDeNaissance;
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
	
	public void setAdresse (Adresse pAdresse)
	{
		this.adresse = pAdresse;
	}
	
	public void setBanque (Banque pBanque)
	{
		this.banque = pBanque;
	}
	
	public void setListCompte (List<Compte> pListCompte)
	{
		this.comptes = pListCompte;
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
	
	public Adresse getAdresse()
	{
		return this.adresse;
	}
	
	public Banque getBanque()
	{
		return this.banque;
	}
	
	public List<Compte> getListCompte()
	{
		return this.comptes;
	}
	
}
