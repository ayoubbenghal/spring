package fr.dta.spring.annotations.employee.service;

import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author Ayoub Benghal
 * 
 * ayoub.benghal@gmail.com
 *
 *
 * 2017
 * 
 * 
 *
 *
 * CompanyService.java
 */
public class CompanyService {
	
	/**
	 *CompanyService.java
	 * employeeService
	 */
	private EmployeeService employeeService;
	/**
	 * Constructor With : 
	 * @param employeeService
	 * Injection du bean @see {@link EmployeeService} par constructeur
	 */
	@Autowired
	public CompanyService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	
	

}
