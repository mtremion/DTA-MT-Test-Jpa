package TP4.console;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Compte")
@Inheritance(strategy = InheritanceType.JOINED)
public class Compte 
{
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name = "NUMERO",length = 30, nullable = false)
	private int numero = 0;
	@Column(name = "SOLDE", nullable = false)
	private double solde = 0.0d;
	
	@ManyToMany
	@JoinTable(name="CLI_COM",joinColumns= @JoinColumn(name="ID_COM", referencedColumnName="ID"),
	inverseJoinColumns= @JoinColumn(name="ID_CLI", referencedColumnName="ID"))
	private List<Client> clients = new ArrayList<Client>();
	
	@OneToMany(mappedBy="compte")
	private List<Operation> operations = new ArrayList<Operation>();
	
	public Compte()
	{
		
	}
	
	public Compte(int pNumero, double pSolde)
	{
		this.numero = pNumero;
		this.solde = pSolde;
	}
	
	public String toString()
	{
		return "Je suis un Compte : "
				+"\nId : "+this.getId()
				+"\nNuméro : "+this.getNumero()
				+"\nSolde : "+this.getSolde();
	}
	
	public void setId(int pId)
	{
		this.id = pId;
	}
	
	public void setNumero(int pNumero)
	{
		this.numero = pNumero;
	}
	
	public void setSolde(double pSolde)
	{
		this.solde = pSolde;
	}
	
	public void setListClient(Client... pListClient)
	{
		for(Client c : pListClient)
		{
			this.clients.add(c);
		}
	}
	
	public void setListOperation(List<Operation> pListOperation)
	{
		this.operations = pListOperation;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public int getNumero()
	{
		return this.numero;
	}
	
	public double getSolde()
	{
		return this.solde;
	}
	
	public List<Client> getListClient()
	{
		return this.clients;
	}
	
	public List<Operation> getListOperation()
	{
		return this.operations;
	}
	
}
