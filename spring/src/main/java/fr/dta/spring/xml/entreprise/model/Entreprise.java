package fr.dta.spring.xml.entreprise.model;

import java.util.List;

import fr.dta.spring.xml.employee.model.Employee;

public class Entreprise {
	private Long id;
	private String nom;
	private List<Employee> listEmployes;
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
	public List<Employee> getListEmployes() {
		return listEmployes;
	}
	public void setListEmployes(List<Employee> listEmployes) {
		this.listEmployes = listEmployes;
	}
	
	

}
