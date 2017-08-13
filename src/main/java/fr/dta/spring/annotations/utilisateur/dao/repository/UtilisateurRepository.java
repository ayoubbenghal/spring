package fr.dta.spring.annotations.utilisateur.dao.repository;

import java.util.List;

import fr.dta.spring.annotations.utilisateur.model.Utilisateur;

/**
 * @author Ayoub Benghal
 * 
 * ayoub.benghal@gmail.com
 *
 *
 * 2017
 * 
 * Interface du repository 
 *
 *
 * UtilisateurRepository.java
 */
public interface UtilisateurRepository {
	
	
	
	/**
	 * @param user
	 * void
	 * Ajouter un utilisateur à la DataBase
	 *
	 */
	void add(Utilisateur user);
	/**
	 * 
	 * void
	 * Modifier un utilisateur de la DataBase
	 *
	 */
	void updateUserRole();
	/**
	 * @return
	 * List<Utilisateur>
	 * 
	 * Recuperer une liste d'utilisateur de la DataBase
	 *
	 */
	List<Utilisateur> getListUser();
	/**
	 * 
	 * void
	 * 
	 * Supprimer tous les utilisateur de la DataBase
	 *
	 */
	void truncateUsers();
	/**
	 * @param users
	 * void
	 * Ajouter une liste d'utilisateur à la DataBase
	 *
	 */
	void addList(List<Utilisateur> users);
	/**
	 * 
	 * void
	 * Modifier tous les utilisateur et déclencher une exception
	 *
	 */
	void updateUserRoleException();
}
