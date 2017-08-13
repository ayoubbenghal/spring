package fr.dta.spring.annotations.employee.test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

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
 * TestUpdateEmployee.java
 */
public class TestUpdateEmployee {

	/**
	 *TestUpdateEmployee.java
	 * context
	 */
	private static AbstractApplicationContext context;
	/**
	 *TestUpdateEmployee.java
	 * employeeService
	 */
	private static EmployeeService employeeService;
	

	/**
	 * 
	 * void
	 * Initilisation avant le lancement des tests 
	 *
	 */
	/**
	 * 
	 * void
	 * 
	 * Initialisation avant lancement des tests
	 *
	 */
	@BeforeClass
	public static void before(){
		System.setProperty("spring.profiles.active", "JDBC");
		context=new AnnotationConfigApplicationContext(App.class);
		employeeService=(EmployeeService)context.getBean("employeeJdbcService");
	}
	
	/**
	 * 
	 * void
	 * Modifier des employés 
	 * 
	 *
	 */
	@Test
	public void test1() {
		
		employeeService.updateEmployee(new Employee(1L,new BigDecimal(4000),"12345"));
		employeeService.updateEmployee(new Employee(2L,new BigDecimal(5000),"123456"));
		employeeService.updateEmployee(new Employee(3L,new BigDecimal(5000),"1234567"));
		

		
	}
	/**
	 * 
	 * void
	 * Teste qu'il y a toujours 3 employés 
	 *
	 */
	@Test
	public void test2() {
		assertTrue(employeeService.findAllEmployees().size()==3);
	}
	
	/**
	 * 
	 * void
	 * 
	 * Teste qu'il y a un employé avec un numero de securité sociale donné en paramétre
	 *
	 */
	@Test
	public void test3() {
		
		assertTrue(!employeeService.findBySsn("12345").equals(null));
		
	}
	
	/**
	 * 
	 * void
	 * 
	 * Teste la modification du pseudo de trois employés
	 *
	 */
	@Test
	public void test4() {
		employeeService.updateUserName(new Employee(1L, "ayoub"));
		employeeService.updateUserName(new Employee(2L, "imen"));
		employeeService.updateUserName(new Employee(3L, "rita"));

	}


}
