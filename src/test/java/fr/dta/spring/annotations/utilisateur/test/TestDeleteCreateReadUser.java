package fr.dta.spring.annotations.utilisateur.test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import fr.dta.spring.annotations.App;
import fr.dta.spring.annotations.utilisateur.model.Utilisateur;
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
 * TestDeleteCreateReadUser.java
 */
public class TestDeleteCreateReadUser {
	/**
	 *TestDeleteCreateReadUser.java
	 * context
	 */
	private static AbstractApplicationContext context;
	/**
	 *TestDeleteCreateReadUser.java
	 * utilisateurService
	 */
	private static UtilisateurService utilisateurService;
	/**
	 *TestDeleteCreateReadUser.java
	 * users
	 */
	private static List<Utilisateur> users;
	
	
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
		users=new ArrayList<>();
		users.add(new Utilisateur("ayoub"));
		users.add(new Utilisateur("imen"));
		users.add(new Utilisateur("rita"));

	}
	/**
	 * 
	 * void
	 * Test la Suppression de tous les utilisateurs de la base de données
	 *
	 */
	@Test
	public void test0() {
		utilisateurService.truncateUsers();
	}
	
	/**
	 * 
	 * void
	 * Test l'ajout d'une liste d'utilisateur dans la base de données
	 *
	 */
	@Test
	public void test1() {
		
		
		utilisateurService.addList(users);
		
	}
	/**
	 * 
	 * void
	 * 
	 * Teste qu'il y a bien 3 utilisateurs ajoutés à la base de données
	 *
	 */
	@Test
	public void test2() {
		int usersDbSize=utilisateurService.getListUser().size();
		int usersSize=users.size();
		
		assertTrue(usersDbSize==usersSize);
	}
	
	
	
}
