package fr.dta.spring.annotations.employee.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import fr.dta.spring.annotations.employee.model.Employee;


/**
 * @author Ayoub Benghal
 * 
 * ayoub.benghal@gmail.com
 *
 *
 * 2017
 * 
 * Respository pour les requétes vers la base de donnée avec un profile NON JDBC
 *
 *
 * EmployeeBeanRepository.java
 */
@Repository
@Profile(value = { "!JDBC" })
public class EmployeeBeanRepository implements EmployeeRepository{
	
	private List<Employee> listEmployees;
	
	
	/**
	 * Constructor With No Parameters
	 */
	public EmployeeBeanRepository() {
		
		listEmployees=new ArrayList<>();
		listEmployees.add(new Employee(15L,"AYOUB","BENGHAL"));
		listEmployees.add(new Employee(16L,"IMEN","BENGHAL"));
	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.employee.repository.EmployeeRepository#saveEmployee(fr.dta.spring.annotations.employee.model.Employee)
	 */
	@Override
	public void saveEmployee(Employee employee) {
		System.out.println("SAVE");
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.employee.repository.EmployeeRepository#findAllEmployees()
	 */
	@Override
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.employee.repository.EmployeeRepository#findBySsn(java.lang.String)
	 */
	@Override
	public Employee findBySsn(String ssn) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.employee.repository.EmployeeRepository#updateEmployee(fr.dta.spring.annotations.employee.model.Employee)
	 */
	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.employee.repository.EmployeeRepository#deleteAll()
	 */
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.employee.repository.EmployeeRepository#saveListEmployee(java.util.List)
	 */
	@Override
	public void saveListEmployee(List<Employee> employeess) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.employee.repository.EmployeeRepository#updateUserName(fr.dta.spring.annotations.employee.model.Employee)
	 */
	@Override
	public void updateUserName(Employee employee) {
		// TODO Auto-generated method stub
		
	}

}
