package fr.dta.spring.annotations.employee.test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import fr.dta.spring.annotations.App;
import fr.dta.spring.annotations.employee.model.Employee;
import fr.dta.spring.annotations.employee.service.EmployeeService;




/**
 * @author Ayoub Benghal
 * 
 * ayoub.benghal@gmail.com
 *
 *
 * 2017
 *
 *
 * TestDeleteCreateReadEmployee.java
 */
public class TestDeleteCreateReadEmployee {

	/**
	 *TestDeleteCreateReadEmployee.java
	 * context
	 */
	private static AbstractApplicationContext context;
	/**
	 *TestDeleteCreateReadEmployee.java
	 * employeeJdbcService
	 */
	private static EmployeeService employeeService;
	/**
	 *TestDeleteCreateReadEmployee.java
	 * employees
	 */
	private static List<Employee>employees;
	

	/**
	 * 
	 * void
	 * 
	 * Initialisation avant le lancement des tests
	 *
	 */
	@BeforeClass
	public static void before(){
		
		
		
		System.setProperty("spring.profiles.active", "JDBC");
		context=new AnnotationConfigApplicationContext(App.class);
		employeeService=(EmployeeService)context.getBean("employeeJdbcService");
		employees= new ArrayList<>();
		employees.add(new Employee("BENGHAL", "AYOUB"));
		employees.add(new Employee("BENGHAL", "IMEN"));
		employees.add(new Employee("BENGHAL","RITA"));
		
	}
	
	
	/**
	 * 
	 * void
	 * 
	 * Teste que toutes les lignes de la table des employés dans la base de données seront effacées
	 *
	 */
	@Test
	public void test0() {
		employeeService.deleteAll();
		assertTrue(employeeService.findAllEmployees().size()==0);
	}

	
	
	/**
	 * 
	 * void
	 * 
	 * Teste un ajout dans la base de donnée
	 *
	 */
	@Test
	public void test1() {
		employeeService.saveListEmployee(employees);		
	}
	
	/**
	 * 
	 * void
	 * 
	 * Tester que le nombre des lignes dans la base de données est égale au nombre de ligne de la liste
	 *
	 */
	@Test 
	public void test2() {
		int empsDbSize=employeeService.findAllEmployees().size();
		int empsSize=employees.size();
		assertTrue(empsDbSize==empsSize);
	}
	
	
	

}
