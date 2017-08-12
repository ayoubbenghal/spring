package fr.dta.spring.annotations.utilisateur.model;

public class Utilisateur {
	private String username;
	private String password;
	private String role;
	public Utilisateur(String username, String password, String role) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
	}
	
	

	public Utilisateur(String username) {
		this.username = username;
	}



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
