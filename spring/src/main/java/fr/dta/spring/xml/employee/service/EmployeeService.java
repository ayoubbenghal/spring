package fr.dta.spring.xml.employee.service;

import java.util.List;

import fr.dta.spring.xml.employee.model.Employee;

public interface EmployeeService {
	void saveEmployee(Employee employee);

	List<Employee> findAllEmployees();
	Employee findBySsn(String ssn);
	void updateEmployee(Employee employee);
	Employee findLastHired();
	
	
}
