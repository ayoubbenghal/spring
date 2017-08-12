package fr.dta.spring.annotations.employee.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {
	private Long id;
	private String nom;
	private String prenom;
	private String idSecu;
	private BigDecimal salaire;
	private LocalDate dateEmbauche;
	private String userName;
	
	
	public Employee() {
	
	}
	
	
	public Employee(Long id, String userName) {
		super();
		this.id = id;
		this.userName = userName;
	}


	public Employee(String idSecu) {
		super();
		this.idSecu = idSecu;
	}

	public Employee(Long id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}
	

	public Employee(Long id,BigDecimal salaire, String idSecu) {
		super();
		this.id = id;
		this.idSecu = idSecu;
		this.salaire=salaire;
	}

	public Employee(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getIdSecu() {
		return idSecu;
	}
	public void setIdSecu(String idSecu) {
		this.idSecu = idSecu;
	}
	public BigDecimal getSalaire() {
		return salaire;
	}
	public void setSalaire(BigDecimal salaire) {
		this.salaire = salaire;
	}
	public LocalDate getDateEmbauche() {
		return dateEmbauche;
	}
	public void setDateEmbauche(LocalDate dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	

}
