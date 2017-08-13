package fr.dta.spring.annotations.employee.service;

import java.util.List;

import fr.dta.spring.annotations.employee.dao.EmployeeJdbcRepository;
import fr.dta.spring.annotations.employee.model.Employee;
import fr.dta.spring.annotations.employee.repository.EmployeeBeanRepository;




/**
 * @author Ayoub Benghal
 * 
 * ayoub.benghal@gmail.com
 *
 *
 * 2017
 * 
 * Interface de service
 *
 *
 * EmployeeService.java
 */
public interface EmployeeService {
	
	/**
	 * @param employee
	 * 
	 * Service appelant le bean @see {@link EmployeeBeanRepository} OU @see {@link EmployeeJdbcRepository}
	 * 
	 * pour enregistrer dans la DataBase
	 */
	void saveEmployee(Employee employee);

	/**
	 * @return {@link List} {@link Employee}
	 * 
	 * Service appelant le bean @see {@link EmployeeBeanRepository} OU @see {@link EmployeeJdbcRepository}
	 * 
	 * pour rechercher dans la DataBase
	 */
	List<Employee> findAllEmployees();
	/**
	 * @param ssn
	 * 
	 * @return {@link List}{@link Employee}
	 * 
	 * Service appelant le bean @see {@link EmployeeBeanRepository} OU @see {@link EmployeeJdbcRepository}
	 * 
	 * pour rechercher dans la DataBase par numero de securite sociale
	 */
	Employee findBySsn(String ssn);
	/**
	 * @param employee
	 * 
	 * Service appelant le bean @see {@link EmployeeBeanRepository} OU @see {@link EmployeeJdbcRepository}
	 * 
	 * pour modifier dans la DataBase un employee
	 */
	void updateEmployee(Employee employee);
	/**
	 * @return {@link Employee}
	 * 
	 * Service appelant le bean @see {@link EmployeeBeanRepository} OU @see {@link EmployeeJdbcRepository}
	 * 
	 * pour rechercher dans la DataBase le dernier embauché
	 */
	Employee findLastHired();
	
	/**
	 * 
	 * void
	 * Service appelant le bean @see {@link EmployeeBeanRepository} OU @see {@link EmployeeJdbcRepository}
	 * pour supprimer tous les employés
	 *
	 */
	void deleteAll();
	
	/**
	 * @param employeess
	 * void
	 * Service appelant le bean @see {@link EmployeeBeanRepository} OU @see {@link EmployeeJdbcRepository}
	 * pour ajouter une liste d'employés
	 *
	 */
	void saveListEmployee(List<Employee> employeess);
	/**
	 * @param employee
	 * void
	 * Service appelant le bean @see {@link EmployeeBeanRepository} OU @see {@link EmployeeJdbcRepository}
	 * pour modifier le pseudo d'un employé
	 *
	 *
	 */
	void updateUserName(Employee employee);
	
	
}
