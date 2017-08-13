package fr.dta.spring.annotations.employee.model;

import java.math.BigDecimal;
import java.time.LocalDate;


/**
 * @author Ayoub Benghal
 * 
 * ayoub.benghal@gmail.com
 *
 *
 * 2017
 * 
 * Model de données Employee
 *
 *
 * Employee.java
 */
public class Employee {
	
	/**
	 *Employee.java
	 * id
	 */
	private Long id;
	/**
	 *Employee.java
	 * nom = lastname
	 */
	private String nom;
	/**
	 *Employee.java
	 * prenom = firstname
	 */
	private String prenom;
	/**
	 *Employee.java
	 * idSecu = social security number
	 */
	private String idSecu;
	/**
	 *Employee.java
	 * salaire = salary
	 */
	private BigDecimal salaire;
	/**
	 *Employee.java
	 * dateEmbauche = hiring date
	 */
	private LocalDate dateEmbauche;
	/**
	 *Employee.java
	 * userName
	 */
	private String userName;
	
	
	/**
	 * Empty Constructor
	 */
	public Employee() {
	
	}
	
	
	/**
	 * Constructor with :
	 * @param id
	 * @param userName
	 * 
	 */
	public Employee(Long id, String userName) {
		super();
		this.id = id;
		this.userName = userName;
	}


	/**
	 * Constructor with :
	 * @param idSecu
	 */
	public Employee(String idSecu) {
		super();
		this.idSecu = idSecu;
	}

	/**
	 * Constructor with :
	 * @param id
	 * @param nom
	 * @param prenom
	 */
	public Employee(Long id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}
	

	/**
	 * Constructor with :
	 * @param id
	 * @param salaire
	 * @param idSecu
	 */
	public Employee(Long id,BigDecimal salaire, String idSecu) {
		super();
		this.id = id;
		this.idSecu = idSecu;
		this.salaire=salaire;
	}

	/**
	 * Constructor with :
	 * @param nom
	 * @param prenom
	 */
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
