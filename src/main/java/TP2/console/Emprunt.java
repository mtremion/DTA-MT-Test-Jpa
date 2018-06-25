package main.java.TP2.console;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Emprunt")
public class Emprunt 
{
	@Id
	@Column(name = "ID", length = 10, nullable = false)
	private int id = 0;
	@Column(name = "DATE_DEBUT", nullable = false)
	private Date dateDebut;
	@Column(name = "DATE_FIN", nullable = false)
	private Date dateFin;
	@Column(name = "DELAI", nullable = false)
	private int delai = 0;
	
	@ManyToOne
	@JoinColumn(name="ID_CLIENT", nullable = false)
	private Client client;

	@ManyToMany
	@JoinTable(name="Compo", joinColumns = @JoinColumn(name="ID_EMP", referencedColumnName="ID"), inverseJoinColumns= @JoinColumn(name="ID_LIV", referencedColumnName="ID"))
	private List<Livre> listLivre;
	
	public Emprunt()
	{
		
	}

	public String toString()
	{
		return "Je suis un emprunt : "
				+ "\nId : " + this.getId()
				+ "\nDate début : " + this.getDateDebut()
				+ "\nDate fin : " + this.getDateFin()
				+ "\nDélai :" + this.getDelai();
	}
	
	public void setId(int pId)
	{
		this.id = pId;
	}
	
	public void setDateDebut(Date pDate)
	{
		this.dateDebut = pDate;
	}
	
	public void setDateFin(Date pDate)
	{
		this.dateFin = pDate;
	}
	
	public void setDelai(int pDelai)
	{
		this.delai = pDelai;
	}
	
	public void setClient(Client client) 
	{
		this.client = client;
	}
	
	
	public void setListLivre(List<Livre> pListLivre)
	{
		this.listLivre = pListLivre;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public Date getDateDebut()
	{
		return this.dateDebut;
	}
	
	public Date getDateFin()
	{
		return this.dateFin;
	}
	
	public int getDelai()
	{
		return this.delai;
	}
	
	public Client getClient() 
	{
		return client;
	}

	

	public List<Livre> getListLivre()
	{
		return this.listLivre;
	}
	
}
