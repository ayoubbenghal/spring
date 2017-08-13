package fr.dta.spring.annotations.utilisateur.model;


/**
 * @author Ayoub Benghal
 * 
 * ayoub.benghal@gmail.com
 *
 *
 * 2017
 *
 *
 * Model de données Utilisateur
 *
 * Utilisateur.java
 */
public class Utilisateur {
	private String username;
	private String password;
	private String role;
	
	
	/**
	 * Constructor With : 
	 * @param username
	 * @param password
	 * @param role
	 */
	public Utilisateur(String username, String password, String role) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
	}
	
	

	/**
	 * Constructor With : 
	 * @param username
	 */
	public Utilisateur(String username) {
		this.username = username;
	}



	/**
	 * Constructor With No parameters
	 */
	public Utilisateur() {
		super();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
