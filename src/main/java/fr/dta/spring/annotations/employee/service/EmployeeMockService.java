package fr.dta.spring.annotations.employee.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.dta.spring.annotations.employee.model.Employee;
import fr.dta.spring.annotations.employee.model.EmployeeNotFoundException;
import fr.dta.spring.annotations.employee.repository.EmployeeRepository;


@Service
@Profile(value={"!WRONG"})
public class EmployeeMockService implements EmployeeService{
	List<Employee> employees;
	
	private EmployeeRepository employeeRepository;
	
	
	@Autowired
	public EmployeeMockService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
		employees=new ArrayList<>();
	}

	@Override
	public void saveEmployee(Employee employee) {
		employees.add(employee);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		return employees;
	}

	@Override
	public Employee findBySsn(String ssn) {
		 Optional<Employee> opt = findAllEmployees().stream().filter(e->e.getIdSecu().equals(ssn)).findFirst();
		if(opt.isPresent()) {
			return opt.get();
		}else {
			throw new EmployeeNotFoundException();
		}
		
		
		// TODO Auto-generated method stub
		
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
