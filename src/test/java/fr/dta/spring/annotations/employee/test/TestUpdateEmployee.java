package fr.dta.spring.annotations.employee.test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import fr.dta.spring.annotations.App;
import fr.dta.spring.annotations.employee.model.Employee;
import fr.dta.spring.annotations.employee.service.EmployeeJdbcService;

public class TestUpdateEmployee {

	AbstractApplicationContext context;
	EmployeeJdbcService employeeJdbcService;
	

	@Before
	public void before(){
		
		
		
		System.setProperty("spring.profiles.active", "JDBC");
		context=new AnnotationConfigApplicationContext(App.class);
		employeeJdbcService=(EmployeeJdbcService)context.getBean("employeeJdbcService");
	}
	
	@Test
	public void test1() {
		employeeJdbcService.employeeRepository.updateEmployee(new Employee(1L,new BigDecimal(4000),"12345"));
		employeeJdbcService.employeeRepository.updateEmployee(new Employee(2L,new BigDecimal(5000),"123456"));
		employeeJdbcService.employeeRepository.updateEmployee(new Employee(3L,new BigDecimal(5000),"1234567"));

		
	}
	@Test
	public void test2() {
		assertTrue(employeeJdbcService.employeeRepository.findAllEmployees().size()==3);
	}
	
	@Test
	public void test3() {
		
		assertTrue(!employeeJdbcService.employeeRepository.findBySsn("12345").equals(null));
		
	}
	
	@Test
	public void test4() {
		employeeJdbcService.employeeRepository.updateUserName(new Employee(1L, "ayoub"));
		employeeJdbcService.employeeRepository.updateUserName(new Employee(2L, "imen"));
		employeeJdbcService.employeeRepository.updateUserName(new Employee(3L, "rita"));

	}


}
