package fr.dta.spring.annotations.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.dta.spring.annotations.employee.model.Employee;
import fr.dta.spring.annotations.employee.repository.EmployeeRepository;

/**
 * @author Ayoub Benghal
 * 
 * ayoub.benghal@gmail.com
 *
 *
 * 2017
 *
 *
 * Service avec un profil JDBC
 *
 * EmployeeJdbcService.java
 */
@Service
@Profile(value={"JDBC"})
public class EmployeeJdbcService implements EmployeeService{
	
	
	/**
	 *EmployeeJdbcService.java
	 * employeeRepository
	 * Injection du Bean @see {@link EmployeeRepository} par attribut
	 */
	@Autowired
	public EmployeeRepository employeeRepository;

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.employee.service.EmployeeService#saveEmployee(fr.dta.spring.annotations.employee.model.Employee)
	 */
	@Override
	public void saveEmployee(Employee employee) {
			employeeRepository.saveEmployee(employee);
	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.employee.service.EmployeeService#findAllEmployees()
	 */
	@Override
	public List<Employee> findAllEmployees() {
		return employeeRepository.findAllEmployees();
	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.employee.service.EmployeeService#findBySsn(java.lang.String)
	 */
	@Override
	public Employee findBySsn(String ssn) {
		return employeeRepository.findBySsn(ssn);
	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.employee.service.EmployeeService#updateEmployee(fr.dta.spring.annotations.employee.model.Employee)
	 */
	@Override
	public void updateEmployee(Employee employee) {
		employeeRepository.updateEmployee(employee);
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
		employeeRepository.deleteAll();
	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.employee.service.EmployeeService#saveListEmployee(java.util.List)
	 */
	@Override
	public void saveListEmployee(List<Employee> employeess) {
		employeeRepository.saveListEmployee(employeess);
	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.employee.service.EmployeeService#updateUserName(fr.dta.spring.annotations.employee.model.Employee)
	 */
	@Override
	public void updateUserName(Employee employee) {
		employeeRepository.updateUserName(employee);
	}
	


	
	

}
