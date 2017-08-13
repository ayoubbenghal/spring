package fr.dta.spring.annotations.employee.repository;

import java.util.List;

import fr.dta.spring.annotations.employee.model.Employee;




/**
 * @author Ayoub Benghal
 * 
 * ayoub.benghal@gmail.com
 *
 *
 * 2017
 * 
 * Interface Repository pour les employés de la base de donnés 
 *
 *
 * EmployeeRepository.java
 */
public interface EmployeeRepository {
	/**
	 * @param employee
	 * Enregistrer un employee 
	 * 
	 */
	void saveEmployee(Employee employee);

	/**
	 * @return List<Employee> 
	 * retourner la liste des employees dans une liste
	 */
	List<Employee> findAllEmployees();

	/**
	 * @param ssn
	 * @return Employee
	 * Retrouver un employé à partir de son numero de securité social 
	 */
	Employee findBySsn(String ssn);

	/**
	 * @param employee
	 * Modifier les informations d'un employé
	 */
	void updateEmployee(Employee employee);
	/**
	 * Supprimer tous les employés
	 */
	void deleteAll();
	/**
	 * @param employeess
	 * Enregistré une liste d'employés 
	 */
	void saveListEmployee(List<Employee> employeess);
	/**
	 * @param employee
	 * Modifier le pseudo d'un employé
	 */
	void updateUserName(Employee employee);
}
