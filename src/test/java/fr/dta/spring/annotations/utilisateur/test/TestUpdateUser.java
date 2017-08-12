package fr.dta.spring.annotations.utilisateur.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import fr.dta.spring.annotations.App;
import fr.dta.spring.annotations.utilisateur.model.UserNotFoundException;
import fr.dta.spring.annotations.utilisateur.service.UtilisateurJdbcService;

public class TestUpdateUser {
	AbstractApplicationContext context;
	UtilisateurJdbcService utilisateurJdbcService;
	
	@Before
	public void before() {
		context=new AnnotationConfigApplicationContext(App.class);
		utilisateurJdbcService=(UtilisateurJdbcService)context.getBean("utilisateurJdbcService");
	}

	@Test
	public void test1() {
		utilisateurJdbcService.utilisateurRepository.updateUserRole();
	}
	@Test(expected=UserNotFoundException.class)
	public void test2() {
		utilisateurJdbcService.utilisateurRepository.updateUserRoleException();
	}
	
	
	

}
