/**
 * 
 */
package fr.dta.spring.annotations.utilisateur.service;

import java.util.List;

import fr.dta.spring.annotations.utilisateur.dao.repository.UtilisateurRepository;
import fr.dta.spring.annotations.utilisateur.model.Utilisateur;


/**
 * @author Ayoub Benghal
 * 
 * ayoub.benghal@gmail.com
 *
 *
 * 2017
 *
 *
 * Interface Service
 *
 * UtilisateurService.java
 */
public interface UtilisateurService {
	/**
	 * @param user
	 * void
	 * Service appelant le bean {@link UtilisateurRepository} pour ajouter un utilisateur
	 *
	 */
	void add(Utilisateur user);
	/**
	 * 
	 * void
	 * Service appelant le bean {@link UtilisateurRepository} pour modifier le role d'un utilisateur
	 *
	 */
	void updateUserRole();
	/**
	 * @return
	 * List<Utilisateur>
	 * Service appelant le bean {@link UtilisateurRepository} pour recuperer la liste des utilisateurs
	 *
	 */
	List<Utilisateur> getListUser();
	/**
	 * 
	 * void
	 * Service appelant le bean {@link UtilisateurRepository} pour supprimer tous les utilisateur
	 *
	 */
	void truncateUsers();
	/**
	 * @param users
	 * void
	 * Service appelant le bean {@link UtilisateurRepository} pour ajouter une liste d'utilisateurs
	 *
	 */
	void addList(List<Utilisateur> users);
	/**
	 * 
	 * void
	 * Service appelant le bean {@link UtilisateurRepository} pour modifier un utilisateur et soulever une exception
	 *
	 */
	void updateUserRoleException();

}
