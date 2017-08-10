package fr.dta.spring.annotations.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.dta.spring.xml.employee.model.Employee;
import fr.dta.spring.xml.employee.repository.EmployeeRepository;
@Service
@Profile(value={"!WRONG"})
public class EmployeeMockService implements EmployeeService{
	
	private EmployeeRepository employeeRepository;
	
	
	@Autowired
	public EmployeeMockService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findBySsn(String ssn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

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
	

}
