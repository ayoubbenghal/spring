package fr.dta.spring.annotations.employee.service;

import java.util.List;

import fr.dta.spring.annotations.employee.model.Employee;



public interface EmployeeService {
	void saveEmployee(Employee employee);

	List<Employee> findAllEmployees();
	Employee findBySsn(String ssn);
	void updateEmployee(Employee employee);
	Employee findLastHired();
	
	
}
