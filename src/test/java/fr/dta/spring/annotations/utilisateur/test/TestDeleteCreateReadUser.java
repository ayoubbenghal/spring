package fr.dta.spring.annotations.utilisateur.test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import fr.dta.spring.annotations.App;
import fr.dta.spring.annotations.utilisateur.model.Utilisateur;
import fr.dta.spring.annotations.utilisateur.service.UtilisateurJdbcService;

public class TestDeleteCreateReadUser {
	AbstractApplicationContext context;
	UtilisateurJdbcService utilisateurJdbcService;
	List<Utilisateur> users;
	
	
	@Before
	public void before() {
		
		context=new AnnotationConfigApplicationContext(App.class);
		utilisateurJdbcService=(UtilisateurJdbcService)context.getBean("utilisateurJdbcService");
		users=new ArrayList<>();
		users.add(new Utilisateur("ayoub"));
		users.add(new Utilisateur("imen"));
		users.add(new Utilisateur("rita"));

	}
	@Test
	public void test0() {
		utilisateurJdbcService.utilisateurRepository.truncateUsers();
	}
	
	@Test
	public void test1() {
		
		
		utilisateurJdbcService.utilisateurRepository.addList(users);
		
	}
	@Test
	public void test2() {
		int usersDbSize=utilisateurJdbcService.utilisateurRepository.getListUser().size();
		int usersSize=users.size();
		
		assertTrue(usersDbSize==usersSize);
	}
	
	
	
}
