package fr.dta.spring.annotations.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import fr.dta.spring.annotations.App;
import fr.dta.spring.annotations.employee.model.Employee;
import fr.dta.spring.annotations.employee.service.EmployeeJdbcService;
import fr.dta.spring.annotations.employee.service.EmployeeService;
import fr.dta.spring.annotations.employee.service.MailService;
import static org.junit.Assert.*;

public class TestSpringAnnotations {

	AbstractApplicationContext context;
	MailService mailServiceA;
	MailService mailServiceB;
	EmployeeService employeeService;
	EmployeeJdbcService employeeJdbcService;
	

	@Before
	public void before(){
		context=new AnnotationConfigApplicationContext(App.class);
		System.setProperty("spring.profiles.active", "JDBC");
		mailServiceA= (MailService) context.getBean("mailService");
		mailServiceA.setMessage("MESSAGE POUR SERVICE MAIL A");
		mailServiceB=(MailService) context.getBean("mailService");
		mailServiceB.setMessage("MESSAGE POUR SERVICE MAIL B");
		employeeService=(EmployeeService) context.getBean("employeeMockService");
		
		employeeJdbcService=(EmployeeJdbcService)context.getBean("employeeJdbcService");
	}
	@Test
	public void test0() {
		employeeJdbcService.employeeRepository.deleteAll();
	}
	@Test
	public void test1() {
		
		assertTrue("MESSAGE POUR SERVICE MAIL A".equals(mailServiceA.getMessage()));
	 
	 
	
	}
	@Test
	public void test2(){
		assertTrue("MESSAGE POUR SERVICE MAIL B".equals(mailServiceB.getMessage()));
		
	}
	@Test
	public void test3(){
		mailServiceA.sendMail(new Employee());
		mailServiceB.sendMail(new Employee());
	}
	
	@Test
	public void test4(){
		employeeService.findAllEmployees();
	}
	
	@Test
	public void Test5() {
		employeeService.saveEmployee(new Employee("123456"));
		employeeService.findBySsn("123456");
	}
	@Test
	public void test6() {
		employeeJdbcService.employeeRepository.saveEmployee(new Employee("BENGHAL", "AYOUB"));
		test7();
	}
	
	public void test7() {
		assertTrue(!employeeJdbcService.employeeRepository.findAllEmployees().equals(null));
	}
	@Test
	public void test8() {
		employeeJdbcService.employeeRepository.updateEmployee(new Employee(1L,"12345"));
		test7();
	}
	@Test
	public void test9() {
		
		assertTrue(!employeeJdbcService.employeeRepository.findBySsn("12345").equals(null));
		
	}

}
