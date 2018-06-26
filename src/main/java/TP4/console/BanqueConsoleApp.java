package TP4.console;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import TP4.service.AssuranceVieService;
import TP4.service.BanqueService;
import TP4.service.ClientService;
import TP4.service.CompteService;
import TP4.service.LivretAService;
import TP4.service.OperationService;
import TP4.service.VirementService;


public class BanqueConsoleApp 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("banque");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		Banque bnp = new Banque("BNP");
		
		Adresse chezJean = new Adresse(9,"allée des viollettes", 75000, "Paris");
		Adresse chezMarc = new Adresse(12,"allée des viollettes", 59000, "Valencienne");
		Adresse chezMax = new Adresse(5,"Rue du plateau", 78410, "Aubergenville");
		Adresse chezAnna = new Adresse(1,"Rue des artistes", 78500, "Mureaux");
		Adresse chezMelissa = new Adresse(3,"Rue des chanteurs", 78200, "Mantes");
		Adresse chezFlo = new Adresse(3,"Rue des chanteurs", 78200, "Mantes");
			
		LocalDate naissanceJean = LocalDate.of(1991,12,25);
		LocalDate naissanceMarc = LocalDate.of(1985,8,15);
		LocalDate naissanceMax = LocalDate.of(1993,7,11);
		LocalDate naissanceAnna = LocalDate.of(1999,4,12);
		LocalDate naissanceMelissa = LocalDate.of(1998,7,23);
		LocalDate naissanceFlo = LocalDate.of(1998,10,25);	
		
		LocalDate dateFinAssuranceVieMarc = LocalDate.of(2019, 12, 31);
		
		Client Jean = new Client("Jean","Dupont",naissanceJean);
		Client Marc = new Client("Marc","Dubois",naissanceMarc);
		Client Max = new Client("Max","Tremion",naissanceMax);
		Client Anna = new Client("Anna","Couvril",naissanceAnna);
		Client Melissa = new Client("Melissa","Noguera",naissanceMelissa);
		Client Flo = new Client("Flo","Paoleti",naissanceFlo);
		
		Jean.setBanque(bnp);
		Marc.setBanque(bnp);
		Max.setBanque(bnp);
		Anna.setBanque(bnp);
		Melissa.setBanque(bnp);
		Flo.setBanque(bnp);
	
		Jean.setAdresse(chezJean);
		Marc.setAdresse(chezMarc);
		Max.setAdresse(chezMax);
		Anna.setAdresse(chezAnna);
		Melissa.setAdresse(chezMelissa);
		Flo.setAdresse(chezFlo);
		
		Compte compteJean = new Compte(10001, 1000);
		Compte compteMarc = new Compte(10002, 1500);
		Compte compteMax = new Compte(10003, 10000);
		Compte compteAnna = new Compte(10004, 15000);
		Compte compteMelissa = new Compte(10005, 7000);
		Compte compteFlo = new Compte(10006, 80000);
		
		Compte compteCommunAnnaMax = new Compte(10007,50000);
		Compte compteCommunMelissaFlo = new Compte(10008,10000);
		
		LivretA livretAJean = new LivretA(10001,2000,2);
		LivretA livretAMarc = new LivretA(10002,4000,2);
		
		AssuranceVie assuranceVieMarc = new AssuranceVie(10001,3000,dateFinAssuranceVieMarc,0.8);
		
		compteJean.setListClient(Jean);
		compteMarc.setListClient(Marc);
		compteMax.setListClient(Max);
		compteAnna.setListClient(Anna);
		compteMelissa.setListClient(Melissa);
		compteFlo.setListClient(Flo);
		
		compteCommunAnnaMax.setListClient(Anna,Max);
		compteCommunMelissaFlo.setListClient(Melissa,Flo);
		
		livretAJean.setListClient(Jean);
		livretAMarc.setListClient(Marc);
		
		assuranceVieMarc.setListClient(Marc);
		
		LocalDateTime dateOperationJean = LocalDateTime.of(2018, 6, 25, 14, 47, 23);
		LocalDateTime dateOperationMarc = LocalDateTime.of(2018, 4, 22, 17, 25, 52);
		LocalDateTime dateVirementMax = LocalDateTime.of(2018, 6, 22, 15, 12, 11);
		
		Operation operationCompteJean = new Operation(dateOperationJean,-200,"Amende");
		Operation operationCompteMarc = new Operation(dateOperationJean,-500,"Achat télé");
		
		operationCompteJean.setCompte(compteJean);
		operationCompteMarc.setCompte(compteMarc);
		
		Virement virementCompteMax = new Virement(dateVirementMax,-100,"Cadeau d'anniversaire","Anna");
		
		virementCompteMax.setCompte(compteMax);
		
		
		BanqueService serviceBanque = new BanqueService();
		ClientService serviceClient = new ClientService();
		CompteService serviceCompte = new CompteService();
		LivretAService serviceLivretA = new LivretAService();
		AssuranceVieService serviceAssuranceVie = new AssuranceVieService();
		OperationService serviceOperation = new OperationService();
		VirementService serviceVirement = new VirementService();
		
		serviceBanque.insererUneBanque(bnp, em);
		serviceClient.insererDesClients(em,Jean,Marc,Max,Anna,Melissa,Flo);
		serviceCompte.insererDesComptes(em, compteJean,compteMarc,compteMax,compteAnna,compteMelissa,compteFlo);
		serviceLivretA.insererDesLivretsA(em, livretAJean,livretAMarc);
		serviceAssuranceVie.insererUneAssuranceVie(assuranceVieMarc, em);
		serviceOperation.insererDesOperations(em, operationCompteJean, operationCompteMarc);
		serviceVirement.insererUnVirement(virementCompteMax, em);
		
		
		em.close();
		entityManagerFactory.close();
	}

}
