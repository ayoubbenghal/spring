package fr.dta.spring.annotations.employee.repository;

import java.util.List;

import fr.dta.spring.annotations.employee.model.Employee;



public interface EmployeeRepository {
	void saveEmployee(Employee employee);

	List<Employee> findAllEmployees();

	Employee findBySsn(String ssn);

	void updateEmployee(Employee employee);
	void deleteAll();
	void saveListEmployee(List<Employee> employeess);
	void updateUserName(Employee employee);
}
