package fr.dta.spring.annotations.employee.service;

import org.springframework.beans.factory.annotation.Autowired;

public class CompanyService {
	private EmployeeService employeeService;
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
