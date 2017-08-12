package fr.dta.spring.annotations.employee.test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import fr.dta.spring.annotations.App;
import fr.dta.spring.annotations.employee.model.Employee;
import fr.dta.spring.annotations.employee.service.EmployeeJdbcService;

public class TestDeleteCreateReadEmployee {

	AbstractApplicationContext context;
	EmployeeJdbcService employeeJdbcService;
	List<Employee>employees;
	

	@Before
	public void before(){
		
		
		
		System.setProperty("spring.profiles.active", "JDBC");
		context=new AnnotationConfigApplicationContext(App.class);
		employeeJdbcService=(EmployeeJdbcService)context.getBean("employeeJdbcService");
		employees= new ArrayList<>();
		employees.add(new Employee("BENGHAL", "AYOUB"));
		employees.add(new Employee("BENGHAL", "IMEN"));
		employees.add(new Employee("BENGHAL","RITA"));
	}
	
	
	@Test
	public void test0() {
		employeeJdbcService.employeeRepository.deleteAll();
		assertTrue(employeeJdbcService.employeeRepository.findAllEmployees().size()==0);
	}

	
	
	@Test
	public void test1() {
		employeeJdbcService.employeeRepository.saveListEmployee(employees);		
	}
	
	@Test 
	public void test2() {
		int empsDbSize=employeeJdbcService.employeeRepository.findAllEmployees().size();
		int empsSize=employees.size();
		assertTrue(empsDbSize==empsSize);
	}
	
	
	

}
