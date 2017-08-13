package fr.dta.spring.annotations.utilisateur.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import fr.dta.spring.annotations.App;
import fr.dta.spring.annotations.utilisateur.model.UserNotFoundException;
import fr.dta.spring.annotations.utilisateur.service.UtilisateurService;

/**
 * @author Ayoub Benghal
 * 
 * ayoub.benghal@gmail.com
 *
 *
 * 2017
 *
 *
 * TestUpdateUser.java
 */
public class TestUpdateUser {
	/**
	 *TestUpdateUser.java
	 * context
	 */
	private static AbstractApplicationContext context;
	/**
	 *TestUpdateUser.java
	 * utilisateurService
	 */
	private static UtilisateurService utilisateurService;
	
	/**
	 * 
	 * void
	 * Initialisation avant lancement des tests
	 *
	 */
	@BeforeClass
	public static void before() {
		context=new AnnotationConfigApplicationContext(App.class);
		utilisateurService=(UtilisateurService)context.getBean("utilisateurMockService");
	}

	/**
	 * 
	 * void
	 * 
	 * Teste la modification du role de l'utilisateur
	 *
	 */
	@Test
	public void test1() {
		utilisateurService.updateUserRole();
	}
	/**
	 * 
	 * void
	 * Teste qu'il y a bien une exception qui sera soulevée
	 *
	 */
	@Test(expected=UserNotFoundException.class)
	public void test2() {
		utilisateurService.updateUserRoleException();
	}
	
	
	

}
