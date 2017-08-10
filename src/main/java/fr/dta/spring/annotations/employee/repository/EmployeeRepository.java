package fr.dta.spring.annotations.employee.repository;

import java.util.List;

import fr.dta.spring.xml.employee.model.Employee;

public interface EmployeeRepository {
	void saveEmployee(Employee employee);

	List<Employee> findAllEmployees();

	Employee findBySsn(String ssn);

	void updateEmployee(Employee employee);
}
