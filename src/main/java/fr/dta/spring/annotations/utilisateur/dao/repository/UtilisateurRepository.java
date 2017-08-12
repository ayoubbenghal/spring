package fr.dta.spring.annotations.utilisateur.dao.repository;

import java.util.List;

import fr.dta.spring.annotations.utilisateur.model.Utilisateur;

public interface UtilisateurRepository {
	
	
	void add(Utilisateur user);
	void updateUserRole();
	List<Utilisateur> getListUser();
	void truncateUsers();
	void addList(List<Utilisateur> users);
	void updateUserRoleException();
}
