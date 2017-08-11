package fr.dta.spring.annotations.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.dta.spring.annotations.employee.repository.EmployeeRepository;

@Service
public class EmployeeJdbcService {
	
	
	@Autowired
	public EmployeeRepository employeeRepository;
	


	
	

}
