package fr.dta.spring.xml.employee.repository;

import java.util.ArrayList;
import java.util.List;

import fr.dta.spring.xml.employee.model.Employee;

public class EmployeeBeanRepository implements EmployeeRepository{
	
	private List<Employee> listEmployees;
	
	
	public EmployeeBeanRepository() {
		
		listEmployees=new ArrayList<>();
		listEmployees.add(new Employee(15L,"AYOUB","BENGHAL"));
		listEmployees.add(new Employee(16L,"IMEN","BENGHAL"));
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

}
