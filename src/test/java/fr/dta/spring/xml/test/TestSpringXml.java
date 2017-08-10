package fr.dta.spring.xml.test;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.dta.spring.xml.employee.repository.EmployeeBeanRepository;
import fr.dta.spring.xml.employee.service.CompanyService;
import fr.dta.spring.xml.employee.service.EmployeeMockService;
import fr.dta.spring.xml.employee.service.EmployeeService;

public class TestSpringXml {
	AbstractApplicationContext context ;
	
	@Before
	public void before(){
		context= new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	

	@Test
	public void test1() {
		
		context.getBean("employeeRepository");
		
		// employeeMockService.getEmployeeRepository().findAllEmployees();
		 
		
		 
		
	}
	@Test
	public void test2(){
		
		 EmployeeMockService employeeMockService =(EmployeeMockService) context.getBean("employeeMockService");
			//employeeBeanRepository.
			 employeeMockService.findLastHired();
	}
	@Test
	public void test3(){
		
		 CompanyService companyService=(CompanyService) context.getBean("companyService");
		 companyService.getEmployeeService().findAllEmployees();
	}
	
	 
	@Test
	public void test4(){
		
	}
	

}
