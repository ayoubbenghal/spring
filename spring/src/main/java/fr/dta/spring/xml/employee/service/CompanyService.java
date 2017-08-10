package fr.dta.spring.xml.employee.service;

public class CompanyService {
	private EmployeeService employeeService;

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
