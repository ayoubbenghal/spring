package fr.dta.spring.annotations.employee.service;

import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.dta.spring.annotations.employee.model.Employee;





/**
 * @author Ayoub Benghal
 * 
 * ayoub.benghal@gmail.com
 *
 *
 * 2017
 * 
 * Service avec un profile NON JDBC 
 *
 *
 * EmployeeStubService.java
 */
@Service
@Profile(value="!JDBC")
public class EmployeeStubService implements EmployeeService{
	

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.employee.service.EmployeeService#saveEmployee(fr.dta.spring.annotations.employee.model.Employee)
	 */
	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.employee.service.EmployeeService#findAllEmployees()
	 */
	@Override
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.employee.service.EmployeeService#findBySsn(java.lang.String)
	 */
	@Override
	public Employee findBySsn(String ssn) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.employee.service.EmployeeService#updateEmployee(fr.dta.spring.annotations.employee.model.Employee)
	 */
	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.employee.service.EmployeeService#findLastHired()
	 */
	@Override
	public Employee findLastHired() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.employee.service.EmployeeService#deleteAll()
	 */
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.employee.service.EmployeeService#saveListEmployee(java.util.List)
	 */
	@Override
	public void saveListEmployee(List<Employee> employeess) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.employee.service.EmployeeService#updateUserName(fr.dta.spring.annotations.employee.model.Employee)
	 */
	@Override
	public void updateUserName(Employee employee) {
		// TODO Auto-generated method stub
		
	}

}
