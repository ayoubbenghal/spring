package fr.dta.spring.annotations.utilisateur.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.dta.spring.annotations.utilisateur.dao.repository.UtilisateurRepository;
import fr.dta.spring.annotations.utilisateur.model.UserNotFoundException;
import fr.dta.spring.annotations.utilisateur.model.Utilisateur;

/**
 * @author Ayoub Benghal
 * 
 * ayoub.benghal@gmail.com
 *
 *
 * 2017
 * 
 * Service Tansactionnel avec un paramétre de rollback si l'exception {@link UserNotFoundException} est soulevée
 *
 *
 * UtilisateurMockService.java
 */
@Service
@Transactional(rollbackFor= {UserNotFoundException.class})
public class UtilisateurMockService implements UtilisateurService{
	
	@Autowired
	public UtilisateurRepository utilisateurRepository;

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.utilisateur.service.UtilisateurService#add(fr.dta.spring.annotations.utilisateur.model.Utilisateur)
	 */
	@Override
	public void add(Utilisateur user) {
		utilisateurRepository.add(user);
	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.utilisateur.service.UtilisateurService#updateUserRole()
	 */
	@Override
	public void updateUserRole() {
		utilisateurRepository.updateUserRole();
	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.utilisateur.service.UtilisateurService#getListUser()
	 */
	@Override
	public List<Utilisateur> getListUser() {
		return utilisateurRepository.getListUser();
	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.utilisateur.service.UtilisateurService#truncateUsers()
	 */
	@Override
	public void truncateUsers() {
		utilisateurRepository.truncateUsers();
	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.utilisateur.service.UtilisateurService#addList(java.util.List)
	 */
	@Override
	public void addList(List<Utilisateur> users) {
		utilisateurRepository.addList(users);
	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.utilisateur.service.UtilisateurService#updateUserRoleException()
	 */
	@Override
	public void updateUserRoleException() {
		utilisateurRepository.updateUserRoleException();
	}

}
