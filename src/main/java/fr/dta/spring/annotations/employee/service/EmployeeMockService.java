package fr.dta.spring.annotations.employee.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.dta.spring.annotations.employee.model.Employee;
import fr.dta.spring.annotations.employee.model.EmployeeNotFoundException;
import fr.dta.spring.annotations.employee.repository.EmployeeRepository;



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
 * EmployeeMockService.java
 */
@Service
@Profile(value={"!JDBC"})
public class EmployeeMockService implements EmployeeService{
	List<Employee> employees;
	
	private EmployeeRepository employeeRepository;
	
	
	/**
	 * Constructor With : 
	 * @param employeeRepository
	 * Injection du bean @see {@link EmployeeRepository} par constructeur
	 */
	@Autowired
	public EmployeeMockService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
		employees=new ArrayList<>();
	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.employee.service.EmployeeService#saveEmployee(fr.dta.spring.annotations.employee.model.Employee)
	 */
	@Override
	public void saveEmployee(Employee employee) {
		employees.add(employee);
		
	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.employee.service.EmployeeService#findAllEmployees()
	 */
	@Override
	public List<Employee> findAllEmployees() {
		return employees;
	}

	/* (non-Javadoc)
	 * @see fr.dta.spring.annotations.employee.service.EmployeeService#findBySsn(java.lang.String)
	 */
	
	
	/** 
	 * throw {@link RuntimeException} si le numero de securite social n existe pas
	 */
	@Override
	public Employee findBySsn(String ssn) {
		 Optional<Employee> opt = findAllEmployees().stream().filter(e->e.getIdSecu().equals(ssn)).findFirst();
		if(opt.isPresent()) {
			return opt.get();
		}else {
			throw new EmployeeNotFoundException();
		}
		
		
		
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

	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
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
