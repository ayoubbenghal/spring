package fr.dta.spring.annotations.utilisateur.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.dta.spring.annotations.utilisateur.dao.repository.UtilisateurRepository;
import fr.dta.spring.annotations.utilisateur.model.UserNotFoundException;

@Service
@Transactional(rollbackFor= {UserNotFoundException.class})
public class UtilisateurJdbcService {
	
	@Autowired
	public UtilisateurRepository utilisateurRepository;

}
