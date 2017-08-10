package fr.dta.spring.annotations.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import fr.dta.spring.annotations.App;
import fr.dta.spring.annotations.employee.model.Employee;
import fr.dta.spring.annotations.employee.service.MailService;
import static org.junit.Assert.*;

public class TestSpringAnnotations {

	AbstractApplicationContext context;
	MailService mailServiceA;
	MailService mailServiceB;

	@Before
	public void before(){
		context=new AnnotationConfigApplicationContext(App.class);
		mailServiceA= (MailService) context.getBean("mailService");
		mailServiceA.setMessage("MESSAGE POUR SERVICE MAIL A");
		mailServiceB=(MailService) context.getBean("mailService");
		mailServiceB.setMessage("MESSAGE POUR SERVICE MAIL B");
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
		
	}

}
